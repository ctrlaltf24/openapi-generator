/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package petstore
// AdditionalPropertiesClass struct for AdditionalPropertiesClass
type AdditionalPropertiesClass struct {
	MapString map[string]string `json:"map_string,omitempty"`
	MapNumber map[string]float32 `json:"map_number,omitempty"`
	MapInteger map[string]int32 `json:"map_integer,omitempty"`
	MapBoolean map[string]bool `json:"map_boolean,omitempty"`
	MapArrayInteger map[string][]int32 `json:"map_array_integer,omitempty"`
	MapArrayAnytype map[string][]map[string]interface{} `json:"map_array_anytype,omitempty"`
	MapMapString map[string]map[string]string `json:"map_map_string,omitempty"`
	MapMapAnytype map[string]map[string]map[string]interface{} `json:"map_map_anytype,omitempty"`
	Anytype1 map[string]interface{} `json:"anytype_1,omitempty"`
	Anytype2 map[string]interface{} `json:"anytype_2,omitempty"`
	Anytype3 map[string]interface{} `json:"anytype_3,omitempty"`
}
