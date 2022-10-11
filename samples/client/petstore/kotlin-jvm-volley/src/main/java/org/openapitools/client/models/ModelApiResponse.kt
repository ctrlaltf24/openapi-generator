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


import com.google.gson.annotations.SerializedName
import org.openapitools.client.models.room.ModelApiResponseRoomModel
import org.openapitools.client.infrastructure.ITransformForStorage

/**
 * Describes the result of uploading an image resource
 *
 * @param code 
 * @param type 
 * @param message 
 */

data class ModelApiResponse (

    @SerializedName("code")
    val code: kotlin.Int? = null,

    @SerializedName("type")
    val type: kotlin.String? = null,

    @SerializedName("message")
    val message: kotlin.String? = null

): ITransformForStorage<ModelApiResponseRoomModel> {
    companion object { }
    override fun toRoomModel(): ModelApiResponseRoomModel =
        ModelApiResponseRoomModel(roomTableId = 0,
        code = this.code,
type = this.type,
message = this.message,
        )

}

