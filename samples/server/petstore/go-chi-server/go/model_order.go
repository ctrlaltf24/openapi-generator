/*
 * OpenAPI Petstore
 *
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package petstoreserver

import (
	"time"
)

// Order - An order for a pets from the pet store
type Order struct {

	Id int64 `json:"id,omitempty"`

	PetId int64 `json:"petId,omitempty"`

	Quantity int32 `json:"quantity,omitempty"`

	ShipDate time.Time `json:"shipDate,omitempty"`

	// Order Status
	Status string `json:"status,omitempty"`

	Complete bool `json:"complete,omitempty"`
}

// AssertOrderRequired checks if the required fields are not zero-ed
func AssertOrderRequired(obj Order) error {
	return nil
}
