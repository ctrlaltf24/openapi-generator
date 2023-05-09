// <auto-generated>
/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Collections.Generic;
using System.Diagnostics.CodeAnalysis;
using System.Net;

namespace Org.OpenAPITools.Client
{
    /// <summary>
    /// Provides a non-generic contract for the ApiResponse wrapper.
    /// </summary>
    public interface IApiResponse
    {
        /// <summary>
        /// The type that represents the server's response.
        /// </summary>
        Type ResponseType { get; }

        /// <summary>
        /// Gets or sets the status code (HTTP status code)
        /// </summary>
        /// <value>The status code.</value>
        HttpStatusCode StatusCode { get; }

        /// <summary>
        /// The raw content of this response
        /// </summary>
        string RawContent { get; }

        /// <summary>
        /// The DateTime when the request was retrieved.
        /// </summary>
        DateTime DownloadedAt { get; }
    }

    /// <summary>
    /// API Response
    /// </summary>
    public partial class ApiResponse<T> : IApiResponse
    {
        /// <summary>
        /// Gets or sets the status code (HTTP status code)
        /// </summary>
        /// <value>The status code.</value>
        public HttpStatusCode StatusCode { get; }

        /// <summary>
        /// The type that represents the server's response.
        /// </summary>
        public Type ResponseType
        {
            get { return typeof(T); }
        }

        /// <summary>
        /// The raw data
        /// </summary>
        public string RawContent { get; private set; }

        /// <summary>
        /// The IsSuccessStatusCode from the api response
        /// </summary>
        public bool IsSuccessStatusCode { get; }

        /// <summary>
        /// The reason phrase contained in the api response
        /// </summary>
        public string ReasonPhrase { get; }

        /// <summary>
        /// The headers contained in the api response
        /// </summary>
        public System.Net.Http.Headers.HttpResponseHeaders Headers { get; }

        /// <summary>
        /// The DateTime when the request was retrieved.
        /// </summary>
        public DateTime DownloadedAt { get; } = DateTime.UtcNow;

        /// <summary>
        /// The JsonSerialzierOptions
        /// </summary>
        private System.Text.Json.JsonSerializerOptions _jsonSerializerOptions;

        /// <summary>
        /// Construct the response using an HttpResponseMessage
        /// </summary>
        /// <param name="httpRequestMessage"></param>
        /// <param name="httpResponseMessage"></param>
        /// <param name="rawContent"></param>
        /// <param name="jsonSerializerOptions"></param>
        public ApiResponse(System.Net.Http.HttpRequestMessage httpRequestMessage, System.Net.Http.HttpResponseMessage httpResponseMessage, string rawContent, System.Text.Json.JsonSerializerOptions jsonSerializerOptions)
        {
            StatusCode = httpResponseMessage.StatusCode;
            Headers = httpResponseMessage.Headers;
            IsSuccessStatusCode = httpResponseMessage.IsSuccessStatusCode;
            ReasonPhrase = httpResponseMessage.ReasonPhrase;
            RawContent = rawContent;
            _jsonSerializerOptions = jsonSerializerOptions;
            OnCreated(httpRequestMessage, httpResponseMessage);
        }

        partial void OnCreated(System.Net.Http.HttpRequestMessage httpRequestMessage, System.Net.Http.HttpResponseMessage httpResponseMessage);

        /// <summary>
        /// Deserializes the server's response
        /// </summary>
        public T ToModel(System.Text.Json.JsonSerializerOptions options = null)
        {
            return IsSuccessStatusCode
                ? System.Text.Json.JsonSerializer.Deserialize<T>(RawContent, options ?? _jsonSerializerOptions)
                : default(T);
        }

        /// <summary>
        /// Returns true when the model can be deserialized
        /// </summary>
        public bool TryToModel(out T model, System.Text.Json.JsonSerializerOptions options = null)
        {
            try
            {
                model = ToModel(options);
                return model != null;
            }
            catch
            {
                model = default(T);
                return false;
            }
        }
    }
}
