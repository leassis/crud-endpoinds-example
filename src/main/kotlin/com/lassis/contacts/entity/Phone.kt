package com.lassis.contacts.entity

import com.lassis.springframework.crud.entity.WithId
import javax.persistence.*
import javax.validation.constraints.NotBlank

@Entity
@Table(name = "phones")
class Phone(
    @JvmField @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?,

    @get:NotBlank
    var number: String,

    @ManyToOne(optional = false, cascade = [CascadeType.ALL])
    var contact: Contact?

) : WithId<Long?> {
    override fun getId(): Long? = id
}
