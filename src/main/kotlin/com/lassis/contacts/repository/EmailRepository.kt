package com.lassis.contacts.repository

import com.lassis.contacts.entity.Email
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository

@Repository
interface EmailRepository : PagingAndSortingRepository<Email, Long> {
    fun existsByContactIdAndId(contactId: Long, emailId: Long): Boolean
    fun findByContactId(contactId: Long, pageable: Pageable): Page<Email>
}
