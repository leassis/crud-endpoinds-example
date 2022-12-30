package com.lassis.contacts.entity

import com.lassis.springframework.crud.entity.WithId
import javax.persistence.*
import javax.validation.constraints.Email
import javax.validation.constraints.NotBlank

@Entity
@Table(name = "emails")
class Email(
    @JvmField @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?,

    @get:NotBlank
    @get:Email
    var address: String,

    @ManyToOne(optional = false, cascade = [CascadeType.ALL])
    var contact: Contact?

) : WithId<Long?> {

    override fun getId(): Long? = id
}
