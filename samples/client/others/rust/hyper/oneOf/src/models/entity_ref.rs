/*
 * ByRefOrValue
 *
 * This tests for a oneOf interface representation 
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 * Generated by: https://openapi-generator.tech
 */

/// EntityRef : Entity reference schema to be use for all entityRef class.


#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
#[serde(tag = "attype")]
pub enum EntityRef {
    #[serde(rename="BarRef")]
    BarRef {
        /// Hyperlink reference
        #[serde(rename = "href", skip_serializing_if = "Option::is_none")]
        href: Option<String>,
        /// unique identifier
        #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
        id: Option<String>,
        /// A URI to a JSON-Schema file that defines additional attributes and relationships
        #[serde(rename = "@schemaLocation", skip_serializing_if = "Option::is_none")]
        at_schema_location: Option<String>,
        /// When sub-classing, this defines the super-class
        #[serde(rename = "@baseType", skip_serializing_if = "Option::is_none")]
        at_base_type: Option<String>,
    },
    #[serde(rename="FooRef")]
    FooRef {
        #[serde(rename = "foorefPropA", skip_serializing_if = "Option::is_none")]
        fooref_prop_a: Option<String>,
        /// Hyperlink reference
        #[serde(rename = "href", skip_serializing_if = "Option::is_none")]
        href: Option<String>,
        /// unique identifier
        #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
        id: Option<String>,
        /// A URI to a JSON-Schema file that defines additional attributes and relationships
        #[serde(rename = "@schemaLocation", skip_serializing_if = "Option::is_none")]
        at_schema_location: Option<String>,
        /// When sub-classing, this defines the super-class
        #[serde(rename = "@baseType", skip_serializing_if = "Option::is_none")]
        at_base_type: Option<String>,
    },
}

impl Default for EntityRef {
    fn default() -> Self {
        Self::BarRef {
            href: Default::default(),
            id: Default::default(),
            at_schema_location: Default::default(),
            at_base_type: Default::default(),
        }
    }
}




