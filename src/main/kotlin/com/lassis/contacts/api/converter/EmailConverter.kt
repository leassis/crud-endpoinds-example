package com.lassis.contacts.api.converter

import com.lassis.contacts.api.model.EmailInfo
import com.lassis.contacts.entity.Email
import com.lassis.springframework.crud.service.DtoConverter
import org.springframework.stereotype.Component

@Component
class EmailConverter : DtoConverter<EmailInfo, Email> {
    override fun fromDto(obj: EmailInfo) = Email(obj.id, obj.address, null)

    override fun toDto(entity: Email) = EmailInfo(entity.id, entity.address)
}
