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

from decimal import Decimal  # noqa: F401
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
    DateSchema,
    DateTimeSchema,
    BoolSchema,
    BinarySchema,
    NoneSchema,
    none_type,
    InstantiationMetadata,
    Unset,
    unset,
    ComposedBase,
    ListBase,
    DictBase,
    NoneBase,
    StrBase,
    IntBase,
    NumberBase,
    DateBase,
    DateTimeBase,
    BoolBase,
    BinaryBase,
    Schema,
    _SchemaValidator,
    _SchemaTypeChecker,
    _SchemaEnumMaker
)


class EnumTest(
    DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """
    _required_property_names = set((
        'enum_string_required',
    ))
    
    
    class enum_string(
        _SchemaEnumMaker(
            enum_value_to_name={
                "UPPER": "UPPER",
                "lower": "LOWER",
                "": "EMPTY",
            }
        ),
        StrSchema
    ):
        
        @classmethod
        @property
        def UPPER(cls):
            return cls._enum_by_value["UPPER"]("UPPER")
        
        @classmethod
        @property
        def LOWER(cls):
            return cls._enum_by_value["lower"]("lower")
        
        @classmethod
        @property
        def EMPTY(cls):
            return cls._enum_by_value[""]("")
    
    
    class enum_string_required(
        _SchemaEnumMaker(
            enum_value_to_name={
                "UPPER": "UPPER",
                "lower": "LOWER",
                "": "EMPTY",
            }
        ),
        StrSchema
    ):
        
        @classmethod
        @property
        def UPPER(cls):
            return cls._enum_by_value["UPPER"]("UPPER")
        
        @classmethod
        @property
        def LOWER(cls):
            return cls._enum_by_value["lower"]("lower")
        
        @classmethod
        @property
        def EMPTY(cls):
            return cls._enum_by_value[""]("")
    
    
    class enum_integer(
        _SchemaEnumMaker(
            enum_value_to_name={
                1: "POSITIVE_1",
                -1: "NEGATIVE_1",
            }
        ),
        Int32Schema
    ):
        
        @classmethod
        @property
        def POSITIVE_1(cls):
            return cls._enum_by_value[1](1)
        
        @classmethod
        @property
        def NEGATIVE_1(cls):
            return cls._enum_by_value[-1](-1)
    
    
    class enum_number(
        _SchemaEnumMaker(
            enum_value_to_name={
                1.1: "POSITIVE_1_PT_1",
                -1.2: "NEGATIVE_1_PT_2",
            }
        ),
        Float64Schema
    ):
        
        @classmethod
        @property
        def POSITIVE_1_PT_1(cls):
            return cls._enum_by_value[1.1](1.1)
        
        @classmethod
        @property
        def NEGATIVE_1_PT_2(cls):
            return cls._enum_by_value[-1.2](-1.2)

    @classmethod
    @property
    def stringEnum(cls) -> typing.Type['StringEnum']:
        return StringEnum

    @classmethod
    @property
    def IntegerEnum(cls) -> typing.Type['IntegerEnum']:
        return IntegerEnum

    @classmethod
    @property
    def StringEnumWithDefaultValue(cls) -> typing.Type['StringEnumWithDefaultValue']:
        return StringEnumWithDefaultValue

    @classmethod
    @property
    def IntegerEnumWithDefaultValue(cls) -> typing.Type['IntegerEnumWithDefaultValue']:
        return IntegerEnumWithDefaultValue

    @classmethod
    @property
    def IntegerEnumOneValue(cls) -> typing.Type['IntegerEnumOneValue']:
        return IntegerEnumOneValue


    def __new__(
        cls,
        *args: typing.Union[dict, frozendict, ],
        enum_string_required: enum_string_required,
        enum_string: typing.Union[enum_string, Unset] = unset,
        enum_integer: typing.Union[enum_integer, Unset] = unset,
        enum_number: typing.Union[enum_number, Unset] = unset,
        stringEnum: typing.Union['StringEnum', Unset] = unset,
        IntegerEnum: typing.Union['IntegerEnum', Unset] = unset,
        StringEnumWithDefaultValue: typing.Union['StringEnumWithDefaultValue', Unset] = unset,
        IntegerEnumWithDefaultValue: typing.Union['IntegerEnumWithDefaultValue', Unset] = unset,
        IntegerEnumOneValue: typing.Union['IntegerEnumOneValue', Unset] = unset,
        _instantiation_metadata: typing.Optional[InstantiationMetadata] = None,
        **kwargs: typing.Type[Schema],
    ):
        return super().__new__(
            cls,
            *args,
            enum_string_required=enum_string_required,
            enum_string=enum_string,
            enum_integer=enum_integer,
            enum_number=enum_number,
            stringEnum=stringEnum,
            IntegerEnum=IntegerEnum,
            StringEnumWithDefaultValue=StringEnumWithDefaultValue,
            IntegerEnumWithDefaultValue=IntegerEnumWithDefaultValue,
            IntegerEnumOneValue=IntegerEnumOneValue,
            _instantiation_metadata=_instantiation_metadata,
            **kwargs,
        )

from petstore_api.model.integer_enum import IntegerEnum
from petstore_api.model.integer_enum_one_value import IntegerEnumOneValue
from petstore_api.model.integer_enum_with_default_value import IntegerEnumWithDefaultValue
from petstore_api.model.string_enum import StringEnum
from petstore_api.model.string_enum_with_default_value import StringEnumWithDefaultValue
