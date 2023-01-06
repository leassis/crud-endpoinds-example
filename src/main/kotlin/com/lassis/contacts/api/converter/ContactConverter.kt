package com.lassis.contacts.api.converter

import com.lassis.contacts.api.model.ContactInfo
import com.lassis.contacts.entity.Contact
import com.lassis.springframework.crud.service.SingleDtoConverter
import org.springframework.stereotype.Component

@Component
class ContactConverter(val emailConverter: EmailConverter, val phoneConverter: PhoneConverter) :
    SingleDtoConverter<ContactInfo, Contact> {

    override fun fromDto(obj: ContactInfo): Contact {

        val contact = Contact(
            id = obj.id,
            name = obj.name,
            nick = obj.nick,
            company = obj.company,
            street = obj.street,
            number = obj.number,
            complement = obj.complement,
            emails = obj.emails.map { emailConverter.fromDto(it) },
            phones = obj.phones.map { phoneConverter.fromDto(it) }
        )

        contact.emails.forEach { it.contact = contact }
        contact.phones.forEach { it.contact = contact }
        return contact
    }

    override fun toDto(entity: Contact) = ContactInfo(
        id = entity.id,
        name = entity.name,
        nick = entity.nick,
        company = entity.company,
        street = entity.street,
        number = entity.number,
        complement = entity.complement,
        emails = entity.emails.map { emailConverter.toDto(it) },
        phones = entity.phones.map { phoneConverter.toDto(it) }
    )

}
