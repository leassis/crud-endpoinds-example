package com.lassis.contacts.api.converter

import com.lassis.contacts.api.model.PhoneInfo
import com.lassis.contacts.entity.Phone
import com.lassis.springframework.crud.service.SingleDtoConverter
import org.springframework.stereotype.Component

@Component
class PhoneConverter : SingleDtoConverter<PhoneInfo, Phone> {
    override fun fromDto(obj: PhoneInfo) = Phone(obj.id, obj.number, null)

    override fun toDto(entity: Phone) = PhoneInfo(entity.id, entity.number)
}
