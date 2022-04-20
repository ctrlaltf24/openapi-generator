# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""

import re  # noqa: F401
import sys  # noqa: F401
import typing  # noqa: F401

from frozendict import frozendict  # noqa: F401

import decimal  # noqa: F401
from datetime import date, datetime  # noqa: F401
from frozendict import frozendict  # noqa: F401

from petstore_api.schemas import (  # noqa: F401
    AnyTypeSchema,
    ComposedSchema,
    DictSchema,
    ListSchema,
    StrSchema,
    IntSchema,
    Int32Schema,
    Int64Schema,
    Float32Schema,
    Float64Schema,
    NumberSchema,
    UUIDSchema,
    DateSchema,
    DateTimeSchema,
    DecimalSchema,
    BoolSchema,
    BinarySchema,
    NoneSchema,
    none_type,
    Configuration,
    Unset,
    unset,
    ComposedBase,
    ListBase,
    DictBase,
    NoneBase,
    StrBase,
    IntBase,
    Int32Base,
    Int64Base,
    Float32Base,
    Float64Base,
    NumberBase,
    UUIDBase,
    DateBase,
    DateTimeBase,
    BoolBase,
    BinaryBase,
    Schema,
    _SchemaValidator,
    _SchemaTypeChecker,
    _SchemaEnumMaker
)


class Zebra(
    DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """
    _required_property_names = set((
        'className',
    ))
    
    
    class type(
        _SchemaEnumMaker(
            enum_value_to_name={
                "plains": "PLAINS",
                "mountain": "MOUNTAIN",
                "grevys": "GREVYS",
            }
        ),
        StrSchema
    ):
        
        @classmethod
        @property
        def PLAINS(cls):
            return cls("plains")
        
        @classmethod
        @property
        def MOUNTAIN(cls):
            return cls("mountain")
        
        @classmethod
        @property
        def GREVYS(cls):
            return cls("grevys")
    
    
    class className(
        _SchemaEnumMaker(
            enum_value_to_name={
                "zebra": "ZEBRA",
            }
        ),
        StrSchema
    ):
        
        @classmethod
        @property
        def ZEBRA(cls):
            return cls("zebra")


    def __new__(
        cls,
        *args: typing.Union[dict, frozendict, ],
        className: className,
        type: typing.Union[type, Unset] = unset,
        _configuration: typing.Optional[Configuration] = None,
        **kwargs: typing.Type[Schema],
    ) -> 'Zebra':
        return super().__new__(
            cls,
            *args,
            className=className,
            type=type,
            _configuration=_configuration,
            **kwargs,
        )
