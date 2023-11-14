const User = require("../model/User");
const bcrypt = require("bcrypt");
const jwt = require("jsonwebtoken");

const handleLogin = async (req, res) => {
  const { user, pwd } = req.body;

  if ((!user, !pwd))
    return res.status(400).json("Username and password required");

  const foundUser = await User.findOne({ username: user }).exec();
  console.log(foundUser);

  if (!foundUser) return res.status(401);

  const match = await bcrypt.compare(pwd, foundUser.password);

  if (match) {
    const roles = Object.values(foundUser.roles);
    const accessToken = jwt.sign(
      {
        userInfo: {
          username: foundUser.username,
          roles: roles,
        },
      },
      process.env.ACCESS_TOKEN_SECRET,
      { expiresIn: "240s" }
    );

    const refreshtoken = jwt.sign(
      {
        userInfo: {
          username: foundUser.username,
        },
      },
      process.env.REFRESH_TOKEN_SECRET,
      { expiresIn: "1d" }
    );

    foundUser.refreshtoken = refreshtoken;
    const result = await foundUser.save();
    console.log(result);

    res.cookie("jwt", refreshtoken, {
      httpOnly: true,
      sameSite: "None",
      maxAge: 24 * 60 * 60 * 1000,
    });

    res.json({ accessToken });
  } else {
    res.sendStatus(401);
  }
};

module.exports = { handleLogin };
