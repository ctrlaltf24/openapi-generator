/*
 * oneOf test
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://openapi-generator.tech
 */



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
#[serde(tag = "realtype")]
pub enum CustomOneOfSchema {
    #[serde(rename="a-type")]
    ObjA {
        #[serde(rename = "message", skip_serializing_if = "Option::is_none")]
        message: Option<String>,
    },
    #[serde(rename="b-type")]
    ObjB {
        #[serde(rename = "description", skip_serializing_if = "Option::is_none")]
        description: Option<String>,
        #[serde(rename = "code", skip_serializing_if = "Option::is_none")]
        code: Option<i32>,
    },
}

impl Default for CustomOneOfSchema {
    fn default() -> Self {
        Self::ObjA {
            message: Default::default(),
        }
    }
}




