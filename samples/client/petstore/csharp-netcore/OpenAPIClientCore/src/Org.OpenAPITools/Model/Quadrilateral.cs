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
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using JsonSubTypes;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;
using OpenAPIClientUtils = Org.OpenAPITools.Client.ClientUtils;
using System.Reflection;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Quadrilateral
    /// </summary>
    [JsonConverter(typeof(QuadrilateralJsonConverter))]
    [DataContract(Name = "Quadrilateral")]
    public partial class Quadrilateral : AbstractOpenAPISchema, IEquatable<Quadrilateral>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Quadrilateral" /> class
        /// with the <see cref="ComplexQuadrilateral" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of ComplexQuadrilateral.</param>
        public Quadrilateral(ComplexQuadrilateral actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="Quadrilateral" /> class
        /// with the <see cref="SimpleQuadrilateral" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of SimpleQuadrilateral.</param>
        public Quadrilateral(SimpleQuadrilateral actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }


        private Object _actualInstance;

        /// <summary>
        /// Gets or Sets ActualInstance
        /// </summary>
        public override Object ActualInstance
        {
            get
            {
                return _actualInstance;
            }
            set
            {
                if (value.GetType() == typeof(ComplexQuadrilateral))
                {
                    this._actualInstance = value;
                }
                else if (value.GetType() == typeof(SimpleQuadrilateral))
                {
                    this._actualInstance = value;
                }
                else
                {
                    throw new ArgumentException("Invalid instance found. Must be the following types: ComplexQuadrilateral, SimpleQuadrilateral");
                }
            }
        }

        /// <summary>
        /// Get the actual instance of `ComplexQuadrilateral`. If the actual instanct is not `ComplexQuadrilateral`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of ComplexQuadrilateral</returns>
        public ComplexQuadrilateral GetComplexQuadrilateral()
        {
            return (ComplexQuadrilateral)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `SimpleQuadrilateral`. If the actual instanct is not `SimpleQuadrilateral`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of SimpleQuadrilateral</returns>
        public SimpleQuadrilateral GetSimpleQuadrilateral()
        {
            return (SimpleQuadrilateral)this.ActualInstance;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Quadrilateral {\n");
            sb.Append("  ActualInstance: ").Append(this.ActualInstance).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public override string ToJson()
        {
            return JsonConvert.SerializeObject(this.ActualInstance, Quadrilateral.SerializerSettings);
        }

        /// <summary>
        /// Converts the JSON string into an instance of Quadrilateral
        /// </summary>
        /// <param name="jsonString">JSON string</param>
        /// <returns>An instance of Quadrilateral</returns>
        public static Quadrilateral FromJson(string jsonString)
        {
            Quadrilateral newQuadrilateral = null;

            if (jsonString == null)
            {
                return newQuadrilateral;
            }
            int match = 0;
            List<string> matchedTypes = new List<string>();

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(ComplexQuadrilateral).GetProperty("AdditionalProperties") == null)
                {
                    newQuadrilateral = new Quadrilateral(JsonConvert.DeserializeObject<ComplexQuadrilateral>(jsonString, Quadrilateral.SerializerSettings));
                }
                else
                {
                    newQuadrilateral = new Quadrilateral(JsonConvert.DeserializeObject<ComplexQuadrilateral>(jsonString, Quadrilateral.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("ComplexQuadrilateral");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(String.Format("Failed to deserialize `{0}` into ComplexQuadrilateral: {1}", jsonString, exception.ToString()));
            }

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(SimpleQuadrilateral).GetProperty("AdditionalProperties") == null)
                {
                    newQuadrilateral = new Quadrilateral(JsonConvert.DeserializeObject<SimpleQuadrilateral>(jsonString, Quadrilateral.SerializerSettings));
                }
                else
                {
                    newQuadrilateral = new Quadrilateral(JsonConvert.DeserializeObject<SimpleQuadrilateral>(jsonString, Quadrilateral.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("SimpleQuadrilateral");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(String.Format("Failed to deserialize `{0}` into SimpleQuadrilateral: {1}", jsonString, exception.ToString()));
            }

            if (match == 0)
            {
                throw new InvalidDataException("The JSON string `" + jsonString + "` cannot be deserialized into any schema defined.");
            }
            else if (match > 1)
            {
                throw new InvalidDataException("The JSON string `" + jsonString + "` incorrectly matches more than one schema (should be exactly one match): " + matchedTypes);
            }

            // deserialization is considered successful at this point if no exception has been thrown.
            return newQuadrilateral;
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return OpenAPIClientUtils.compareLogic.Compare(this, input as Quadrilateral).AreEqual;
        }

        /// <summary>
        /// Returns true if Quadrilateral instances are equal
        /// </summary>
        /// <param name="input">Instance of Quadrilateral to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Quadrilateral input)
        {
            return OpenAPIClientUtils.compareLogic.Compare(this, input).AreEqual;
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.ActualInstance != null)
                    hashCode = hashCode * 59 + this.ActualInstance.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

    /// <summary>
    /// Custom JSON converter for Quadrilateral
    /// </summary>
    public class QuadrilateralJsonConverter : JsonConverter
    {
        /// <summary>
        /// To write the JSON string
        /// </summary>
        /// <param name="writer">JSON writer</param>
        /// <param name="value">Object to be converted into a JSON string</param>
        /// <param name="serializer">JSON Serializer</param>
        public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
        {
            writer.WriteRawValue((String)(typeof(Quadrilateral).GetMethod("ToJson").Invoke(value, null)));
        }

        /// <summary>
        /// To convert a JSON string into an object
        /// </summary>
        /// <param name="reader">JSON reader</param>
        /// <param name="objectType">Object type</param>
        /// <param name="existingValue">Existing value</param>
        /// <param name="serializer">JSON Serializer</param>
        /// <returns>The object converted from the JSON string</returns>
        public override object ReadJson(JsonReader reader, Type objectType, object existingValue, JsonSerializer serializer)
        {
            if(reader.TokenType != JsonToken.Null)
            {
                return Quadrilateral.FromJson(JObject.Load(reader).ToString(Formatting.None));
            }
            return null;
        }

        /// <summary>
        /// Check if the object can be converted
        /// </summary>
        /// <param name="objectType">Object type</param>
        /// <returns>True if the object can be converted</returns>
        public override bool CanConvert(Type objectType)
        {
            return false;
        }
    }

}
