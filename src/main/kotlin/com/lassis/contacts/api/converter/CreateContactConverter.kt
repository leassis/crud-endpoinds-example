package com.lassis.contacts.api.converter

import com.lassis.contacts.api.model.ContactInfo
import com.lassis.contacts.api.model.CreateContactInfo
import com.lassis.contacts.entity.Contact
import com.lassis.contacts.entity.Email
import com.lassis.contacts.entity.Phone
import com.lassis.springframework.crud.service.DtoConverter
import org.springframework.stereotype.Component

@Component
class CreateContactConverter(val contactConverter: ContactConverter) : DtoConverter<CreateContactInfo, ContactInfo, Contact> {

    override fun fromDto(obj: CreateContactInfo): Contact {
        val contact = Contact(
                id = null,
                name = obj.name,
                nick = null,
                company = null,
                street = null,
                number = null,
                complement = null,
                emails = obj.emails.map { Email(null, it, null) },
                phones = obj.phones.map { Phone(null, it, null) }
        )

        contact.emails.forEach { it.contact = contact }
        contact.phones.forEach { it.contact = contact }
        return contact
    }

    override fun toDto(entity: Contact) = contactConverter.toDto(entity)

}
