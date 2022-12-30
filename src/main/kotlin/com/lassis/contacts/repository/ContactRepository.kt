package com.lassis.contacts.repository

import com.lassis.contacts.entity.Contact
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository

@Repository
interface ContactRepository : PagingAndSortingRepository<Contact, Long>
