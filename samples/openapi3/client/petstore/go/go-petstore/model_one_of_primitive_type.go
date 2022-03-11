/*
OpenAPI Petstore

This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

API version: 1.0.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package petstore

import (
	"encoding/json"
	"fmt"
)

// OneOfPrimitiveType - struct for OneOfPrimitiveType
type OneOfPrimitiveType struct {
	OneOfPrimitiveTypeChild *OneOfPrimitiveTypeChild
	Int32 *int32
}

// OneOfPrimitiveTypeChildAsOneOfPrimitiveType is a convenience function that returns OneOfPrimitiveTypeChild wrapped in OneOfPrimitiveType
func OneOfPrimitiveTypeChildAsOneOfPrimitiveType(v *OneOfPrimitiveTypeChild) OneOfPrimitiveType {
	return OneOfPrimitiveType{
		OneOfPrimitiveTypeChild: v,
	}
}

// int32AsOneOfPrimitiveType is a convenience function that returns int32 wrapped in OneOfPrimitiveType
func Int32AsOneOfPrimitiveType(v *int32) OneOfPrimitiveType {
	return OneOfPrimitiveType{
		Int32: v,
	}
}


// Unmarshal JSON data into one of the pointers in the struct
func (dst *OneOfPrimitiveType) UnmarshalJSON(data []byte) error {
	var err error
	match := 0
	// try to unmarshal data into OneOfPrimitiveTypeChild
	err = newStrictDecoder(data).Decode(&dst.OneOfPrimitiveTypeChild)
	if err == nil {
		jsonOneOfPrimitiveTypeChild, _ := json.Marshal(dst.OneOfPrimitiveTypeChild)
		if string(jsonOneOfPrimitiveTypeChild) == "{}" { // empty struct
			dst.OneOfPrimitiveTypeChild = nil
		} else {
			match++
		}
	} else {
		dst.OneOfPrimitiveTypeChild = nil
	}

	// try to unmarshal data into Int32
	err = newStrictDecoder(data).Decode(&dst.Int32)
	if err == nil {
		jsonInt32, _ := json.Marshal(dst.Int32)
		if string(jsonInt32) == "{}" { // empty struct
			dst.Int32 = nil
		} else {
			match++
		}
	} else {
		dst.Int32 = nil
	}

	if match > 1 { // more than 1 match
		// reset to nil
		dst.OneOfPrimitiveTypeChild = nil
		dst.Int32 = nil

		return fmt.Errorf("Data matches more than one schema in oneOf(OneOfPrimitiveType)")
	} else if match == 1 {
		return nil // exactly one match
	} else { // no match
		return fmt.Errorf("Data failed to match schemas in oneOf(OneOfPrimitiveType)")
	}
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src OneOfPrimitiveType) MarshalJSON() ([]byte, error) {
	if src.OneOfPrimitiveTypeChild != nil {
		return json.Marshal(&src.OneOfPrimitiveTypeChild)
	}

	if src.Int32 != nil {
		return json.Marshal(&src.Int32)
	}

	return nil, nil // no data in oneOf schemas
}

// Get the actual instance
func (obj *OneOfPrimitiveType) GetActualInstance() (interface{}) {
	if obj == nil {
		return nil
	}
	if obj.OneOfPrimitiveTypeChild != nil {
		return obj.OneOfPrimitiveTypeChild
	}

	if obj.Int32 != nil {
		return obj.Int32
	}

	// all schemas are nil
	return nil
}

type NullableOneOfPrimitiveType struct {
	value *OneOfPrimitiveType
	isSet bool
}

func (v NullableOneOfPrimitiveType) Get() *OneOfPrimitiveType {
	return v.value
}

func (v *NullableOneOfPrimitiveType) Set(val *OneOfPrimitiveType) {
	v.value = val
	v.isSet = true
}

func (v NullableOneOfPrimitiveType) IsSet() bool {
	return v.isSet
}

func (v *NullableOneOfPrimitiveType) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableOneOfPrimitiveType(val *OneOfPrimitiveType) *NullableOneOfPrimitiveType {
	return &NullableOneOfPrimitiveType{value: val, isSet: true}
}

func (v NullableOneOfPrimitiveType) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableOneOfPrimitiveType) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


