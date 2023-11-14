const mongoose = require("mongoose");
const Schema = mongoose.Schema;

const userSchema = new Schema({
  username: {
    type: String,
    required: true,
  },

  roles: {
    User: {
      type: Number,
      default: 2000,
    },
    Admin: Number,
    Editor: Number,
  },

  password: {
    type: String,
    required: true,
  },

  refreshtoken: String,
});

module.exports = mongoose.model("user", userSchema);
