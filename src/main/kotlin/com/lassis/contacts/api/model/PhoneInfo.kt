package com.lassis.contacts.api.model

import com.fasterxml.jackson.annotation.JsonInclude
import java.io.Serializable
import javax.validation.constraints.NotBlank

@JsonInclude(JsonInclude.Include.NON_NULL)
class PhoneInfo(
    var id: Long?,

    @get:NotBlank var number: String

) : Serializable
