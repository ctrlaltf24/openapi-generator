# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""

import re  # noqa: F401
import typing  # noqa: F401
import functools  # noqa: F401

import decimal  # noqa: F401
from datetime import date, datetime  # noqa: F401
import uuid  # noqa: F401

import frozendict  # noqa: F401

from petstore_api import schemas  # noqa: F401


class FormatTest(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        required = {
            "date",
            "number",
            "password",
            "byte",
        }
        class properties:
            
            
            class number(
                schemas.NumberSchema
            ):
            
            
                class MetaOapg:
                    inclusive_maximum = 543.2
                    inclusive_minimum = 32.1
                    multiple_of = 32.5
            byte = schemas.StrSchema
            date = schemas.DateSchema
            
            
            class password(
                schemas.StrSchema
            ):
            
            
                class MetaOapg:
                    max_length = 64
                    min_length = 10
            
            
            class integer(
                schemas.IntSchema
            ):
            
            
                class MetaOapg:
                    inclusive_maximum = 100
                    inclusive_minimum = 10
                    multiple_of = 2
            int32 = schemas.Int32Schema
            
            
            class int32withValidations(
                schemas.Int32Schema
            ):
            
            
                class MetaOapg:
                    inclusive_maximum = 200
                    inclusive_minimum = 20
            int64 = schemas.Int64Schema
            
            
            class _float(
                schemas.Float32Schema
            ):
            
            
                class MetaOapg:
                    inclusive_maximum = 987.6
                    inclusive_minimum = 54.3
            float32 = schemas.Float32Schema
            
            
            class double(
                schemas.Float64Schema
            ):
            
            
                class MetaOapg:
                    inclusive_maximum = 123.4
                    inclusive_minimum = 67.8
            float64 = schemas.Float64Schema
            
            
            class arrayWithUniqueItems(
                schemas.ListSchema
            ):
            
            
                class MetaOapg:
                    unique_items = True
                    items = schemas.NumberSchema
            
                def __new__(
                    cls,
                    arg: typing.Union[typing.Tuple[typing.Union[MetaOapg.items, decimal.Decimal, int, float, ]], typing.List[typing.Union[MetaOapg.items, decimal.Decimal, int, float, ]]],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'arrayWithUniqueItems':
                    return super().__new__(
                        cls,
                        arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> MetaOapg.items:
                    return super().__getitem__(i)
            
            
            class string(
                schemas.StrSchema
            ):
            
            
                class MetaOapg:
                    regex=[{
                        'pattern': r'[a-z]',  # noqa: E501
                        'flags': (
                            re.IGNORECASE
                        )
                    }]
            binary = schemas.BinarySchema
            dateTime = schemas.DateTimeSchema
            uuid = schemas.UUIDSchema
            uuidNoExample = schemas.UUIDSchema
            
            
            class pattern_with_digits(
                schemas.StrSchema
            ):
            
            
                class MetaOapg:
                    regex=[{
                        'pattern': r'^\d{10}$',  # noqa: E501
                    }]
            
            
            class pattern_with_digits_and_delimiter(
                schemas.StrSchema
            ):
            
            
                class MetaOapg:
                    regex=[{
                        'pattern': r'^image_\d{1,3}$',  # noqa: E501
                        'flags': (
                            re.IGNORECASE
                        )
                    }]
            noneProp = schemas.NoneSchema
            __annotations__ = {
                "number": number,
                "byte": byte,
                "date": date,
                "password": password,
                "integer": integer,
                "int32": int32,
                "int32withValidations": int32withValidations,
                "int64": int64,
                "float": _float,
                "float32": float32,
                "double": double,
                "float64": float64,
                "arrayWithUniqueItems": arrayWithUniqueItems,
                "string": string,
                "binary": binary,
                "dateTime": dateTime,
                "uuid": uuid,
                "uuidNoExample": uuidNoExample,
                "pattern_with_digits": pattern_with_digits,
                "pattern_with_digits_and_delimiter": pattern_with_digits_and_delimiter,
                "noneProp": noneProp,
            }
        additional_properties = schemas.AnyTypeSchema
    
    date: MetaOapg.properties.date
    number: MetaOapg.properties.number
    password: MetaOapg.properties.password
    byte: MetaOapg.properties.byte
    integer: typing.Union[MetaOapg.properties.integer, schemas.Unset]
    int32: typing.Union[MetaOapg.properties.int32, schemas.Unset]
    int32withValidations: typing.Union[MetaOapg.properties.int32withValidations, schemas.Unset]
    int64: typing.Union[MetaOapg.properties.int64, schemas.Unset]
    float32: typing.Union[MetaOapg.properties.float32, schemas.Unset]
    double: typing.Union[MetaOapg.properties.double, schemas.Unset]
    float64: typing.Union[MetaOapg.properties.float64, schemas.Unset]
    arrayWithUniqueItems: typing.Union[MetaOapg.properties.arrayWithUniqueItems, schemas.Unset]
    string: typing.Union[MetaOapg.properties.string, schemas.Unset]
    binary: typing.Union[MetaOapg.properties.binary, schemas.Unset]
    dateTime: typing.Union[MetaOapg.properties.dateTime, schemas.Unset]
    uuid: typing.Union[MetaOapg.properties.uuid, schemas.Unset]
    uuidNoExample: typing.Union[MetaOapg.properties.uuidNoExample, schemas.Unset]
    pattern_with_digits: typing.Union[MetaOapg.properties.pattern_with_digits, schemas.Unset]
    pattern_with_digits_and_delimiter: typing.Union[MetaOapg.properties.pattern_with_digits_and_delimiter, schemas.Unset]
    noneProp: typing.Union[MetaOapg.properties.noneProp, schemas.Unset]
    
    @typing.overload
    def __getitem__(self, name: typing.Literal["date"]) -> MetaOapg.properties.date: ...
    
    @typing.overload
    def __getitem__(self, name: typing.Literal["number"]) -> MetaOapg.properties.number: ...
    
    @typing.overload
    def __getitem__(self, name: typing.Literal["password"]) -> MetaOapg.properties.password: ...
    
    @typing.overload
    def __getitem__(self, name: typing.Literal["byte"]) -> MetaOapg.properties.byte: ...
    
    @typing.overload
    def __getitem__(self, name: typing.Literal["integer"]) -> typing.Union[MetaOapg.properties.integer, schemas.Unset]: ...
    
    @typing.overload
    def __getitem__(self, name: typing.Literal["int32"]) -> typing.Union[MetaOapg.properties.int32, schemas.Unset]: ...
    
    @typing.overload
    def __getitem__(self, name: typing.Literal["int32withValidations"]) -> typing.Union[MetaOapg.properties.int32withValidations, schemas.Unset]: ...
    
    @typing.overload
    def __getitem__(self, name: typing.Literal["int64"]) -> typing.Union[MetaOapg.properties.int64, schemas.Unset]: ...
    
    @typing.overload
    def __getitem__(self, name: typing.Literal["float"]) -> typing.Union[MetaOapg.properties._float, schemas.Unset]: ...
    
    @typing.overload
    def __getitem__(self, name: typing.Literal["float32"]) -> typing.Union[MetaOapg.properties.float32, schemas.Unset]: ...
    
    @typing.overload
    def __getitem__(self, name: typing.Literal["double"]) -> typing.Union[MetaOapg.properties.double, schemas.Unset]: ...
    
    @typing.overload
    def __getitem__(self, name: typing.Literal["float64"]) -> typing.Union[MetaOapg.properties.float64, schemas.Unset]: ...
    
    @typing.overload
    def __getitem__(self, name: typing.Literal["arrayWithUniqueItems"]) -> typing.Union[MetaOapg.properties.arrayWithUniqueItems, schemas.Unset]: ...
    
    @typing.overload
    def __getitem__(self, name: typing.Literal["string"]) -> typing.Union[MetaOapg.properties.string, schemas.Unset]: ...
    
    @typing.overload
    def __getitem__(self, name: typing.Literal["binary"]) -> typing.Union[MetaOapg.properties.binary, schemas.Unset]: ...
    
    @typing.overload
    def __getitem__(self, name: typing.Literal["dateTime"]) -> typing.Union[MetaOapg.properties.dateTime, schemas.Unset]: ...
    
    @typing.overload
    def __getitem__(self, name: typing.Literal["uuid"]) -> typing.Union[MetaOapg.properties.uuid, schemas.Unset]: ...
    
    @typing.overload
    def __getitem__(self, name: typing.Literal["uuidNoExample"]) -> typing.Union[MetaOapg.properties.uuidNoExample, schemas.Unset]: ...
    
    @typing.overload
    def __getitem__(self, name: typing.Literal["pattern_with_digits"]) -> typing.Union[MetaOapg.properties.pattern_with_digits, schemas.Unset]: ...
    
    @typing.overload
    def __getitem__(self, name: typing.Literal["pattern_with_digits_and_delimiter"]) -> typing.Union[MetaOapg.properties.pattern_with_digits_and_delimiter, schemas.Unset]: ...
    
    @typing.overload
    def __getitem__(self, name: typing.Literal["noneProp"]) -> typing.Union[MetaOapg.properties.noneProp, schemas.Unset]: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> MetaOapg.additional_properties: ...
    
    def __getitem__(self, name: typing.Union[str, typing.Literal["date"], typing.Literal["number"], typing.Literal["password"], typing.Literal["byte"], typing.Literal["integer"], typing.Literal["int32"], typing.Literal["int32withValidations"], typing.Literal["int64"], typing.Literal["float"], typing.Literal["float32"], typing.Literal["double"], typing.Literal["float64"], typing.Literal["arrayWithUniqueItems"], typing.Literal["string"], typing.Literal["binary"], typing.Literal["dateTime"], typing.Literal["uuid"], typing.Literal["uuidNoExample"], typing.Literal["pattern_with_digits"], typing.Literal["pattern_with_digits_and_delimiter"], typing.Literal["noneProp"], ]):
        # dict_instance[name] accessor
        if not hasattr(self.MetaOapg, 'properties') or name not in self.MetaOapg.properties.__annotations__:
            return super().__getitem__(name)
        try:
            return super().__getitem__(name)
        except KeyError:
            return schemas.unset

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        date: typing.Union[MetaOapg.properties.date, date, str, ],
        number: typing.Union[MetaOapg.properties.number, decimal.Decimal, int, float, ],
        password: typing.Union[MetaOapg.properties.password, str, ],
        byte: typing.Union[MetaOapg.properties.byte, str, ],
        integer: typing.Union[MetaOapg.properties.integer, int, schemas.Unset] = schemas.unset,
        int32: typing.Union[MetaOapg.properties.int32, int, schemas.Unset] = schemas.unset,
        int32withValidations: typing.Union[MetaOapg.properties.int32withValidations, int, schemas.Unset] = schemas.unset,
        int64: typing.Union[MetaOapg.properties.int64, int, schemas.Unset] = schemas.unset,
        float32: typing.Union[MetaOapg.properties.float32, float, schemas.Unset] = schemas.unset,
        double: typing.Union[MetaOapg.properties.double, float, schemas.Unset] = schemas.unset,
        float64: typing.Union[MetaOapg.properties.float64, float, schemas.Unset] = schemas.unset,
        arrayWithUniqueItems: typing.Union[MetaOapg.properties.arrayWithUniqueItems, tuple, schemas.Unset] = schemas.unset,
        string: typing.Union[MetaOapg.properties.string, str, schemas.Unset] = schemas.unset,
        binary: typing.Union[MetaOapg.properties.binary, schemas.Unset] = schemas.unset,
        dateTime: typing.Union[MetaOapg.properties.dateTime, datetime, str, schemas.Unset] = schemas.unset,
        uuid: typing.Union[MetaOapg.properties.uuid, uuid.UUID, str, schemas.Unset] = schemas.unset,
        uuidNoExample: typing.Union[MetaOapg.properties.uuidNoExample, uuid.UUID, str, schemas.Unset] = schemas.unset,
        pattern_with_digits: typing.Union[MetaOapg.properties.pattern_with_digits, str, schemas.Unset] = schemas.unset,
        pattern_with_digits_and_delimiter: typing.Union[MetaOapg.properties.pattern_with_digits_and_delimiter, str, schemas.Unset] = schemas.unset,
        noneProp: typing.Union[MetaOapg.properties.noneProp, None, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[MetaOapg.additional_properties, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes, ],
    ) -> 'FormatTest':
        return super().__new__(
            cls,
            *args,
            date=date,
            number=number,
            password=password,
            byte=byte,
            integer=integer,
            int32=int32,
            int32withValidations=int32withValidations,
            int64=int64,
            float32=float32,
            double=double,
            float64=float64,
            arrayWithUniqueItems=arrayWithUniqueItems,
            string=string,
            binary=binary,
            dateTime=dateTime,
            uuid=uuid,
            uuidNoExample=uuidNoExample,
            pattern_with_digits=pattern_with_digits,
            pattern_with_digits_and_delimiter=pattern_with_digits_and_delimiter,
            noneProp=noneProp,
            _configuration=_configuration,
            **kwargs,
        )
