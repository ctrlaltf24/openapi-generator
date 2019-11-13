/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Pair;

import java.math.BigDecimal;
import org.openapitools.client.model.Client;
import java.io.File;
import org.openapitools.client.model.FileSchemaTestClass;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapitools.client.model.OuterComposite;
import org.openapitools.client.model.User;
import org.openapitools.client.model.XmlItem;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.function.Consumer;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;


public class FakeApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;

  public FakeApi() {
    this(new ApiClient());
  }

  public FakeApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
  }

  /**
   * creates an XmlItem
   * this route creates an XmlItem
   * @param xmlItem XmlItem Body (required)
   * @throws ApiException if fails to make API call
   */
  public void createXmlItem(XmlItem xmlItem) throws ApiException {
    // verify the required parameter 'xmlItem' is set
    if (xmlItem == null) {
      throw new ApiException(400, "Missing the required parameter 'xmlItem' when calling createXmlItem");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/fake/create_xml_item";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(xmlItem);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }

      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw new ApiException(localVarResponse.statusCode(),
            "createXmlItem call received non-success response",
            localVarResponse.headers(),
            localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }

    } catch (IOException e) {
      throw new ApiException(e);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * 
   * Test serialization of outer boolean types
   * @param body Input boolean as post body (optional)
   * @return Boolean
   * @throws ApiException if fails to make API call
   */
  public Boolean fakeOuterBooleanSerialize(Boolean body) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/fake/outer/boolean";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(body);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }

      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw new ApiException(localVarResponse.statusCode(),
            "fakeOuterBooleanSerialize call received non-success response",
            localVarResponse.headers(),
            localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }

      return memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<Boolean>() {});
    } catch (IOException e) {
      throw new ApiException(e);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * 
   * Test serialization of object with outer number type
   * @param body Input composite as post body (optional)
   * @return OuterComposite
   * @throws ApiException if fails to make API call
   */
  public OuterComposite fakeOuterCompositeSerialize(OuterComposite body) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/fake/outer/composite";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(body);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }

      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw new ApiException(localVarResponse.statusCode(),
            "fakeOuterCompositeSerialize call received non-success response",
            localVarResponse.headers(),
            localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }

      return memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<OuterComposite>() {});
    } catch (IOException e) {
      throw new ApiException(e);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * 
   * Test serialization of outer number types
   * @param body Input number as post body (optional)
   * @return BigDecimal
   * @throws ApiException if fails to make API call
   */
  public BigDecimal fakeOuterNumberSerialize(BigDecimal body) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/fake/outer/number";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(body);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }

      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw new ApiException(localVarResponse.statusCode(),
            "fakeOuterNumberSerialize call received non-success response",
            localVarResponse.headers(),
            localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }

      return memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<BigDecimal>() {});
    } catch (IOException e) {
      throw new ApiException(e);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * 
   * Test serialization of outer string types
   * @param body Input string as post body (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String fakeOuterStringSerialize(String body) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/fake/outer/string";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(body);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }

      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw new ApiException(localVarResponse.statusCode(),
            "fakeOuterStringSerialize call received non-success response",
            localVarResponse.headers(),
            localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }

      return memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<String>() {});
    } catch (IOException e) {
      throw new ApiException(e);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * 
   * For this test, the body for this request much reference a schema named &#x60;File&#x60;.
   * @param body  (required)
   * @throws ApiException if fails to make API call
   */
  public void testBodyWithFileSchema(FileSchemaTestClass body) throws ApiException {
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling testBodyWithFileSchema");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/fake/body-with-file-schema";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(body);
      localVarRequestBuilder.method("PUT", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }

      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw new ApiException(localVarResponse.statusCode(),
            "testBodyWithFileSchema call received non-success response",
            localVarResponse.headers(),
            localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }

    } catch (IOException e) {
      throw new ApiException(e);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * 
   * 
   * @param query  (required)
   * @param body  (required)
   * @throws ApiException if fails to make API call
   */
  public void testBodyWithQueryParams(String query, User body) throws ApiException {
    // verify the required parameter 'query' is set
    if (query == null) {
      throw new ApiException(400, "Missing the required parameter 'query' when calling testBodyWithQueryParams");
    }
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling testBodyWithQueryParams");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/fake/body-with-query-params";

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("query", query));

    if (!localVarQueryParams.isEmpty()) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(body);
      localVarRequestBuilder.method("PUT", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }

      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw new ApiException(localVarResponse.statusCode(),
            "testBodyWithQueryParams call received non-success response",
            localVarResponse.headers(),
            localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }

    } catch (IOException e) {
      throw new ApiException(e);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * To test \&quot;client\&quot; model
   * To test \&quot;client\&quot; model
   * @param body client model (required)
   * @return Client
   * @throws ApiException if fails to make API call
   */
  public Client testClientModel(Client body) throws ApiException {
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling testClientModel");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/fake";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(body);
      localVarRequestBuilder.method("PATCH", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }

      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw new ApiException(localVarResponse.statusCode(),
            "testClientModel call received non-success response",
            localVarResponse.headers(),
            localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }

      return memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<Client>() {});
    } catch (IOException e) {
      throw new ApiException(e);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
   * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
   * @param number None (required)
   * @param _double None (required)
   * @param patternWithoutDelimiter None (required)
   * @param _byte None (required)
   * @param integer None (optional)
   * @param int32 None (optional)
   * @param int64 None (optional)
   * @param _float None (optional)
   * @param string None (optional)
   * @param binary None (optional)
   * @param date None (optional)
   * @param dateTime None (optional)
   * @param password None (optional)
   * @param paramCallback None (optional)
   * @throws ApiException if fails to make API call
   */
  public void testEndpointParameters(BigDecimal number, Double _double, String patternWithoutDelimiter, byte[] _byte, Integer integer, Integer int32, Long int64, Float _float, String string, File binary, LocalDate date, OffsetDateTime dateTime, String password, String paramCallback) throws ApiException {
    // verify the required parameter 'number' is set
    if (number == null) {
      throw new ApiException(400, "Missing the required parameter 'number' when calling testEndpointParameters");
    }
    // verify the required parameter '_double' is set
    if (_double == null) {
      throw new ApiException(400, "Missing the required parameter '_double' when calling testEndpointParameters");
    }
    // verify the required parameter 'patternWithoutDelimiter' is set
    if (patternWithoutDelimiter == null) {
      throw new ApiException(400, "Missing the required parameter 'patternWithoutDelimiter' when calling testEndpointParameters");
    }
    // verify the required parameter '_byte' is set
    if (_byte == null) {
      throw new ApiException(400, "Missing the required parameter '_byte' when calling testEndpointParameters");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/fake";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    try {
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }

      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw new ApiException(localVarResponse.statusCode(),
            "testEndpointParameters call received non-success response",
            localVarResponse.headers(),
            localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }

    } catch (IOException e) {
      throw new ApiException(e);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * To test enum parameters
   * To test enum parameters
   * @param enumHeaderStringArray Header parameter enum test (string array) (optional
   * @param enumHeaderString Header parameter enum test (string) (optional, default to -efg)
   * @param enumQueryStringArray Query parameter enum test (string array) (optional
   * @param enumQueryString Query parameter enum test (string) (optional, default to -efg)
   * @param enumQueryInteger Query parameter enum test (double) (optional)
   * @param enumQueryDouble Query parameter enum test (double) (optional)
   * @param enumFormStringArray Form parameter enum test (string array) (optional
   * @param enumFormString Form parameter enum test (string) (optional, default to -efg)
   * @throws ApiException if fails to make API call
   */
  public void testEnumParameters(List<String> enumHeaderStringArray, String enumHeaderString, List<String> enumQueryStringArray, String enumQueryString, Integer enumQueryInteger, Double enumQueryDouble, List<String> enumFormStringArray, String enumFormString) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/fake";

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("csv", "enum_query_string_array", enumQueryStringArray));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("enum_query_string", enumQueryString));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("enum_query_integer", enumQueryInteger));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("enum_query_double", enumQueryDouble));

    if (!localVarQueryParams.isEmpty()) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    if (enumHeaderStringArray != null) {
      localVarRequestBuilder.header("enum_header_string_array", enumHeaderStringArray.toString());
    }
    if (enumHeaderString != null) {
      localVarRequestBuilder.header("enum_header_string", enumHeaderString.toString());
    }
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }

      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw new ApiException(localVarResponse.statusCode(),
            "testEnumParameters call received non-success response",
            localVarResponse.headers(),
            localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }

    } catch (IOException e) {
      throw new ApiException(e);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * Fake endpoint to test group parameters (optional)
   * Fake endpoint to test group parameters (optional)
   * @param requiredStringGroup Required String in group parameters (required)
   * @param requiredBooleanGroup Required Boolean in group parameters (required)
   * @param requiredInt64Group Required Integer in group parameters (required)
   * @param stringGroup String in group parameters (optional)
   * @param booleanGroup Boolean in group parameters (optional)
   * @param int64Group Integer in group parameters (optional)
   * @throws ApiException if fails to make API call
   */
  public void testGroupParameters(Integer requiredStringGroup, Boolean requiredBooleanGroup, Long requiredInt64Group, Integer stringGroup, Boolean booleanGroup, Long int64Group) throws ApiException {
    // verify the required parameter 'requiredStringGroup' is set
    if (requiredStringGroup == null) {
      throw new ApiException(400, "Missing the required parameter 'requiredStringGroup' when calling testGroupParameters");
    }
    // verify the required parameter 'requiredBooleanGroup' is set
    if (requiredBooleanGroup == null) {
      throw new ApiException(400, "Missing the required parameter 'requiredBooleanGroup' when calling testGroupParameters");
    }
    // verify the required parameter 'requiredInt64Group' is set
    if (requiredInt64Group == null) {
      throw new ApiException(400, "Missing the required parameter 'requiredInt64Group' when calling testGroupParameters");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/fake";

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("required_string_group", requiredStringGroup));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("required_int64_group", requiredInt64Group));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("string_group", stringGroup));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("int64_group", int64Group));

    if (!localVarQueryParams.isEmpty()) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    if (requiredBooleanGroup != null) {
      localVarRequestBuilder.header("required_boolean_group", requiredBooleanGroup.toString());
    }
    if (booleanGroup != null) {
      localVarRequestBuilder.header("boolean_group", booleanGroup.toString());
    }
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      localVarRequestBuilder.method("DELETE", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }

      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw new ApiException(localVarResponse.statusCode(),
            "testGroupParameters call received non-success response",
            localVarResponse.headers(),
            localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }

    } catch (IOException e) {
      throw new ApiException(e);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * test inline additionalProperties
   * 
   * @param param request body (required)
   * @throws ApiException if fails to make API call
   */
  public void testInlineAdditionalProperties(Map<String, String> param) throws ApiException {
    // verify the required parameter 'param' is set
    if (param == null) {
      throw new ApiException(400, "Missing the required parameter 'param' when calling testInlineAdditionalProperties");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/fake/inline-additionalProperties";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(param);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }

      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw new ApiException(localVarResponse.statusCode(),
            "testInlineAdditionalProperties call received non-success response",
            localVarResponse.headers(),
            localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }

    } catch (IOException e) {
      throw new ApiException(e);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * test json serialization of form data
   * 
   * @param param field1 (required)
   * @param param2 field2 (required)
   * @throws ApiException if fails to make API call
   */
  public void testJsonFormData(String param, String param2) throws ApiException {
    // verify the required parameter 'param' is set
    if (param == null) {
      throw new ApiException(400, "Missing the required parameter 'param' when calling testJsonFormData");
    }
    // verify the required parameter 'param2' is set
    if (param2 == null) {
      throw new ApiException(400, "Missing the required parameter 'param2' when calling testJsonFormData");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/fake/jsonFormData";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    try {
      localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }

      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw new ApiException(localVarResponse.statusCode(),
            "testJsonFormData call received non-success response",
            localVarResponse.headers(),
            localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }

    } catch (IOException e) {
      throw new ApiException(e);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * 
   * To test the collection format in query parameters
   * @param pipe  (required)
   * @param ioutil  (required)
   * @param http  (required)
   * @param url  (required)
   * @param context  (required)
   * @throws ApiException if fails to make API call
   */
  public void testQueryParameterCollectionFormat(List<String> pipe, List<String> ioutil, List<String> http, List<String> url, List<String> context) throws ApiException {
    // verify the required parameter 'pipe' is set
    if (pipe == null) {
      throw new ApiException(400, "Missing the required parameter 'pipe' when calling testQueryParameterCollectionFormat");
    }
    // verify the required parameter 'ioutil' is set
    if (ioutil == null) {
      throw new ApiException(400, "Missing the required parameter 'ioutil' when calling testQueryParameterCollectionFormat");
    }
    // verify the required parameter 'http' is set
    if (http == null) {
      throw new ApiException(400, "Missing the required parameter 'http' when calling testQueryParameterCollectionFormat");
    }
    // verify the required parameter 'url' is set
    if (url == null) {
      throw new ApiException(400, "Missing the required parameter 'url' when calling testQueryParameterCollectionFormat");
    }
    // verify the required parameter 'context' is set
    if (context == null) {
      throw new ApiException(400, "Missing the required parameter 'context' when calling testQueryParameterCollectionFormat");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/fake/test-query-paramters";

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("csv", "pipe", pipe));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("csv", "ioutil", ioutil));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("space", "http", http));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("csv", "url", url));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("multi", "context", context));

    if (!localVarQueryParams.isEmpty()) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

    try {
      localVarRequestBuilder.method("PUT", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }

      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw new ApiException(localVarResponse.statusCode(),
            "testQueryParameterCollectionFormat call received non-success response",
            localVarResponse.headers(),
            localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }

    } catch (IOException e) {
      throw new ApiException(e);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
}
