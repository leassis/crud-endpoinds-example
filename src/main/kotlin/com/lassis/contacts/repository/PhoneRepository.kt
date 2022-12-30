package com.lassis.contacts.repository

import com.lassis.contacts.entity.Phone
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository

@Repository
interface PhoneRepository : PagingAndSortingRepository<Phone, Long> {
    fun existsByContactIdAndId(contactId: Long, id: Long): Boolean
    fun findByContactId(contactId: Long, pageable: Pageable): Page<Phone>
}
