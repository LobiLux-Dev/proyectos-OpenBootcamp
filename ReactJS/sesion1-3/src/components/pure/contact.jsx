import React, { useState } from 'react'
import PropTypes from 'prop-types'
import { Contact } from '../../models/contact.class'

const ContactComponent = ({ contact }) => {
  const [contactState, setContactState] = useState(contact)

  const handleConectedChange = () => setContactState({ ...contactState, connected: !contactState.connected })

  return (
    <div>
      <h2>
        {contactState.name} {contactState.lastName}
      </h2>
      <h3>{contactState.email}</h3>
      <p>{contactState.connected ? 'Contacto En Línea' : 'Contacto No Disponible'}</p>
      <button onClick={handleConectedChange}>Cambiar estado</button>
    </div>
  )
}

ContactComponent.propTypes = {
  contact: PropTypes.instanceOf(Contact)
}

export default ContactComponent
