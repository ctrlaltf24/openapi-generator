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
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Pair;

import java.io.File;
import org.openapitools.client.model.ModelApiResponse;
import org.openapitools.client.model.Pet;
import java.util.Set;

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
import java.util.Set;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PetApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;

  public PetApi() {
    this(new ApiClient());
  }

  public PetApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
  }

  protected ApiException getApiException(String operationId, HttpResponse<InputStream> response) throws IOException {
    String body = response.body() == null ? null : new String(response.body().readAllBytes());
    String message = formatExceptionMessage(operationId, response.statusCode(), body);
    return new ApiException(response.statusCode(), message, response.headers(), body);
  }

  private String formatExceptionMessage(String operationId, int statusCode, String body) {
    if (body == null || body.isEmpty()) {
      body = "[no body]";
    }
    return operationId + " call failed with: " + statusCode + " - " + body;
  }

  /**
   * Add a new pet to the store
   * 
   * @param body Pet object that needs to be added to the store (required)
   * @throws ApiException if fails to make API call
   */
  public void addPet(Pet body) throws ApiException {
    addPetWithHttpInfo(body);
  }

  /**
   * Add a new pet to the store
   * 
   * @param body Pet object that needs to be added to the store (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> addPetWithHttpInfo(Pet body) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = addPetRequestBuilder(body);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw getApiException("addPet", localVarResponse);
      }
      return new ApiResponse<Void>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          null
        );
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder addPetRequestBuilder(Pet body) throws ApiException {
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addPet");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/pet";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(body);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Deletes a pet
   * 
   * @param petId Pet id to delete (required)
   * @param apiKey  (optional)
   * @throws ApiException if fails to make API call
   */
  public void deletePet(Long petId, String apiKey) throws ApiException {
    deletePetWithHttpInfo(petId, apiKey);
  }

  /**
   * Deletes a pet
   * 
   * @param petId Pet id to delete (required)
   * @param apiKey  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deletePetWithHttpInfo(Long petId, String apiKey) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = deletePetRequestBuilder(petId, apiKey);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw getApiException("deletePet", localVarResponse);
      }
      return new ApiResponse<Void>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          null
        );
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder deletePetRequestBuilder(Long petId, String apiKey) throws ApiException {
    // verify the required parameter 'petId' is set
    if (petId == null) {
      throw new ApiException(400, "Missing the required parameter 'petId' when calling deletePet");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/pet/{petId}"
        .replace("{petId}", ApiClient.urlEncode(petId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (apiKey != null) {
      localVarRequestBuilder.header("api_key", apiKey.toString());
    }
    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("DELETE", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Finds Pets by status
   * Multiple status values can be provided with comma separated strings
   * @param status Status values that need to be considered for filter (required)
   * @return List&lt;Pet&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Pet> findPetsByStatus(List<String> status) throws ApiException {
    ApiResponse<List<Pet>> localVarResponse = findPetsByStatusWithHttpInfo(status);
    return localVarResponse.getData();
  }

  /**
   * Finds Pets by status
   * Multiple status values can be provided with comma separated strings
   * @param status Status values that need to be considered for filter (required)
   * @return ApiResponse&lt;List&lt;Pet&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<Pet>> findPetsByStatusWithHttpInfo(List<String> status) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = findPetsByStatusRequestBuilder(status);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw getApiException("findPetsByStatus", localVarResponse);
      }
      return new ApiResponse<List<Pet>>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<List<Pet>>() {})
        );
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder findPetsByStatusRequestBuilder(List<String> status) throws ApiException {
    // verify the required parameter 'status' is set
    if (status == null) {
      throw new ApiException(400, "Missing the required parameter 'status' when calling findPetsByStatus");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/pet/findByStatus";

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("csv", "status", status));

    if (!localVarQueryParams.isEmpty()) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Finds Pets by tags
   * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
   * @param tags Tags to filter by (required)
   * @return Set&lt;Pet&gt;
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public Set<Pet> findPetsByTags(Set<String> tags) throws ApiException {
    ApiResponse<Set<Pet>> localVarResponse = findPetsByTagsWithHttpInfo(tags);
    return localVarResponse.getData();
  }

  /**
   * Finds Pets by tags
   * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
   * @param tags Tags to filter by (required)
   * @return ApiResponse&lt;Set&lt;Pet&gt;&gt;
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public ApiResponse<Set<Pet>> findPetsByTagsWithHttpInfo(Set<String> tags) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = findPetsByTagsRequestBuilder(tags);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw getApiException("findPetsByTags", localVarResponse);
      }
      return new ApiResponse<Set<Pet>>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<Set<Pet>>() {})
        );
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder findPetsByTagsRequestBuilder(Set<String> tags) throws ApiException {
    // verify the required parameter 'tags' is set
    if (tags == null) {
      throw new ApiException(400, "Missing the required parameter 'tags' when calling findPetsByTags");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/pet/findByTags";

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("csv", "tags", tags));

    if (!localVarQueryParams.isEmpty()) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Find pet by ID
   * Returns a single pet
   * @param petId ID of pet to return (required)
   * @return Pet
   * @throws ApiException if fails to make API call
   */
  public Pet getPetById(Long petId) throws ApiException {
    ApiResponse<Pet> localVarResponse = getPetByIdWithHttpInfo(petId);
    return localVarResponse.getData();
  }

  /**
   * Find pet by ID
   * Returns a single pet
   * @param petId ID of pet to return (required)
   * @return ApiResponse&lt;Pet&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Pet> getPetByIdWithHttpInfo(Long petId) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getPetByIdRequestBuilder(petId);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw getApiException("getPetById", localVarResponse);
      }
      return new ApiResponse<Pet>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<Pet>() {})
        );
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder getPetByIdRequestBuilder(Long petId) throws ApiException {
    // verify the required parameter 'petId' is set
    if (petId == null) {
      throw new ApiException(400, "Missing the required parameter 'petId' when calling getPetById");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/pet/{petId}"
        .replace("{petId}", ApiClient.urlEncode(petId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Update an existing pet
   * 
   * @param body Pet object that needs to be added to the store (required)
   * @throws ApiException if fails to make API call
   */
  public void updatePet(Pet body) throws ApiException {
    updatePetWithHttpInfo(body);
  }

  /**
   * Update an existing pet
   * 
   * @param body Pet object that needs to be added to the store (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> updatePetWithHttpInfo(Pet body) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = updatePetRequestBuilder(body);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw getApiException("updatePet", localVarResponse);
      }
      return new ApiResponse<Void>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          null
        );
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder updatePetRequestBuilder(Pet body) throws ApiException {
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updatePet");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/pet";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(body);
      localVarRequestBuilder.method("PUT", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Updates a pet in the store with form data
   * 
   * @param petId ID of pet that needs to be updated (required)
   * @param name Updated name of the pet (optional)
   * @param status Updated status of the pet (optional)
   * @throws ApiException if fails to make API call
   */
  public void updatePetWithForm(Long petId, String name, String status) throws ApiException {
    updatePetWithFormWithHttpInfo(petId, name, status);
  }

  /**
   * Updates a pet in the store with form data
   * 
   * @param petId ID of pet that needs to be updated (required)
   * @param name Updated name of the pet (optional)
   * @param status Updated status of the pet (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> updatePetWithFormWithHttpInfo(Long petId, String name, String status) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = updatePetWithFormRequestBuilder(petId, name, status);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw getApiException("updatePetWithForm", localVarResponse);
      }
      return new ApiResponse<Void>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          null
        );
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder updatePetWithFormRequestBuilder(Long petId, String name, String status) throws ApiException {
    // verify the required parameter 'petId' is set
    if (petId == null) {
      throw new ApiException(400, "Missing the required parameter 'petId' when calling updatePetWithForm");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/pet/{petId}"
        .replace("{petId}", ApiClient.urlEncode(petId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * uploads an image
   * 
   * @param petId ID of pet to update (required)
   * @param additionalMetadata Additional data to pass to server (optional)
   * @param file file to upload (optional)
   * @return ModelApiResponse
   * @throws ApiException if fails to make API call
   */
  public ModelApiResponse uploadFile(Long petId, String additionalMetadata, File file) throws ApiException {
    ApiResponse<ModelApiResponse> localVarResponse = uploadFileWithHttpInfo(petId, additionalMetadata, file);
    return localVarResponse.getData();
  }

  /**
   * uploads an image
   * 
   * @param petId ID of pet to update (required)
   * @param additionalMetadata Additional data to pass to server (optional)
   * @param file file to upload (optional)
   * @return ApiResponse&lt;ModelApiResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ModelApiResponse> uploadFileWithHttpInfo(Long petId, String additionalMetadata, File file) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = uploadFileRequestBuilder(petId, additionalMetadata, file);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw getApiException("uploadFile", localVarResponse);
      }
      return new ApiResponse<ModelApiResponse>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ModelApiResponse>() {})
        );
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder uploadFileRequestBuilder(Long petId, String additionalMetadata, File file) throws ApiException {
    // verify the required parameter 'petId' is set
    if (petId == null) {
      throw new ApiException(400, "Missing the required parameter 'petId' when calling uploadFile");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/pet/{petId}/uploadImage"
        .replace("{petId}", ApiClient.urlEncode(petId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * uploads an image (required)
   * 
   * @param petId ID of pet to update (required)
   * @param requiredFile file to upload (required)
   * @param additionalMetadata Additional data to pass to server (optional)
   * @return ModelApiResponse
   * @throws ApiException if fails to make API call
   */
  public ModelApiResponse uploadFileWithRequiredFile(Long petId, File requiredFile, String additionalMetadata) throws ApiException {
    ApiResponse<ModelApiResponse> localVarResponse = uploadFileWithRequiredFileWithHttpInfo(petId, requiredFile, additionalMetadata);
    return localVarResponse.getData();
  }

  /**
   * uploads an image (required)
   * 
   * @param petId ID of pet to update (required)
   * @param requiredFile file to upload (required)
   * @param additionalMetadata Additional data to pass to server (optional)
   * @return ApiResponse&lt;ModelApiResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ModelApiResponse> uploadFileWithRequiredFileWithHttpInfo(Long petId, File requiredFile, String additionalMetadata) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = uploadFileWithRequiredFileRequestBuilder(petId, requiredFile, additionalMetadata);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw getApiException("uploadFileWithRequiredFile", localVarResponse);
      }
      return new ApiResponse<ModelApiResponse>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ModelApiResponse>() {})
        );
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder uploadFileWithRequiredFileRequestBuilder(Long petId, File requiredFile, String additionalMetadata) throws ApiException {
    // verify the required parameter 'petId' is set
    if (petId == null) {
      throw new ApiException(400, "Missing the required parameter 'petId' when calling uploadFileWithRequiredFile");
    }
    // verify the required parameter 'requiredFile' is set
    if (requiredFile == null) {
      throw new ApiException(400, "Missing the required parameter 'requiredFile' when calling uploadFileWithRequiredFile");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/fake/{petId}/uploadImageWithRequiredFile"
        .replace("{petId}", ApiClient.urlEncode(petId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
}
