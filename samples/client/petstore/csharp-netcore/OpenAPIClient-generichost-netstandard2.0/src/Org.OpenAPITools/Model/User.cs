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
    /// User
    /// </summary>
    public partial class User : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="User" /> class.
        /// </summary>
        /// <param name="email">email</param>
        /// <param name="firstName">firstName</param>
        /// <param name="id">id</param>
        /// <param name="lastName">lastName</param>
        /// <param name="objectWithNoDeclaredProps">test code generation for objects Value must be a map of strings to values. It cannot be the &#39;null&#39; value.</param>
        /// <param name="password">password</param>
        /// <param name="phone">phone</param>
        /// <param name="userStatus">User Status</param>
        /// <param name="username">username</param>
        /// <param name="anyTypeProp">test code generation for any type Here the &#39;type&#39; attribute is not specified, which means the value can be anything, including the null value, string, number, boolean, array or object. See https://github.com/OAI/OpenAPI-Specification/issues/1389</param>
        /// <param name="anyTypePropNullable">test code generation for any type Here the &#39;type&#39; attribute is not specified, which means the value can be anything, including the null value, string, number, boolean, array or object. The &#39;nullable&#39; attribute does not change the allowed values.</param>
        /// <param name="objectWithNoDeclaredPropsNullable">test code generation for nullable objects. Value must be a map of strings to values or the &#39;null&#39; value.</param>
        [JsonConstructor]
        public User(string email, string firstName, long id, string lastName, Object objectWithNoDeclaredProps, string password, string phone, int userStatus, string username, Object anyTypeProp = default, Object anyTypePropNullable = default, Object objectWithNoDeclaredPropsNullable = default)
        {
            Email = email;
            FirstName = firstName;
            Id = id;
            LastName = lastName;
            ObjectWithNoDeclaredProps = objectWithNoDeclaredProps;
            Password = password;
            Phone = phone;
            UserStatus = userStatus;
            Username = username;
            AnyTypeProp = anyTypeProp;
            AnyTypePropNullable = anyTypePropNullable;
            ObjectWithNoDeclaredPropsNullable = objectWithNoDeclaredPropsNullable;
        }

        /// <summary>
        /// Gets or Sets Email
        /// </summary>
        [JsonPropertyName("email")]
        public string Email { get; set; }

        /// <summary>
        /// Gets or Sets FirstName
        /// </summary>
        [JsonPropertyName("firstName")]
        public string FirstName { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [JsonPropertyName("id")]
        public long Id { get; set; }

        /// <summary>
        /// Gets or Sets LastName
        /// </summary>
        [JsonPropertyName("lastName")]
        public string LastName { get; set; }

        /// <summary>
        /// test code generation for objects Value must be a map of strings to values. It cannot be the &#39;null&#39; value.
        /// </summary>
        /// <value>test code generation for objects Value must be a map of strings to values. It cannot be the &#39;null&#39; value.</value>
        [JsonPropertyName("objectWithNoDeclaredProps")]
        public Object ObjectWithNoDeclaredProps { get; set; }

        /// <summary>
        /// Gets or Sets Password
        /// </summary>
        [JsonPropertyName("password")]
        public string Password { get; set; }

        /// <summary>
        /// Gets or Sets Phone
        /// </summary>
        [JsonPropertyName("phone")]
        public string Phone { get; set; }

        /// <summary>
        /// User Status
        /// </summary>
        /// <value>User Status</value>
        [JsonPropertyName("userStatus")]
        public int UserStatus { get; set; }

        /// <summary>
        /// Gets or Sets Username
        /// </summary>
        [JsonPropertyName("username")]
        public string Username { get; set; }

        /// <summary>
        /// test code generation for any type Here the &#39;type&#39; attribute is not specified, which means the value can be anything, including the null value, string, number, boolean, array or object. See https://github.com/OAI/OpenAPI-Specification/issues/1389
        /// </summary>
        /// <value>test code generation for any type Here the &#39;type&#39; attribute is not specified, which means the value can be anything, including the null value, string, number, boolean, array or object. See https://github.com/OAI/OpenAPI-Specification/issues/1389</value>
        [JsonPropertyName("anyTypeProp")]
        public Object AnyTypeProp { get; set; }

        /// <summary>
        /// test code generation for any type Here the &#39;type&#39; attribute is not specified, which means the value can be anything, including the null value, string, number, boolean, array or object. The &#39;nullable&#39; attribute does not change the allowed values.
        /// </summary>
        /// <value>test code generation for any type Here the &#39;type&#39; attribute is not specified, which means the value can be anything, including the null value, string, number, boolean, array or object. The &#39;nullable&#39; attribute does not change the allowed values.</value>
        [JsonPropertyName("anyTypePropNullable")]
        public Object AnyTypePropNullable { get; set; }

        /// <summary>
        /// test code generation for nullable objects. Value must be a map of strings to values or the &#39;null&#39; value.
        /// </summary>
        /// <value>test code generation for nullable objects. Value must be a map of strings to values or the &#39;null&#39; value.</value>
        [JsonPropertyName("objectWithNoDeclaredPropsNullable")]
        public Object ObjectWithNoDeclaredPropsNullable { get; set; }

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
            sb.Append("class User {\n");
            sb.Append("  Email: ").Append(Email).Append("\n");
            sb.Append("  FirstName: ").Append(FirstName).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  LastName: ").Append(LastName).Append("\n");
            sb.Append("  ObjectWithNoDeclaredProps: ").Append(ObjectWithNoDeclaredProps).Append("\n");
            sb.Append("  Password: ").Append(Password).Append("\n");
            sb.Append("  Phone: ").Append(Phone).Append("\n");
            sb.Append("  UserStatus: ").Append(UserStatus).Append("\n");
            sb.Append("  Username: ").Append(Username).Append("\n");
            sb.Append("  AnyTypeProp: ").Append(AnyTypeProp).Append("\n");
            sb.Append("  AnyTypePropNullable: ").Append(AnyTypePropNullable).Append("\n");
            sb.Append("  ObjectWithNoDeclaredPropsNullable: ").Append(ObjectWithNoDeclaredPropsNullable).Append("\n");
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
            yield break;
        }
    }

    /// <summary>
    /// A Json converter for type User
    /// </summary>
    public class UserJsonConverter : JsonConverter<User>
    {
        /// <summary>
        /// A Json reader.
        /// </summary>
        /// <param name="utf8JsonReader"></param>
        /// <param name="typeToConvert"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <returns></returns>
        /// <exception cref="JsonException"></exception>
        public override User Read(ref Utf8JsonReader utf8JsonReader, Type typeToConvert, JsonSerializerOptions jsonSerializerOptions)
        {
            int currentDepth = utf8JsonReader.CurrentDepth;

            if (utf8JsonReader.TokenType != JsonTokenType.StartObject && utf8JsonReader.TokenType != JsonTokenType.StartArray)
                throw new JsonException();

            JsonTokenType startingTokenType = utf8JsonReader.TokenType;

            string email = default;
            string firstName = default;
            long id = default;
            string lastName = default;
            Object objectWithNoDeclaredProps = default;
            string password = default;
            string phone = default;
            int userStatus = default;
            string username = default;
            Object anyTypeProp = default;
            Object anyTypePropNullable = default;
            Object objectWithNoDeclaredPropsNullable = default;

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
                        case "email":
                            email = utf8JsonReader.GetString();
                            break;
                        case "firstName":
                            firstName = utf8JsonReader.GetString();
                            break;
                        case "id":
                            if (utf8JsonReader.TokenType != JsonTokenType.Null)
                                id = utf8JsonReader.GetInt64();
                            break;
                        case "lastName":
                            lastName = utf8JsonReader.GetString();
                            break;
                        case "objectWithNoDeclaredProps":
                            if (utf8JsonReader.TokenType != JsonTokenType.Null)
                                objectWithNoDeclaredProps = JsonSerializer.Deserialize<Object>(ref utf8JsonReader, jsonSerializerOptions);
                            break;
                        case "password":
                            password = utf8JsonReader.GetString();
                            break;
                        case "phone":
                            phone = utf8JsonReader.GetString();
                            break;
                        case "userStatus":
                            if (utf8JsonReader.TokenType != JsonTokenType.Null)
                                userStatus = utf8JsonReader.GetInt32();
                            break;
                        case "username":
                            username = utf8JsonReader.GetString();
                            break;
                        case "anyTypeProp":
                            if (utf8JsonReader.TokenType != JsonTokenType.Null)
                                anyTypeProp = JsonSerializer.Deserialize<Object>(ref utf8JsonReader, jsonSerializerOptions);
                            break;
                        case "anyTypePropNullable":
                            if (utf8JsonReader.TokenType != JsonTokenType.Null)
                                anyTypePropNullable = JsonSerializer.Deserialize<Object>(ref utf8JsonReader, jsonSerializerOptions);
                            break;
                        case "objectWithNoDeclaredPropsNullable":
                            if (utf8JsonReader.TokenType != JsonTokenType.Null)
                                objectWithNoDeclaredPropsNullable = JsonSerializer.Deserialize<Object>(ref utf8JsonReader, jsonSerializerOptions);
                            break;
                        default:
                            break;
                    }
                }
            }

