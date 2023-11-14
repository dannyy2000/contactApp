require("dotenv").config();
const express = require("express");
const app = express();
const path = require("path");
const connectDb = require("./config/dbConnections");
const { default: mongoose } = require("mongoose");
const PORT = process.env.PORT || 8080;
const cors = require("cors");
const corsOptions = require("./config/corsOptions");
const cookieparser = require("cookie-parser");
const credentials = require("./middleware/credentials");
const verifyJwt = require("./middleware/verifyJwt");

connectDb();
app.use(cors(corsOptions));
app.use(express.urlencoded({ extended: false }));
app.use(express.json());
app.use(credentials);
app.use(cookieparser());

app.use("/register", require("./routes/api/register"));
app.use("/auth", require("./routes/api/login"));
app.use("/refresh", require("./routes/api/refresh"));
app.use("/logout", require("./routes/api/logout"));
app.use(verifyJwt);

app.use("/contact", require("./routes/contact"));

mongoose.connection.once("open", () => {
  console.log("Connected to MongoDb");

  app.listen(PORT, () => console.log(`Server is running on port ${PORT}`));
});
