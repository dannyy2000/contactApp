const Contact = require("../../model/Contacts");

const createNewContact = async (req, res) => {
  if (
    !req?.body?.firstname ||
    !req?.body?.lastname ||
    !req?.body?.phonenumber
  ) {
    return res
      .status(400)
      .json({ message: "firstname, lastname and phonenumber required" });
  }

  try {
    const result = await Contact.create({
      firstname: req.body.firstname,
      lastname: req.body.lastname,
      phonenumber: req.body.phonenumber,
    });

    res.status(201).json(result);

    console.log(result);
  } catch (error) {
    console.log(error);
  }
};

const updateContact = async (req, res) => {
  if (!req?.body?.id) {
    return res.status(400).json({ message: "contact id is required" });
  }

  const contact = await Contact.findOne({ _id: req.body.id }).exec();

  if (!contact) {
    return res.status(400).json({ message: "contact not found" });
  }

  if (req.body.firstname) contact.firstname = req.body.firstname;
  if (req.body.lastname) contact.lastname = req.body.lastname;
  if (req.body.phonenumber) contact.phonenumber = req.body.phonenumber;

  const result = await contact.save();
  res.json(result);
};

const getAllContact = async (req, res) => {
  const contact = await Contact.find();

  if (!contact) {
    return res.status(204).json({ message: "No contact found" });
  }

  res.json(contact);
};

const deleteContact = async (req, res) => {
  if (!req?.body?.id) {
    return res.status(400).json({ message: "contact id is required" });
  }

  const contact = await Contact.findOne({ _id: req.body.id }).exec();

  if (!contact) {
    return res.status(400).json({ message: "contact not found" });
  }

  const result = await contact.deleteOne({ _id: req.body.id });
  res.json(result);
};

const getContact = async (req, res) => {
  if (!req?.params?.id) {
    return res.status(400).json({ message: "contact id is required" });
  }

  const contact = await Contact.findOne({ _id: req.params.id }).exec();

  if (!contact) {
    return res.status(400).json({ message: "contact not found" });
  }

  res.json(contact);
};

module.exports = {
  createNewContact,
  updateContact,
  getAllContact,
  deleteContact,
  getContact,
};
