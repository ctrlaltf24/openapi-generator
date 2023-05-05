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
    /// ChildCat
    /// </summary>
    public partial class ChildCat : ParentPet, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ChildCat" /> class.
        /// </summary>
        /// <param name="childCatAllOf"></param>
        /// <param name="petType">petType</param>
        [JsonConstructor]
        internal ChildCat(ChildCatAllOf childCatAllOf, string petType) : base(petType)
        {
            ChildCatAllOf = childCatAllOf;
        }

        /// <summary>
        /// Gets or Sets ChildCatAllOf
        /// </summary>
        public ChildCatAllOf ChildCatAllOf { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ChildCat {\n");
            sb.Append("  ").Append(base.ToString().Replace("\n", "\n  ")).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
    }


    /// <summary>
    /// A Json converter for type ChildCat
    /// </summary>
    public class ChildCatJsonConverter : JsonConverter<ChildCat>
    {
        /// <summary>
        /// A Json reader.
        /// </summary>
        /// <param name="utf8JsonReader"></param>
        /// <param name="typeToConvert"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <returns></returns>
        /// <exception cref="JsonException"></exception>
        public override ChildCat Read(ref Utf8JsonReader utf8JsonReader, Type typeToConvert, JsonSerializerOptions jsonSerializerOptions)
        {
            int currentDepth = utf8JsonReader.CurrentDepth;

            if (utf8JsonReader.TokenType != JsonTokenType.StartObject && utf8JsonReader.TokenType != JsonTokenType.StartArray)
                throw new JsonException();

            JsonTokenType startingTokenType = utf8JsonReader.TokenType;

            Utf8JsonReader childCatAllOfReader = utf8JsonReader;
            bool childCatAllOfDeserialized = Client.ClientUtils.TryDeserialize<ChildCatAllOf>(ref utf8JsonReader, jsonSerializerOptions, out ChildCatAllOf childCatAllOf);

            string petType = default;

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
                        case "pet_type":
                            petType = utf8JsonReader.GetString();
                            break;
                        default:
                            break;
                    }
                }
            }

            return new ChildCat(childCatAllOf, petType);
        }

        /// <summary>
        /// A Json writer
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="childCat"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <exception cref="NotImplementedException"></exception>
        public override void Write(Utf8JsonWriter writer, ChildCat childCat, JsonSerializerOptions jsonSerializerOptions)
        {
            writer.WriteStartObject();

            writer.WriteString("pet_type", childCat.PetType);

            writer.WriteEndObject();
        }
    }
}
