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

// DuplicatedPropChildAllOf struct for DuplicatedPropChildAllOf
type DuplicatedPropChildAllOf struct {
	// A discriminator value
	DupProp *string `json:"dup-prop,omitempty"`
	AdditionalProperties map[string]interface{}
}

type _DuplicatedPropChildAllOf DuplicatedPropChildAllOf

// NewDuplicatedPropChildAllOf instantiates a new DuplicatedPropChildAllOf object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewDuplicatedPropChildAllOf() *DuplicatedPropChildAllOf {
	this := DuplicatedPropChildAllOf{}
	return &this
}

// NewDuplicatedPropChildAllOfWithDefaults instantiates a new DuplicatedPropChildAllOf object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewDuplicatedPropChildAllOfWithDefaults() *DuplicatedPropChildAllOf {
	this := DuplicatedPropChildAllOf{}
	return &this
}

// GetDupProp returns the DupProp field value if set, zero value otherwise.
func (o *DuplicatedPropChildAllOf) GetDupProp() string {
	if o == nil || isNil(o.DupProp) {
		var ret string
		return ret
	}
	return *o.DupProp
}

// GetDupPropOk returns a tuple with the DupProp field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DuplicatedPropChildAllOf) GetDupPropOk() (*string, bool) {
	if o == nil || isNil(o.DupProp) {
    return nil, false
	}
	return o.DupProp, true
}

// HasDupProp returns a boolean if a field has been set.
func (o *DuplicatedPropChildAllOf) HasDupProp() bool {
	if o != nil && !isNil(o.DupProp) {
		return true
	}

	return false
}

// SetDupProp gets a reference to the given string and assigns it to the DupProp field.
func (o *DuplicatedPropChildAllOf) SetDupProp(v string) {
	o.DupProp = &v
}

func (o DuplicatedPropChildAllOf) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.DupProp) {
		toSerialize["dup-prop"] = o.DupProp
	}

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return json.Marshal(toSerialize)
}

func (o *DuplicatedPropChildAllOf) UnmarshalJSON(bytes []byte) (err error) {
	varDuplicatedPropChildAllOf := _DuplicatedPropChildAllOf{}

	if err = json.Unmarshal(bytes, &varDuplicatedPropChildAllOf); err == nil {
		*o = DuplicatedPropChildAllOf(varDuplicatedPropChildAllOf)
	}

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(bytes, &additionalProperties); err == nil {
		delete(additionalProperties, "dup-prop")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableDuplicatedPropChildAllOf struct {
	value *DuplicatedPropChildAllOf
	isSet bool
}

func (v NullableDuplicatedPropChildAllOf) Get() *DuplicatedPropChildAllOf {
	return v.value
}

func (v *NullableDuplicatedPropChildAllOf) Set(val *DuplicatedPropChildAllOf) {
	v.value = val
	v.isSet = true
}

func (v NullableDuplicatedPropChildAllOf) IsSet() bool {
	return v.isSet
}

func (v *NullableDuplicatedPropChildAllOf) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableDuplicatedPropChildAllOf(val *DuplicatedPropChildAllOf) *NullableDuplicatedPropChildAllOf {
	return &NullableDuplicatedPropChildAllOf{value: val, isSet: true}
}

func (v NullableDuplicatedPropChildAllOf) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableDuplicatedPropChildAllOf) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


