const User = require("../model/User");
const bcrypt = require("bcrypt");

const createNewUser = async (req, res) => {
  const { user, pwd } = req.body;

  if ((!user, !pwd))
    return res
      .status(400)
      .json({ message: "username and password are required" });

  const duplicate = await User.findOne({ username: user }).exec();

  if (duplicate) return res.sendStatus(409);

  try {
    const hashedPwd = await bcrypt.hash(pwd, 10);
    const result = User.create({
      username: user,
      password: hashedPwd,
    });

    console.log(result);
    res.status(201).json({ success: `New user ${user} created` });
  } catch (error) {
    res.status(500).json({ message: error.message });
  }
};

module.exports = { createNewUser };
