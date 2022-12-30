package com.lassis.contacts.entity

import com.lassis.springframework.crud.entity.WithId
import javax.persistence.*
import javax.validation.constraints.NotBlank

@Entity
@Table(name = "contacts")
class Contact(

    @JvmField @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @get:NotBlank
    var name: String,

    var nick: String?,

    var company: String?,

    var street: String?,

    var number: String?,

    var complement: String?,

    @OneToMany(mappedBy = "contact", cascade = [CascadeType.ALL])
    var emails: List<Email>,

    @OneToMany(mappedBy = "contact", cascade = [CascadeType.ALL])
    var phones: List<Phone>

) : WithId<Long?> {
    override fun getId(): Long? = id
}