#pragma warning disable CS0472 // The result of the expression is always the same since a value of this type is never equal to 'null'
#pragma warning disable CS8073 // The result of the expression is always the same since a value of this type is never equal to 'null'

            if (id == null)
                throw new ArgumentNullException(nameof(id), "Property is required for class User.");

            if (username == null)
                throw new ArgumentNullException(nameof(username), "Property is required for class User.");

            if (firstName == null)
                throw new ArgumentNullException(nameof(firstName), "Property is required for class User.");

            if (lastName == null)
                throw new ArgumentNullException(nameof(lastName), "Property is required for class User.");

            if (email == null)
                throw new ArgumentNullException(nameof(email), "Property is required for class User.");

            if (password == null)
                throw new ArgumentNullException(nameof(password), "Property is required for class User.");

            if (phone == null)
                throw new ArgumentNullException(nameof(phone), "Property is required for class User.");

            if (userStatus == null)
                throw new ArgumentNullException(nameof(userStatus), "Property is required for class User.");

            if (objectWithNoDeclaredProps == null)
                throw new ArgumentNullException(nameof(objectWithNoDeclaredProps), "Property is required for class User.");

#pragma warning restore CS0472 // The result of the expression is always the same since a value of this type is never equal to 'null'
#pragma warning restore CS8073 // The result of the expression is always the same since a value of this type is never equal to 'null'

            return new User(email, firstName, id, lastName, objectWithNoDeclaredProps, password, phone, userStatus, username, anyTypeProp, anyTypePropNullable, objectWithNoDeclaredPropsNullable);
        }

        /// <summary>
        /// A Json writer
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="user"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <exception cref="NotImplementedException"></exception>
        public override void Write(Utf8JsonWriter writer, User user, JsonSerializerOptions jsonSerializerOptions)
        {
            writer.WriteStartObject();

            writer.WriteString("email", user.Email);
            writer.WriteString("firstName", user.FirstName);
            writer.WriteNumber("id", user.Id);
            writer.WriteString("lastName", user.LastName);
            writer.WritePropertyName("objectWithNoDeclaredProps");
            JsonSerializer.Serialize(writer, user.ObjectWithNoDeclaredProps, jsonSerializerOptions);
            writer.WriteString("password", user.Password);
            writer.WriteString("phone", user.Phone);
            writer.WriteNumber("userStatus", user.UserStatus);
            writer.WriteString("username", user.Username);
            writer.WritePropertyName("anyTypeProp");
            JsonSerializer.Serialize(writer, user.AnyTypeProp, jsonSerializerOptions);
            writer.WritePropertyName("anyTypePropNullable");
            JsonSerializer.Serialize(writer, user.AnyTypePropNullable, jsonSerializerOptions);
            writer.WritePropertyName("objectWithNoDeclaredPropsNullable");
            JsonSerializer.Serialize(writer, user.ObjectWithNoDeclaredPropsNullable, jsonSerializerOptions);

            writer.WriteEndObject();
        }
    }

}
