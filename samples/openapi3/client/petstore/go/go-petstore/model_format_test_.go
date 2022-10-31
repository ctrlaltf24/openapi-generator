/*
OpenAPI Petstore

This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

API version: 1.0.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package petstore

import (
	"encoding/json"
	"os"
	"time"
)

// FormatTest struct for FormatTest
type FormatTest struct {
	Integer *int32 `json:"integer,omitempty"`
	Int32 *int32 `json:"int32,omitempty"`
	Int64 *int64 `json:"int64,omitempty"`
	Number float32 `json:"number"`
	Float *float32 `json:"float,omitempty"`
	Double *float64 `json:"double,omitempty"`
	String *string `json:"string,omitempty"`
	Byte string `json:"byte"`
	Binary **os.File `json:"binary,omitempty"`
	Date string `json:"date"`
	DateTime *time.Time `json:"dateTime,omitempty"`
	Uuid *string `json:"uuid,omitempty"`
	Password string `json:"password"`
	// A string that is a 10 digit number. Can have leading zeros.
	PatternWithDigits *string `json:"pattern_with_digits,omitempty"`
	// A string starting with 'image_' (case insensitive) and one to three digits following i.e. Image_01.
	PatternWithDigitsAndDelimiter *string `json:"pattern_with_digits_and_delimiter,omitempty"`
	AdditionalProperties map[string]interface{}
}

type _FormatTest FormatTest

// NewFormatTest instantiates a new FormatTest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewFormatTest(number float32, byte_ string, date string, password string) *FormatTest {
	this := FormatTest{}
	this.Number = number
	this.Byte = byte_
	this.Date = date
	this.Password = password
	return &this
}

// NewFormatTestWithDefaults instantiates a new FormatTest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewFormatTestWithDefaults() *FormatTest {
	this := FormatTest{}
	return &this
}

// GetInteger returns the Integer field value if set, zero value otherwise.
func (o *FormatTest) GetInteger() int32 {
	if o == nil || isNil(o.Integer) {
		var ret int32
		return ret
	}
	return *o.Integer
}

// GetIntegerOk returns a tuple with the Integer field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FormatTest) GetIntegerOk() (*int32, bool) {
	if o == nil || isNil(o.Integer) {
    return nil, false
	}
	return o.Integer, true
}

// HasInteger returns a boolean if a field has been set.
func (o *FormatTest) HasInteger() bool {
	if o != nil && !isNil(o.Integer) {
		return true
	}

	return false
}

// SetInteger gets a reference to the given int32 and assigns it to the Integer field.
func (o *FormatTest) SetInteger(v int32) {
	o.Integer = &v
}

// GetInt32 returns the Int32 field value if set, zero value otherwise.
func (o *FormatTest) GetInt32() int32 {
	if o == nil || isNil(o.Int32) {
		var ret int32
		return ret
	}
	return *o.Int32
}

// GetInt32Ok returns a tuple with the Int32 field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FormatTest) GetInt32Ok() (*int32, bool) {
	if o == nil || isNil(o.Int32) {
    return nil, false
	}
	return o.Int32, true
}

// HasInt32 returns a boolean if a field has been set.
func (o *FormatTest) HasInt32() bool {
	if o != nil && !isNil(o.Int32) {
		return true
	}

	return false
}

// SetInt32 gets a reference to the given int32 and assigns it to the Int32 field.
func (o *FormatTest) SetInt32(v int32) {
	o.Int32 = &v
}

// GetInt64 returns the Int64 field value if set, zero value otherwise.
func (o *FormatTest) GetInt64() int64 {
	if o == nil || isNil(o.Int64) {
		var ret int64
		return ret
	}
	return *o.Int64
}

// GetInt64Ok returns a tuple with the Int64 field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FormatTest) GetInt64Ok() (*int64, bool) {
	if o == nil || isNil(o.Int64) {
    return nil, false
	}
	return o.Int64, true
}

// HasInt64 returns a boolean if a field has been set.
func (o *FormatTest) HasInt64() bool {
	if o != nil && !isNil(o.Int64) {
		return true
	}

	return false
}

// SetInt64 gets a reference to the given int64 and assigns it to the Int64 field.
func (o *FormatTest) SetInt64(v int64) {
	o.Int64 = &v
}

// GetNumber returns the Number field value
func (o *FormatTest) GetNumber() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.Number
}

// GetNumberOk returns a tuple with the Number field value
// and a boolean to check if the value has been set.
func (o *FormatTest) GetNumberOk() (*float32, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Number, true
}

// SetNumber sets field value
func (o *FormatTest) SetNumber(v float32) {
	o.Number = v
}

// GetFloat returns the Float field value if set, zero value otherwise.
func (o *FormatTest) GetFloat() float32 {
	if o == nil || isNil(o.Float) {
		var ret float32
		return ret
	}
	return *o.Float
}

// GetFloatOk returns a tuple with the Float field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FormatTest) GetFloatOk() (*float32, bool) {
	if o == nil || isNil(o.Float) {
    return nil, false
	}
	return o.Float, true
}

// HasFloat returns a boolean if a field has been set.
func (o *FormatTest) HasFloat() bool {
	if o != nil && !isNil(o.Float) {
		return true
	}

	return false
}

// SetFloat gets a reference to the given float32 and assigns it to the Float field.
func (o *FormatTest) SetFloat(v float32) {
	o.Float = &v
}

// GetDouble returns the Double field value if set, zero value otherwise.
func (o *FormatTest) GetDouble() float64 {
	if o == nil || isNil(o.Double) {
		var ret float64
		return ret
	}
	return *o.Double
}

// GetDoubleOk returns a tuple with the Double field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FormatTest) GetDoubleOk() (*float64, bool) {
	if o == nil || isNil(o.Double) {
    return nil, false
	}
	return o.Double, true
}

// HasDouble returns a boolean if a field has been set.
func (o *FormatTest) HasDouble() bool {
	if o != nil && !isNil(o.Double) {
		return true
	}

	return false
}

// SetDouble gets a reference to the given float64 and assigns it to the Double field.
func (o *FormatTest) SetDouble(v float64) {
	o.Double = &v
}

// GetString returns the String field value if set, zero value otherwise.
func (o *FormatTest) GetString() string {
	if o == nil || isNil(o.String) {
		var ret string
		return ret
	}
	return *o.String
}

// GetStringOk returns a tuple with the String field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FormatTest) GetStringOk() (*string, bool) {
	if o == nil || isNil(o.String) {
    return nil, false
	}
	return o.String, true
}

// HasString returns a boolean if a field has been set.
func (o *FormatTest) HasString() bool {
	if o != nil && !isNil(o.String) {
		return true
	}

	return false
}

// SetString gets a reference to the given string and assigns it to the String field.
func (o *FormatTest) SetString(v string) {
	o.String = &v
}

// GetByte returns the Byte field value
func (o *FormatTest) GetByte() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Byte
}

// GetByteOk returns a tuple with the Byte field value
// and a boolean to check if the value has been set.
func (o *FormatTest) GetByteOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Byte, true
}

// SetByte sets field value
func (o *FormatTest) SetByte(v string) {
	o.Byte = v
}

// GetBinary returns the Binary field value if set, zero value otherwise.
func (o *FormatTest) GetBinary() *os.File {
	if o == nil || isNil(o.Binary) {
		var ret *os.File
		return ret
	}
	return *o.Binary
}

// GetBinaryOk returns a tuple with the Binary field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FormatTest) GetBinaryOk() (**os.File, bool) {
	if o == nil || isNil(o.Binary) {
    return nil, false
	}
	return o.Binary, true
}

// HasBinary returns a boolean if a field has been set.
func (o *FormatTest) HasBinary() bool {
	if o != nil && !isNil(o.Binary) {
		return true
	}

	return false
}

// SetBinary gets a reference to the given *os.File and assigns it to the Binary field.
func (o *FormatTest) SetBinary(v *os.File) {
	o.Binary = &v
}

// GetDate returns the Date field value
func (o *FormatTest) GetDate() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Date
}

// GetDateOk returns a tuple with the Date field value
// and a boolean to check if the value has been set.
func (o *FormatTest) GetDateOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Date, true
}

// SetDate sets field value
func (o *FormatTest) SetDate(v string) {
	o.Date = v
}

// GetDateTime returns the DateTime field value if set, zero value otherwise.
func (o *FormatTest) GetDateTime() time.Time {
	if o == nil || isNil(o.DateTime) {
		var ret time.Time
		return ret
	}
	return *o.DateTime
}

// GetDateTimeOk returns a tuple with the DateTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FormatTest) GetDateTimeOk() (*time.Time, bool) {
	if o == nil || isNil(o.DateTime) {
    return nil, false
	}
	return o.DateTime, true
}

// HasDateTime returns a boolean if a field has been set.
func (o *FormatTest) HasDateTime() bool {
	if o != nil && !isNil(o.DateTime) {
		return true
	}

	return false
}

// SetDateTime gets a reference to the given time.Time and assigns it to the DateTime field.
func (o *FormatTest) SetDateTime(v time.Time) {
	o.DateTime = &v
}

// GetUuid returns the Uuid field value if set, zero value otherwise.
func (o *FormatTest) GetUuid() string {
	if o == nil || isNil(o.Uuid) {
		var ret string
		return ret
	}
	return *o.Uuid
}

// GetUuidOk returns a tuple with the Uuid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FormatTest) GetUuidOk() (*string, bool) {
	if o == nil || isNil(o.Uuid) {
    return nil, false
	}
	return o.Uuid, true
}

// HasUuid returns a boolean if a field has been set.
func (o *FormatTest) HasUuid() bool {
	if o != nil && !isNil(o.Uuid) {
		return true
	}

	return false
}

// SetUuid gets a reference to the given string and assigns it to the Uuid field.
func (o *FormatTest) SetUuid(v string) {
	o.Uuid = &v
}

// GetPassword returns the Password field value
func (o *FormatTest) GetPassword() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Password
}

// GetPasswordOk returns a tuple with the Password field value
// and a boolean to check if the value has been set.
func (o *FormatTest) GetPasswordOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Password, true
}

// SetPassword sets field value
func (o *FormatTest) SetPassword(v string) {
	o.Password = v
}

// GetPatternWithDigits returns the PatternWithDigits field value if set, zero value otherwise.
func (o *FormatTest) GetPatternWithDigits() string {
	if o == nil || isNil(o.PatternWithDigits) {
		var ret string
		return ret
	}
	return *o.PatternWithDigits
}

// GetPatternWithDigitsOk returns a tuple with the PatternWithDigits field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FormatTest) GetPatternWithDigitsOk() (*string, bool) {
	if o == nil || isNil(o.PatternWithDigits) {
    return nil, false
	}
	return o.PatternWithDigits, true
}

// HasPatternWithDigits returns a boolean if a field has been set.
func (o *FormatTest) HasPatternWithDigits() bool {
	if o != nil && !isNil(o.PatternWithDigits) {
		return true
	}

	return false
}

// SetPatternWithDigits gets a reference to the given string and assigns it to the PatternWithDigits field.
func (o *FormatTest) SetPatternWithDigits(v string) {
	o.PatternWithDigits = &v
}

// GetPatternWithDigitsAndDelimiter returns the PatternWithDigitsAndDelimiter field value if set, zero value otherwise.
func (o *FormatTest) GetPatternWithDigitsAndDelimiter() string {
	if o == nil || isNil(o.PatternWithDigitsAndDelimiter) {
		var ret string
		return ret
	}
	return *o.PatternWithDigitsAndDelimiter
}

// GetPatternWithDigitsAndDelimiterOk returns a tuple with the PatternWithDigitsAndDelimiter field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FormatTest) GetPatternWithDigitsAndDelimiterOk() (*string, bool) {
	if o == nil || isNil(o.PatternWithDigitsAndDelimiter) {
    return nil, false
	}
	return o.PatternWithDigitsAndDelimiter, true
}

// HasPatternWithDigitsAndDelimiter returns a boolean if a field has been set.
func (o *FormatTest) HasPatternWithDigitsAndDelimiter() bool {
	if o != nil && !isNil(o.PatternWithDigitsAndDelimiter) {
		return true
	}

	return false
}

// SetPatternWithDigitsAndDelimiter gets a reference to the given string and assigns it to the PatternWithDigitsAndDelimiter field.
func (o *FormatTest) SetPatternWithDigitsAndDelimiter(v string) {
	o.PatternWithDigitsAndDelimiter = &v
}

func (o FormatTest) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Integer) {
		toSerialize["integer"] = o.Integer
	}
	if !isNil(o.Int32) {
		toSerialize["int32"] = o.Int32
	}
	if !isNil(o.Int64) {
		toSerialize["int64"] = o.Int64
	}
	if true {
		toSerialize["number"] = o.Number
	}
	if !isNil(o.Float) {
		toSerialize["float"] = o.Float
	}
	if !isNil(o.Double) {
		toSerialize["double"] = o.Double
	}
	if !isNil(o.String) {
		toSerialize["string"] = o.String
	}
	if true {
		toSerialize["byte"] = o.Byte
	}
	if !isNil(o.Binary) {
		toSerialize["binary"] = o.Binary
	}
	if true {
		toSerialize["date"] = o.Date
	}
	if !isNil(o.DateTime) {
		toSerialize["dateTime"] = o.DateTime
	}
	if !isNil(o.Uuid) {
		toSerialize["uuid"] = o.Uuid
	}
	if true {
		toSerialize["password"] = o.Password
	}
	if !isNil(o.PatternWithDigits) {
		toSerialize["pattern_with_digits"] = o.PatternWithDigits
	}
	if !isNil(o.PatternWithDigitsAndDelimiter) {
		toSerialize["pattern_with_digits_and_delimiter"] = o.PatternWithDigitsAndDelimiter
	}

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return json.Marshal(toSerialize)
}

func (o *FormatTest) UnmarshalJSON(bytes []byte) (err error) {
	varFormatTest := _FormatTest{}

	if err = json.Unmarshal(bytes, &varFormatTest); err == nil {
		*o = FormatTest(varFormatTest)
	}

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(bytes, &additionalProperties); err == nil {
		delete(additionalProperties, "integer")
		delete(additionalProperties, "int32")
		delete(additionalProperties, "int64")
		delete(additionalProperties, "number")
		delete(additionalProperties, "float")
		delete(additionalProperties, "double")
		delete(additionalProperties, "string")
		delete(additionalProperties, "byte")
		delete(additionalProperties, "binary")
		delete(additionalProperties, "date")
		delete(additionalProperties, "dateTime")
		delete(additionalProperties, "uuid")
		delete(additionalProperties, "password")
		delete(additionalProperties, "pattern_with_digits")
		delete(additionalProperties, "pattern_with_digits_and_delimiter")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableFormatTest struct {
	value *FormatTest
	isSet bool
}

func (v NullableFormatTest) Get() *FormatTest {
	return v.value
}

func (v *NullableFormatTest) Set(val *FormatTest) {
	v.value = val
	v.isSet = true
}

func (v NullableFormatTest) IsSet() bool {
	return v.isSet
}

func (v *NullableFormatTest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableFormatTest(val *FormatTest) *NullableFormatTest {
	return &NullableFormatTest{value: val, isSet: true}
}

func (v NullableFormatTest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableFormatTest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


