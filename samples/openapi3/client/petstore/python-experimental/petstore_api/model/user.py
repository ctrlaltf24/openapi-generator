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
import functools  # noqa: F401

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
    NoneClass,
    BoolClass,
    _SchemaValidator,
    _SchemaTypeChecker,
    _SchemaEnumMaker
)


class User(
    DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """
    id = Int64Schema
    username = StrSchema
    firstName = StrSchema
    lastName = StrSchema
    email = StrSchema
    password = StrSchema
    phone = StrSchema
    userStatus = Int32Schema
    objectWithNoDeclaredProps = DictSchema
    
    
    class objectWithNoDeclaredPropsNullable(
        _SchemaTypeChecker(typing.Union[frozendict, NoneClass, ]),
        DictBase,
        NoneBase,
        Schema
    ):
    
        def __new__(
            cls,
            *args: typing.Union[dict, frozendict, None, ],
            _configuration: typing.Optional[Configuration] = None,
            **kwargs: typing.Type[Schema],
        ) -> 'objectWithNoDeclaredPropsNullable':
            return super().__new__(
                cls,
                *args,
                _configuration=_configuration,
                **kwargs,
            )
    anyTypeProp = AnyTypeSchema
    
    
    class anyTypeExceptNullProp(
        ComposedSchema
    ):
    
        @classmethod
        @property
        @functools.cache
        def _composed_schemas(cls):
            # we need this here to make our import statements work
            # we must store _composed_schemas in here so the code is only run
            # when we invoke this method. If we kept this at the class
            # level we would get an error because the class level
            # code would be run when this module is imported, and these composed
            # classes don't exist yet because their module has not finished
            # loading
            not_schema = NoneSchema
            return {
                'allOf': [
                ],
                'oneOf': [
                ],
                'anyOf': [
                ],
                'not':
                    not_schema
            }
    
        def __new__(
            cls,
            *args: typing.Union[dict, frozendict, str, date, datetime, int, float, decimal.Decimal, None, list, tuple, bytes],
            _configuration: typing.Optional[Configuration] = None,
            **kwargs: typing.Type[Schema],
        ) -> 'anyTypeExceptNullProp':
            return super().__new__(
                cls,
                *args,
                _configuration=_configuration,
                **kwargs,
            )
    anyTypePropNullable = AnyTypeSchema


    def __new__(
        cls,
        *args: typing.Union[dict, frozendict, ],
        id: typing.Union[id, Unset] = unset,
        username: typing.Union[username, Unset] = unset,
        firstName: typing.Union[firstName, Unset] = unset,
        lastName: typing.Union[lastName, Unset] = unset,
        email: typing.Union[email, Unset] = unset,
        password: typing.Union[password, Unset] = unset,
        phone: typing.Union[phone, Unset] = unset,
        userStatus: typing.Union[userStatus, Unset] = unset,
        objectWithNoDeclaredProps: typing.Union[objectWithNoDeclaredProps, Unset] = unset,
        objectWithNoDeclaredPropsNullable: typing.Union[objectWithNoDeclaredPropsNullable, Unset] = unset,
        anyTypeProp: typing.Union[anyTypeProp, Unset] = unset,
        anyTypeExceptNullProp: typing.Union[anyTypeExceptNullProp, Unset] = unset,
        anyTypePropNullable: typing.Union[anyTypePropNullable, Unset] = unset,
        _configuration: typing.Optional[Configuration] = None,
        **kwargs: typing.Type[Schema],
    ) -> 'User':
        return super().__new__(
            cls,
            *args,
            id=id,
            username=username,
            firstName=firstName,
            lastName=lastName,
            email=email,
            password=password,
            phone=phone,
            userStatus=userStatus,
            objectWithNoDeclaredProps=objectWithNoDeclaredProps,
            objectWithNoDeclaredPropsNullable=objectWithNoDeclaredPropsNullable,
            anyTypeProp=anyTypeProp,
            anyTypeExceptNullProp=anyTypeExceptNullProp,
            anyTypePropNullable=anyTypePropNullable,
            _configuration=_configuration,
            **kwargs,
        )
