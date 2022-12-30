package com.lassis.contacts.repository

import com.lassis.contacts.entity.Contact
import com.lassis.contacts.entity.Phone
import com.lassis.springframework.crud.service.ParentChildResolver
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Component

@Component
class ContactPhoneResolver(val contactRepository: ContactRepository, val phoneRepository: PhoneRepository) :
    ParentChildResolver<Contact, Phone, Long> {

    override fun findParentById(parentId: Long) =
        contactRepository.findById(parentId)


    override fun findAllByParentId(parentId: Long, pageable: Pageable) =
        phoneRepository.findByContactId(parentId, pageable)

    override fun existsByParentIdAndId(parentId: Long, childId: Long) =
        phoneRepository.existsByContactIdAndId(parentId, childId)

    override fun existsByParentId(parentId: Long) =
        contactRepository.existsById(parentId)

    override fun setParent(parent: Contact, child: Phone) {
        child.contact = parent
    }

}
