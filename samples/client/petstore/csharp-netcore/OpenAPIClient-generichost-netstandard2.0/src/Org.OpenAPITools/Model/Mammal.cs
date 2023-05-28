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
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Text.Json;
using System.Text.Json.Serialization;
using System.ComponentModel.DataAnnotations;
using OpenAPIClientUtils = Org.OpenAPITools.Client.ClientUtils;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Mammal
    /// </summary>
    public partial class Mammal : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Mammal" /> class.
        /// </summary>
        /// <param name="whale"></param>
        [JsonConstructor]
        internal Mammal(Whale whale)
        {
            Whale = whale;
            OnCreated();
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="Mammal" /> class.
        /// </summary>
        /// <param name="zebra"></param>
        [JsonConstructor]
        internal Mammal(Zebra zebra)
        {
            Zebra = zebra;
            OnCreated();
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="Mammal" /> class.
        /// </summary>
        /// <param name="pig"></param>
        [JsonConstructor]
        internal Mammal(Pig pig)
        {
            Pig = pig;
            OnCreated();
        }

        partial void OnCreated();

        /// <summary>
        /// Gets or Sets Whale
        /// </summary>
        public Whale Whale { get; set; }

        /// <summary>
        /// Gets or Sets Zebra
        /// </summary>
        public Zebra Zebra { get; set; }

        /// <summary>
        /// Gets or Sets Pig
        /// </summary>
        public Pig Pig { get; set; }

        /// <summary>
        /// Gets or Sets additional properties
        /// </summary>
        [JsonExtensionData]
        public Dictionary<string, JsonElement> AdditionalProperties { get; } = new Dictionary<string, JsonElement>();

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Mammal {\n");
            sb.Append("  AdditionalProperties: ").Append(AdditionalProperties).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            return this.BaseValidate(validationContext);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        protected IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> BaseValidate(ValidationContext validationContext)
        {
            yield break;
        }
    }

    /// <summary>
    /// A Json converter for type Mammal
    /// </summary>
    public class MammalJsonConverter : JsonConverter<Mammal>
    {
        /// <summary>
        /// A Json reader.
        /// </summary>
        /// <param name="utf8JsonReader"></param>
        /// <param name="typeToConvert"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <returns></returns>
        /// <exception cref="JsonException"></exception>
        public override Mammal Read(ref Utf8JsonReader utf8JsonReader, Type typeToConvert, JsonSerializerOptions jsonSerializerOptions)
        {
            int currentDepth = utf8JsonReader.CurrentDepth;

            if (utf8JsonReader.TokenType != JsonTokenType.StartObject && utf8JsonReader.TokenType != JsonTokenType.StartArray)
                throw new JsonException();

            JsonTokenType startingTokenType = utf8JsonReader.TokenType;

            while (utf8JsonReader.Read())
            {
                if (startingTokenType == JsonTokenType.StartObject && utf8JsonReader.TokenType == JsonTokenType.EndObject && currentDepth == utf8JsonReader.CurrentDepth)
                    break;

                if (startingTokenType == JsonTokenType.StartArray && utf8JsonReader.TokenType == JsonTokenType.EndArray && currentDepth == utf8JsonReader.CurrentDepth)
                    break;

                if (utf8JsonReader.TokenType == JsonTokenType.PropertyName && currentDepth == utf8JsonReader.CurrentDepth - 1)
                {
                    string propertyName = utf8JsonReader.GetString();
                    utf8JsonReader.Read();

                    switch (propertyName)
                    {
                        default:
                            break;
                    }
                }
            }

            Utf8JsonReader whaleReader = utf8JsonReader;
            if (Client.ClientUtils.TryDeserialize<Whale>(ref whaleReader, jsonSerializerOptions, out Whale whale))
                return new Mammal(whale);

            Utf8JsonReader zebraReader = utf8JsonReader;
            if (Client.ClientUtils.TryDeserialize<Zebra>(ref zebraReader, jsonSerializerOptions, out Zebra zebra))
                return new Mammal(zebra);

            Utf8JsonReader pigReader = utf8JsonReader;
            if (Client.ClientUtils.TryDeserialize<Pig>(ref pigReader, jsonSerializerOptions, out Pig pig))
                return new Mammal(pig);

            throw new JsonException();
        }

        /// <summary>
        /// A Json writer
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="mammal"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <exception cref="NotImplementedException"></exception>
        public override void Write(Utf8JsonWriter writer, Mammal mammal, JsonSerializerOptions jsonSerializerOptions)
        {
            System.Text.Json.JsonSerializer.Serialize(writer, mammal.Whale, jsonSerializerOptions);

            System.Text.Json.JsonSerializer.Serialize(writer, mammal.Zebra, jsonSerializerOptions);

            System.Text.Json.JsonSerializer.Serialize(writer, mammal.Pig, jsonSerializerOptions);

        }
    }
}
