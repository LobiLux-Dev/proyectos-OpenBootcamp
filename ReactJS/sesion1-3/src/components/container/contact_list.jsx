import React from 'react'
import { Contact } from '../../models/contact.class'
import ContactComponent from '../pure/contact'

const ContactListComponent = () => {
  const contact = new Contact('John', 'Doe', 'johndoe@domain.com', true)

  return (
    <div>
      <h1>Lista de Contactos</h1>
      <ContactComponent contact={contact} />
    </div>
  )
}

export default ContactListComponent
