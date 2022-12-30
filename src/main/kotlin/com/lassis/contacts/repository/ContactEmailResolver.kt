package com.lassis.contacts.repository

import com.lassis.contacts.entity.Contact
import com.lassis.contacts.entity.Email
import com.lassis.springframework.crud.service.ParentChildResolver
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Component

@Component
class ContactEmailResolver(val contactRepository: ContactRepository, val emailRepository: EmailRepository) :
    ParentChildResolver<Contact, Email, Long> {

    override fun findParentById(parentId: Long) = contactRepository.findById(parentId)

    override fun findAllByParentId(parentId: Long, pageable: Pageable) =
        emailRepository.findByContactId(parentId, pageable)

    override fun existsByParentIdAndId(parentId: Long, childId: Long) =
        emailRepository.existsByContactIdAndId(parentId, childId)

    override fun existsByParentId(parentId: Long) = contactRepository.existsById(parentId)

    override fun setParent(parent: Contact, child: Email) {
        child.contact = parent
    }

}
