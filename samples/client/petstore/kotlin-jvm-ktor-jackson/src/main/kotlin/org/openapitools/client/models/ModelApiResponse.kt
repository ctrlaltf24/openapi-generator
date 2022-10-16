/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Describes the result of uploading an image resource
 *
 * @param code 
 * @param type 
 * @param message 
 */

data class ModelApiResponse (

    @field:JsonProperty("code")
    val code: kotlin.Int? = null,

    @field:JsonProperty("type")
    val type: kotlin.String? = null,

    @field:JsonProperty("message")
    val message: kotlin.String? = null

)

