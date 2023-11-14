const express = require("express");

const router = express.Router();
const ROLES_LIST = require("../config/roles_list");
const verifyRoles = require("../middleware/verifyRoles");

const contactController = require("../controllers/contact/contactController");

router
  .route("/")
  .post(
    verifyRoles(ROLES_LIST.User, ROLES_LIST.Admin),
    contactController.createNewContact
  )
  .put(verifyRoles(ROLES_LIST.User), contactController.updateContact)
  .get(contactController.getAllContact)
  .delete(verifyRoles(ROLES_LIST.User), contactController.deleteContact);

router.route("/:id").get(contactController.getContact);

module.exports = router;
