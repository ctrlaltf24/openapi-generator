/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package petstore

import (
	"bytes"
	"encoding/json"
)

// InlineObject4 struct for InlineObject4
type InlineObject4 struct {
	// field1
	Param string `json:"param"`
	// field2
	Param2 string `json:"param2"`
}

// GetParam returns the Param field value
func (o *InlineObject4) GetParam() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Param
}

// SetParam sets field value
func (o *InlineObject4) SetParam(v string) {
	o.Param = v
}

// GetParam2 returns the Param2 field value
func (o *InlineObject4) GetParam2() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Param2
}

// SetParam2 sets field value
func (o *InlineObject4) SetParam2(v string) {
	o.Param2 = v
}

type NullableInlineObject4 struct {
	Value InlineObject4
	ExplicitNull bool
}

func (v NullableInlineObject4) MarshalJSON() ([]byte, error) {
    switch {
    case v.ExplicitNull:
        return []byte("null"), nil
    default:
		return json.Marshal(v.Value)
	}
}

func (v *NullableInlineObject4) UnmarshalJSON(src []byte) error {
	if bytes.Equal(src, []byte("null")) {
		v.ExplicitNull = true
		return nil
	}

	return json.Unmarshal(src, &v.Value)
}
