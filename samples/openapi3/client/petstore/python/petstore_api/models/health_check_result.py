# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

    The version of the OpenAPI document: 1.0.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json


from typing import Any, Dict, Optional
from pydantic import BaseModel, StrictStr
from pydantic import Field

class HealthCheckResult(BaseModel):
    """
    Just a string to inform instance is up and running. Make it nullable in hope to get it as pointer in generated model.  # noqa: E501
    """
    nullable_message: Optional[StrictStr] = Field(default=None, alias="NullableMessage")
    additional_properties: Dict[str, Any] = {}
    __properties = ["NullableMessage"]

    model_config = {
        "populate_by_name": True,
        "validate_assignment": True
    }


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> HealthCheckResult:
        """Create an instance of HealthCheckResult from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.model_dump(by_alias=True,
                          exclude={
                            "additional_properties"
                          },
                          exclude_none=True)
        # puts key-value pairs in additional_properties in the top level
        if self.additional_properties is not None:
            for _key, _value in self.additional_properties.items():
                _dict[_key] = _value

        # set to None if nullable_message (nullable) is None
        # and model_fields_set contains the field
        if self.nullable_message is None and "nullable_message" in self.model_fields_set:
            _dict['NullableMessage'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> HealthCheckResult:
        """Create an instance of HealthCheckResult from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return HealthCheckResult.model_validate(obj)

        _obj = HealthCheckResult.model_validate({
            "NullableMessage": obj.get("NullableMessage")
        })
        # store additional fields in additional_properties
        for _key in obj.keys():
            if _key not in cls.__properties.default:
                _obj.additional_properties[_key] = obj.get(_key)

        return _obj


