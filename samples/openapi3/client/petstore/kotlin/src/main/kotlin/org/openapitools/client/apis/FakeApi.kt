/**
* OpenAPI Petstore
* This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
*
* OpenAPI spec version: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.apis

import org.openapitools.client.models.Client
import org.openapitools.client.models.FileSchemaTestClass
import org.openapitools.client.models.HealthCheckResult
import org.openapitools.client.models.OuterComposite
import org.openapitools.client.models.User

import org.openapitools.client.infrastructure.*

class FakeApi(basePath: kotlin.String = "http://petstore.swagger.io:80/v2") : ApiClient(basePath) {

    /**
    * Health check endpoint
    * 
    * @return HealthCheckResult
    */
    @Suppress("UNCHECKED_CAST")
    fun fakeHealthGet() : HealthCheckResult {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/fake/health",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<HealthCheckResult>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as HealthCheckResult
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * 
    * Test serialization of outer boolean types
    * @param body Input boolean as post body (optional)
    * @return kotlin.Boolean
    */
    @Suppress("UNCHECKED_CAST")
    fun fakeOuterBooleanSerialize(body: kotlin.Boolean) : kotlin.Boolean {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/fake/outer/boolean",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Boolean>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Boolean
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * 
    * Test serialization of object with outer number type
    * @param outerComposite Input composite as post body (optional)
    * @return OuterComposite
    */
    @Suppress("UNCHECKED_CAST")
    fun fakeOuterCompositeSerialize(outerComposite: OuterComposite) : OuterComposite {
        val localVariableBody: kotlin.Any? = outerComposite
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/fake/outer/composite",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<OuterComposite>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as OuterComposite
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * 
    * Test serialization of outer number types
    * @param body Input number as post body (optional)
    * @return java.math.BigDecimal
    */
    @Suppress("UNCHECKED_CAST")
    fun fakeOuterNumberSerialize(body: java.math.BigDecimal) : java.math.BigDecimal {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/fake/outer/number",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<java.math.BigDecimal>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as java.math.BigDecimal
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * 
    * Test serialization of outer string types
    * @param body Input string as post body (optional)
    * @return kotlin.String
    */
    @Suppress("UNCHECKED_CAST")
    fun fakeOuterStringSerialize(body: kotlin.String) : kotlin.String {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/fake/outer/string",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.String>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.String
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * 
    * For this test, the body for this request much reference a schema named &#x60;File&#x60;.
    * @param fileSchemaTestClass  
    * @return void
    */
    fun testBodyWithFileSchema(fileSchemaTestClass: FileSchemaTestClass) : Unit {
        val localVariableBody: kotlin.Any? = fileSchemaTestClass
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/fake/body-with-file-schema",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Any?>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * 
    * 
    * @param query  
    * @param user  
    * @return void
    */
    fun testBodyWithQueryParams(query: kotlin.String, user: User) : Unit {
        val localVariableBody: kotlin.Any? = user
        val localVariableQuery: MultiValueMap = mapOf("query" to listOf("$query"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/fake/body-with-query-params",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Any?>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * To test \&quot;client\&quot; model
    * To test \&quot;client\&quot; model
    * @param client client model 
    * @return Client
    */
    @Suppress("UNCHECKED_CAST")
    fun testClientModel(client: Client) : Client {
        val localVariableBody: kotlin.Any? = client
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.PATCH,
            "/fake",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Client>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Client
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
    * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
    * @param number None 
    * @param double None 
    * @param patternWithoutDelimiter None 
    * @param byte None 
    * @param integer None (optional, default to null)
    * @param int32 None (optional, default to null)
    * @param int64 None (optional, default to null)
    * @param float None (optional, default to null)
    * @param string None (optional, default to null)
    * @param binary None (optional, default to null)
    * @param date None (optional, default to null)
    * @param dateTime None (optional, default to null)
    * @param password None (optional, default to null)
    * @param paramCallback None (optional, default to null)
    * @return void
    */
    fun testEndpointParameters(number: java.math.BigDecimal, double: kotlin.Double, patternWithoutDelimiter: kotlin.String, byte: kotlin.ByteArray, integer: kotlin.Int, int32: kotlin.Int, int64: kotlin.Long, float: kotlin.Float, string: kotlin.String, binary: java.io.File, date: java.time.LocalDateTime, dateTime: java.time.LocalDateTime, password: kotlin.String, paramCallback: kotlin.String) : Unit {
        val localVariableBody: kotlin.Any? = mapOf("integer" to "$integer", "int32" to "$int32", "int64" to "$int64", "number" to "$number", "float" to "$float", "double" to "$double", "string" to "$string", "pattern_without_delimiter" to "$patternWithoutDelimiter", "byte" to "$byte", "binary" to "$binary", "date" to "$date", "dateTime" to "$dateTime", "password" to "$password", "callback" to "$paramCallback")
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Content-Type" to "multipart/form-data")
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/fake",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Any?>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * To test enum parameters
    * To test enum parameters
    * @param enumHeaderStringArray Header parameter enum test (string array) (optional, default to null)
    * @param enumHeaderString Header parameter enum test (string) (optional, default to -efg)
    * @param enumQueryStringArray Query parameter enum test (string array) (optional, default to null)
    * @param enumQueryString Query parameter enum test (string) (optional, default to -efg)
    * @param enumQueryInteger Query parameter enum test (double) (optional, default to null)
    * @param enumQueryDouble Query parameter enum test (double) (optional, default to null)
    * @param enumFormStringArray Form parameter enum test (string array) (optional, default to $)
    * @param enumFormString Form parameter enum test (string) (optional, default to -efg)
    * @return void
    */
    fun testEnumParameters(enumHeaderStringArray: kotlin.Array<kotlin.String>, enumHeaderString: kotlin.String, enumQueryStringArray: kotlin.Array<kotlin.String>, enumQueryString: kotlin.String, enumQueryInteger: kotlin.Int, enumQueryDouble: kotlin.Double, enumFormStringArray: kotlin.Array<kotlin.String>, enumFormString: kotlin.String) : Unit {
        val localVariableBody: kotlin.Any? = mapOf("enum_form_string_array" to "$enumFormStringArray", "enum_form_string" to "$enumFormString")
        val localVariableQuery: MultiValueMap = mapOf("enum_query_string_array" to toMultiValue(enumQueryStringArray.toList(), "multi"), "enum_query_string" to listOf("$enumQueryString"), "enum_query_integer" to listOf("$enumQueryInteger"), "enum_query_double" to listOf("$enumQueryDouble"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Content-Type" to "multipart/form-data", "enum_header_string_array" to enumHeaderStringArray.joinToString(separator = collectionDelimiter("csv")), "enum_header_string" to enumHeaderString.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/fake",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Any?>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Fake endpoint to test group parameters (optional)
    * Fake endpoint to test group parameters (optional)
    * @param requiredStringGroup Required String in group parameters 
    * @param requiredBooleanGroup Required Boolean in group parameters 
    * @param requiredInt64Group Required Integer in group parameters 
    * @param stringGroup String in group parameters (optional, default to null)
    * @param booleanGroup Boolean in group parameters (optional, default to null)
    * @param int64Group Integer in group parameters (optional, default to null)
    * @return void
    */
    fun testGroupParameters(requiredStringGroup: kotlin.Int, requiredBooleanGroup: kotlin.Boolean, requiredInt64Group: kotlin.Long, stringGroup: kotlin.Int, booleanGroup: kotlin.Boolean, int64Group: kotlin.Long) : Unit {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("required_string_group" to listOf("$requiredStringGroup"), "required_int64_group" to listOf("$requiredInt64Group"), "string_group" to listOf("$stringGroup"), "int64_group" to listOf("$int64Group"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("required_boolean_group" to requiredBooleanGroup.toString(), "boolean_group" to booleanGroup.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/fake",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Any?>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * test inline additionalProperties
    * 
    * @param requestBody request body 
    * @return void
    */
    fun testInlineAdditionalProperties(requestBody: kotlin.collections.Map<kotlin.String, kotlin.String>) : Unit {
        val localVariableBody: kotlin.Any? = requestBody
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/fake/inline-additionalProperties",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Any?>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * test json serialization of form data
    * 
    * @param param field1 
    * @param param2 field2 
    * @return void
    */
    fun testJsonFormData(param: kotlin.String, param2: kotlin.String) : Unit {
        val localVariableBody: kotlin.Any? = mapOf("param" to "$param", "param2" to "$param2")
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Content-Type" to "multipart/form-data")
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/fake/jsonFormData",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Any?>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

}
