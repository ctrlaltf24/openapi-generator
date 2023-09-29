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
from pydantic import BaseModel, StrictInt, StrictStr
from pydantic import Field

class Name(BaseModel):
    """
    Model for testing model name same as property name  # noqa: E501
    """
    name: StrictInt
    snake_case: Optional[StrictInt] = None
    var_property: Optional[StrictStr] = Field(default=None, alias="property")
    var_123_number: Optional[StrictInt] = Field(default=None, alias="123Number")
    additional_properties: Dict[str, Any] = {}
    __properties = ["name", "snake_case", "property", "123Number"]

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
    def from_json(cls, json_str: str) -> Name:
        """Create an instance of Name from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.model_dump(by_alias=True,
                          exclude={
                            "snake_case",
                            "var_123_number",
                            "additional_properties"
                          },
                          exclude_none=True)
        # puts key-value pairs in additional_properties in the top level
        if self.additional_properties is not None:
            for _key, _value in self.additional_properties.items():
                _dict[_key] = _value

        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> Name:
        """Create an instance of Name from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return Name.model_validate(obj)

        _obj = Name.model_validate({
            "name": obj.get("name"),
            "snake_case": obj.get("snake_case"),
            "property": obj.get("property"),
            "123Number": obj.get("123Number")
        })
        # store additional fields in additional_properties
        for _key in obj.keys():
            if _key not in cls.__properties.default:
                _obj.additional_properties[_key] = obj.get(_key)

        return _obj


