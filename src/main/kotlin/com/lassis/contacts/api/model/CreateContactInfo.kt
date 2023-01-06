package com.lassis.contacts.api.model

import com.fasterxml.jackson.annotation.JsonInclude
import java.io.Serializable
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotEmpty

@JsonInclude(JsonInclude.Include.NON_NULL)
class CreateContactInfo(
    @get:NotBlank
    var name: String,

    @get:NotEmpty
    var emails: List<String>,

    @get:NotEmpty
    var phones: List<String>

) : Serializable
