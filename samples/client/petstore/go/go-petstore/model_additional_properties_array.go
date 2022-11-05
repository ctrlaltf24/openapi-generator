/*
OpenAPI Petstore

This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

API version: 1.0.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package petstore

import (
	"encoding/json"
)

// AdditionalPropertiesArray struct for AdditionalPropertiesArray
type AdditionalPropertiesArray struct {
	Name *string `json:"name,omitempty"`
}

// NewAdditionalPropertiesArray instantiates a new AdditionalPropertiesArray object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAdditionalPropertiesArray() *AdditionalPropertiesArray {
	this := AdditionalPropertiesArray{}
	return &this
}

// NewAdditionalPropertiesArrayWithDefaults instantiates a new AdditionalPropertiesArray object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAdditionalPropertiesArrayWithDefaults() *AdditionalPropertiesArray {
	this := AdditionalPropertiesArray{}
	return &this
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *AdditionalPropertiesArray) GetName() string {
	if o == nil || isNil(o.Name) {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AdditionalPropertiesArray) GetNameOk() (*string, bool) {
	if o == nil || isNil(o.Name) {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *AdditionalPropertiesArray) HasName() bool {
	if o != nil && !isNil(o.Name) {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *AdditionalPropertiesArray) SetName(v string) {
	o.Name = &v
}

func (o AdditionalPropertiesArray) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Name) {
		toSerialize["name"] = o.Name
	}
	return json.Marshal(toSerialize)
}

type NullableAdditionalPropertiesArray struct {
	value *AdditionalPropertiesArray
	isSet bool
}

func (v NullableAdditionalPropertiesArray) Get() *AdditionalPropertiesArray {
	return v.value
}

func (v *NullableAdditionalPropertiesArray) Set(val *AdditionalPropertiesArray) {
	v.value = val
	v.isSet = true
}

func (v NullableAdditionalPropertiesArray) IsSet() bool {
	return v.isSet
}

func (v *NullableAdditionalPropertiesArray) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAdditionalPropertiesArray(val *AdditionalPropertiesArray) *NullableAdditionalPropertiesArray {
	return &NullableAdditionalPropertiesArray{value: val, isSet: true}
}

func (v NullableAdditionalPropertiesArray) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAdditionalPropertiesArray) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


