package com.lassis.contacts.api.model

import com.fasterxml.jackson.annotation.JsonInclude
import java.io.Serializable
import javax.validation.constraints.Email
import javax.validation.constraints.NotBlank

@JsonInclude(JsonInclude.Include.NON_NULL)
class EmailInfo(
    var id: Long?,

    @get:NotBlank @get:Email var address: String

) : Serializable
