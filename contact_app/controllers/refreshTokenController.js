const User = require("../model/User");

const bcrypt = require("bcrypt");

const jwt = require("jsonwebtoken");

const handleRefreshToken = async (req, res) => {
  const cookies = req.cookies;
  if (!cookies?.jwt) return res.sendStatus(401);
  console.log("This is the jwt", cookies.jwt);
  const refreshToken = cookies.jwt;
  console.log("This is the refreshToken", refreshToken);
  const foundUser = await User.findOne({ refreshToken }).exec();
  console.log("Found user", foundUser);

  if (!foundUser) return res.sendStatus(403);
  console.log(hjskksk);

  jwt.verify(refreshToken, process.env.REFRESH_TOKEN_SECRET, (err, decoded) => {
    if (err || foundUser.username !== decoded.username)
      return res.sendStatus(403);

    const roles = Object.values(foundUser.roles);
    console.log(roles);

    const accessToken = jwt.sign(
      {
        userInfo: {
          username: decoded.username,
          roles: roles,
        },
      },
      process.env.ACCESS_TOKEN_SECRET,
      { expiresIn: "30s" }
    );
    res.json({ accessToken });
  });
};

module.exports = { handleRefreshToken };
