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
using JsonSubTypes;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;
using OpenAPIClientUtils = Org.OpenAPITools.Client.ClientUtils;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// The value may be a shape or the &#39;null&#39; value. This is introduced in OAS schema &gt;&#x3D; 3.1.
    /// </summary>
    [DataContract(Name = "ShapeOrNull")]
    [JsonConverter(typeof(JsonSubtypes), "ShapeType")]
    public partial class ShapeOrNull : IEquatable<ShapeOrNull>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ShapeOrNull" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ShapeOrNull()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="ShapeOrNull" /> class.
        /// </summary>
        /// <param name="shapeType">shapeType (required).</param>
        /// <param name="quadrilateralType">quadrilateralType (required).</param>
        /// <param name="triangleType">triangleType (required).</param>
        public ShapeOrNull(string shapeType = default(string), string quadrilateralType = default(string), string triangleType = default(string))
        {
            // to ensure "shapeType" is required (not null)
            this.ShapeType = shapeType ?? throw new ArgumentNullException("shapeType is a required property for ShapeOrNull and cannot be null");
            // to ensure "quadrilateralType" is required (not null)
            this.QuadrilateralType = quadrilateralType ?? throw new ArgumentNullException("quadrilateralType is a required property for ShapeOrNull and cannot be null");
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Gets or Sets ShapeType
        /// </summary>
        [DataMember(Name = "shapeType", EmitDefaultValue = false)]
        public string ShapeType { get; set; }

        /// <summary>
        /// Gets or Sets QuadrilateralType
        /// </summary>
        [DataMember(Name = "quadrilateralType", EmitDefaultValue = false)]
        public string QuadrilateralType { get; set; }

        /// <summary>
        /// Gets or Sets additional properties
        /// </summary>
        [JsonExtensionData]
        public IDictionary<string, object> AdditionalProperties { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ShapeOrNull {\n");
            sb.Append("  ShapeType: ").Append(ShapeType).Append("\n");
            sb.Append("  QuadrilateralType: ").Append(QuadrilateralType).Append("\n");
            sb.Append("  AdditionalProperties: ").Append(AdditionalProperties).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return OpenAPIClientUtils.compareLogic.Compare(this, input as ShapeOrNull).AreEqual;
        }

        /// <summary>
        /// Returns true if ShapeOrNull instances are equal
        /// </summary>
        /// <param name="input">Instance of ShapeOrNull to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ShapeOrNull input)
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
                if (this.ShapeType != null)
                    hashCode = hashCode * 59 + this.ShapeType.GetHashCode();
                if (this.QuadrilateralType != null)
                    hashCode = hashCode * 59 + this.QuadrilateralType.GetHashCode();
                if (this.AdditionalProperties != null)
                    hashCode = hashCode * 59 + this.AdditionalProperties.GetHashCode();
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

}
