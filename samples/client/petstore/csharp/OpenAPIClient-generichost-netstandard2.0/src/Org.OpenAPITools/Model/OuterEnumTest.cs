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
    /// Defines Outer_Enum_Test
    /// </summary>
    public enum OuterEnumTest
    {
        /// <summary>
        /// Enum UPPER for value: UPPER
        /// </summary>
        UPPER = 1,

        /// <summary>
        /// Enum Lower for value: lower
        /// </summary>
        Lower = 2,

        /// <summary>
        /// Enum Empty for value: 
        /// </summary>
        Empty = 3,

        /// <summary>
        /// Enum ValuewithTab for value: Value\twith tab
        /// </summary>
        ValuewithTab = 4,

        /// <summary>
        /// Enum ValueWithQuote for value: Value with \&quot; quote
        /// </summary>
        ValueWithQuote = 5,

        /// <summary>
        /// Enum ValueWithEscapedQuote for value: Value with escaped \&quot; quote
        /// </summary>
        ValueWithEscapedQuote = 6,

        /// <summary>
        /// Enum Duplicatevalue for value: Duplicate\nvalue
        /// </summary>
        Duplicatevalue = 7,

        /// <summary>
        /// Enum Duplicatevalue2 for value: Duplicate\r\nvalue
        /// </summary>
        Duplicatevalue2 = 8
    }

    /// <summary>
    /// Converts <see cref="OuterEnumTest"/> to and from the JSON value
    /// </summary>
    public static class OuterEnumTestValueConverter
    {
        /// <summary>
        /// Parses a given value to <see cref="OuterEnumTest"/>
        /// </summary>
        /// <param name="value"></param>
        /// <returns></returns>
        public static OuterEnumTest FromString(string value)
        {
            if (value.Equals("UPPER"))
                return OuterEnumTest.UPPER;

            if (value.Equals("lower"))
                return OuterEnumTest.Lower;

            if (value.Equals(""))
                return OuterEnumTest.Empty;

            if (value.Equals("Value\twith tab"))
                return OuterEnumTest.ValuewithTab;

            if (value.Equals("Value with \" quote"))
                return OuterEnumTest.ValueWithQuote;

            if (value.Equals("Value with escaped \" quote"))
                return OuterEnumTest.ValueWithEscapedQuote;

            if (value.Equals("Duplicate\nvalue"))
                return OuterEnumTest.Duplicatevalue;

            if (value.Equals("Duplicate\r\nvalue"))
                return OuterEnumTest.Duplicatevalue2;

            throw new NotImplementedException($"Could not convert value to type OuterEnumTest: '{value}'");
        }

        /// <summary>
        /// Parses a given value to <see cref="OuterEnumTest"/>
        /// </summary>
        /// <param name="value"></param>
        /// <returns></returns>
        public static OuterEnumTest? FromStringOrDefault(string value)
        {
            if (value.Equals("UPPER"))
                return OuterEnumTest.UPPER;

            if (value.Equals("lower"))
                return OuterEnumTest.Lower;

            if (value.Equals(""))
                return OuterEnumTest.Empty;

            if (value.Equals("Value\twith tab"))
                return OuterEnumTest.ValuewithTab;

            if (value.Equals("Value with \" quote"))
                return OuterEnumTest.ValueWithQuote;

            if (value.Equals("Value with escaped \" quote"))
                return OuterEnumTest.ValueWithEscapedQuote;

            if (value.Equals("Duplicate\nvalue"))
                return OuterEnumTest.Duplicatevalue;

            if (value.Equals("Duplicate\r\nvalue"))
                return OuterEnumTest.Duplicatevalue2;

            return null;
        }

        /// <summary>
        /// Converts the <see cref="OuterEnumTest"/> to the json value
        /// </summary>
        /// <param name="value"></param>
        /// <returns></returns>
        /// <exception cref="NotImplementedException"></exception>
        public static string ToJsonValue(OuterEnumTest value)
        {
            if (value == OuterEnumTest.UPPER)
                return "UPPER";

            if (value == OuterEnumTest.Lower)
                return "lower";

            if (value == OuterEnumTest.Empty)
                return "";

            if (value == OuterEnumTest.ValuewithTab)
                return "Value\twith tab";

            if (value == OuterEnumTest.ValueWithQuote)
                return "Value with \" quote";

            if (value == OuterEnumTest.ValueWithEscapedQuote)
                return "Value with escaped \" quote";

            if (value == OuterEnumTest.Duplicatevalue)
                return "Duplicate\nvalue";

            if (value == OuterEnumTest.Duplicatevalue2)
                return "Duplicate\r\nvalue";

            throw new NotImplementedException($"Value could not be handled: '{value}'");
        }
    }

    /// <summary>
    /// A Json converter for type <see cref="OuterEnumTest"/>
    /// </summary>
    /// <exception cref="NotImplementedException"></exception>
    public class OuterEnumTestJsonConverter : JsonConverter<OuterEnumTest>
    {
        /// <summary>
        /// Returns a  from the Json object
        /// </summary>
        /// <param name="reader"></param>
        /// <param name="typeToConvert"></param>
        /// <param name="options"></param>
        /// <returns></returns>
        public override OuterEnumTest Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            string rawValue = reader.GetString();

            OuterEnumTest? result = rawValue == null
                ? null
                : OuterEnumTestValueConverter.FromStringOrDefault(rawValue);

            if (result != null)
                return result.Value;

            throw new JsonException();
        }

        /// <summary>
        /// Writes the OuterEnumTest to the json writer
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="outerEnumTest"></param>
        /// <param name="options"></param>
        public override void Write(Utf8JsonWriter writer, OuterEnumTest outerEnumTest, JsonSerializerOptions options)
        {
            writer.WriteStringValue(outerEnumTest.ToString());
        }
    }

    /// <summary>
    /// A Json converter for type <see cref="OuterEnumTest"/>
    /// </summary>
    public class OuterEnumTestNullableJsonConverter : JsonConverter<OuterEnumTest?>
    {
        /// <summary>
        /// Returns a OuterEnumTest from the Json object
        /// </summary>
        /// <param name="reader"></param>
        /// <param name="typeToConvert"></param>
        /// <param name="options"></param>
        /// <returns></returns>
        public override OuterEnumTest? Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            string rawValue = reader.GetString();

            OuterEnumTest? result = rawValue == null
                ? null
                : OuterEnumTestValueConverter.FromStringOrDefault(rawValue);

            if (result != null)
                return result.Value;

            throw new JsonException();
        }

        /// <summary>
        /// Writes the DateTime to the json writer
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="outerEnumTest"></param>
        /// <param name="options"></param>
        public override void Write(Utf8JsonWriter writer, OuterEnumTest? outerEnumTest, JsonSerializerOptions options)
        {
            writer.WriteStringValue(outerEnumTest?.ToString() ?? "null");
        }
    }

}
