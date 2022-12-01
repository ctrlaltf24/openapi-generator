# Entity

## Enum Variants

| Name | Value |
|---- | -----|
| Bar | Bar |
| BarCreate | Bar_Create |
| Foo | Foo |
| Pasta | Pasta |
| Pizza | Pizza |
| PizzaSpeziale | PizzaSpeziale |

## Bar

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | 
**bar_prop_a** | Option<**String**> |  | [optional]
**foo_prop_b** | Option<**String**> |  | [optional]
**foo** | Option<[**crate::models::FooRefOrValue**](FooRefOrValue.md)> |  | [optional]
**href** | Option<**String**> | Hyperlink reference | [optional]
**at_schema_location** | Option<**String**> | A URI to a JSON-Schema file that defines additional attributes and relationships | [optional]
**at_base_type** | Option<**String**> | When sub-classing, this defines the super-class | [optional]

## BarCreate

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bar_prop_a** | Option<**String**> |  | [optional]
**foo_prop_b** | Option<**String**> |  | [optional]
**foo** | Option<[**crate::models::FooRefOrValue**](FooRefOrValue.md)> |  | [optional]
**href** | Option<**String**> | Hyperlink reference | [optional]
**id** | Option<**String**> | unique identifier | [optional]
**at_schema_location** | Option<**String**> | A URI to a JSON-Schema file that defines additional attributes and relationships | [optional]
**at_base_type** | Option<**String**> | When sub-classing, this defines the super-class | [optional]

## Foo

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**foo_prop_a** | Option<**String**> |  | [optional]
**foo_prop_b** | Option<**String**> |  | [optional]
**href** | Option<**String**> | Hyperlink reference | [optional]
**id** | Option<**String**> | unique identifier | [optional]
**at_schema_location** | Option<**String**> | A URI to a JSON-Schema file that defines additional attributes and relationships | [optional]
**at_base_type** | Option<**String**> | When sub-classing, this defines the super-class | [optional]

## Pasta

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vendor** | Option<**String**> |  | [optional]
**href** | Option<**String**> | Hyperlink reference | [optional]
**id** | Option<**String**> | unique identifier | [optional]
**at_schema_location** | Option<**String**> | A URI to a JSON-Schema file that defines additional attributes and relationships | [optional]
**at_base_type** | Option<**String**> | When sub-classing, this defines the super-class | [optional]

## Pizza

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pizza_size** | Option<**f32**> |  | [optional]
**href** | Option<**String**> | Hyperlink reference | [optional]
**id** | Option<**String**> | unique identifier | [optional]
**at_schema_location** | Option<**String**> | A URI to a JSON-Schema file that defines additional attributes and relationships | [optional]
**at_base_type** | Option<**String**> | When sub-classing, this defines the super-class | [optional]

## PizzaSpeziale

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**toppings** | Option<**String**> |  | [optional]
**href** | Option<**String**> | Hyperlink reference | [optional]
**id** | Option<**String**> | unique identifier | [optional]
**at_schema_location** | Option<**String**> | A URI to a JSON-Schema file that defines additional attributes and relationships | [optional]
**at_base_type** | Option<**String**> | When sub-classing, this defines the super-class | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


