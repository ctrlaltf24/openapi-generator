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


class MapTest(
    DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """
    
    
    class map_map_of_string(
        DictSchema
    ):
        
        
        class _additional_properties(
            DictSchema
        ):
            _additional_properties = StrSchema
        
        
            def __new__(
                cls,
                *args: typing.Union[dict, frozendict, ],
                _configuration: typing.Optional[Configuration] = None,
                **kwargs: typing.Type[Schema],
            ) -> '_additional_properties':
                return super().__new__(
                    cls,
                    *args,
                    _configuration=_configuration,
                    **kwargs,
                )
    
    
        def __new__(
            cls,
            *args: typing.Union[dict, frozendict, ],
            _configuration: typing.Optional[Configuration] = None,
            **kwargs: typing.Type[Schema],
        ) -> 'map_map_of_string':
            return super().__new__(
                cls,
                *args,
                _configuration=_configuration,
                **kwargs,
            )
    
    
    class map_of_enum_string(
        DictSchema
    ):
        
        
        class _additional_properties(
            _SchemaEnumMaker(
                enum_value_to_name={
                    "UPPER": "UPPER",
                    "lower": "LOWER",
                }
            ),
            StrSchema
        ):
            
            @classmethod
            @property
            def UPPER(cls):
                return cls("UPPER")
            
            @classmethod
            @property
            def LOWER(cls):
                return cls("lower")
    
    
        def __new__(
            cls,
            *args: typing.Union[dict, frozendict, ],
            _configuration: typing.Optional[Configuration] = None,
            **kwargs: typing.Type[Schema],
        ) -> 'map_of_enum_string':
            return super().__new__(
                cls,
                *args,
                _configuration=_configuration,
                **kwargs,
            )
    
    
    class direct_map(
        DictSchema
    ):
        _additional_properties = BoolSchema
    
    
        def __new__(
            cls,
            *args: typing.Union[dict, frozendict, ],
            _configuration: typing.Optional[Configuration] = None,
            **kwargs: typing.Type[Schema],
        ) -> 'direct_map':
            return super().__new__(
                cls,
                *args,
                _configuration=_configuration,
                **kwargs,
            )

    @classmethod
    @property
    def indirect_map(cls) -> typing.Type['StringBooleanMap']:
        return StringBooleanMap


    def __new__(
        cls,
        *args: typing.Union[dict, frozendict, ],
        map_map_of_string: typing.Union[map_map_of_string, Unset] = unset,
        map_of_enum_string: typing.Union[map_of_enum_string, Unset] = unset,
        direct_map: typing.Union[direct_map, Unset] = unset,
        indirect_map: typing.Union['StringBooleanMap', Unset] = unset,
        _configuration: typing.Optional[Configuration] = None,
        **kwargs: typing.Type[Schema],
    ) -> 'MapTest':
        return super().__new__(
            cls,
            *args,
            map_map_of_string=map_map_of_string,
            map_of_enum_string=map_of_enum_string,
            direct_map=direct_map,
            indirect_map=indirect_map,
            _configuration=_configuration,
            **kwargs,
        )

from petstore_api.model.string_boolean_map import StringBooleanMap
