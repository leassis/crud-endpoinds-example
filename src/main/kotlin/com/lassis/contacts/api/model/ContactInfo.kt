package com.lassis.contacts.api.model

import com.fasterxml.jackson.annotation.JsonInclude
import java.io.Serializable
import javax.validation.Valid
import javax.validation.constraints.NotBlank
@JsonInclude(JsonInclude.Include.NON_NULL)
class ContactInfo(
    var id: Long?,

    @get:NotBlank
    var name: String,

    var nick: String?,

    var company: String?,

    var street: String?,

    var number: String?,

    var complement: String?,

    @get:Valid
    var emails: List<EmailInfo>,

    @get:Valid
    var phones: List<PhoneInfo>

) : Serializable
