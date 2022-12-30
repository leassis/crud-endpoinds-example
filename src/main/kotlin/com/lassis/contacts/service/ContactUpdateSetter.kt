package com.lassis.contacts.service

import com.lassis.contacts.entity.Contact
import com.lassis.springframework.crud.service.UpdateValuesSetter
import org.springframework.beans.BeanUtils
import org.springframework.stereotype.Component

@Component
class ContactUpdateSetter : UpdateValuesSetter<Contact> {
    override fun update(old: Contact, nieuwe: Contact) =
        BeanUtils.copyProperties(nieuwe, old, "id", "emails", "phones")
}
