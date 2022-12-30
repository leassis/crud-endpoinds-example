package com.lassis.contacts

import com.lassis.springframework.crud.configuration.EnableCrud
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableCrud
@EnableJpaRepositories(basePackages = ["com.lassis.contacts.repository"])
class ContactsApplication

fun main(args: Array<String>) {
    runApplication<ContactsApplication>(*args)
}
