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


class MixedPropertiesAndAdditionalPropertiesClass(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        class properties:
            uuid = schemas.UUIDSchema
            dateTime = schemas.DateTimeSchema
            
            
            class map(
                schemas.DictSchema
            ):
            
            
                class MetaOapg:
                    
                    @classmethod
                    @property
                    def additional_properties(cls) -> typing.Type['Animal']:
                        return Animal
                
                def __getitem__(self, name: typing.Union[str, ]) -> 'Animal':
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
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: 'Animal',
                ) -> 'map':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                        **kwargs,
                    )
            __annotations__ = {
                "uuid": uuid,
                "dateTime": dateTime,
                "map": map,
            }
        additional_properties = schemas.AnyTypeSchema
    
    uuid: typing.Union[MetaOapg.properties.uuid, schemas.Unset]
    dateTime: typing.Union[MetaOapg.properties.dateTime, schemas.Unset]
    map: typing.Union[MetaOapg.properties.map, schemas.Unset]
    
    @typing.overload
    def __getitem__(self, name: typing.Literal["uuid"]) -> typing.Union[MetaOapg.properties.uuid, schemas.Unset]: ...
    
    @typing.overload
    def __getitem__(self, name: typing.Literal["dateTime"]) -> typing.Union[MetaOapg.properties.dateTime, schemas.Unset]: ...
    
    @typing.overload
    def __getitem__(self, name: typing.Literal["map"]) -> typing.Union[MetaOapg.properties.map, schemas.Unset]: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> MetaOapg.additional_properties: ...
    
    def __getitem__(self, name: typing.Union[str, typing.Literal["uuid"], typing.Literal["dateTime"], typing.Literal["map"], ]):
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
        uuid: typing.Union[MetaOapg.properties.uuid, uuid.UUID, str, schemas.Unset] = schemas.unset,
        dateTime: typing.Union[MetaOapg.properties.dateTime, datetime, str, schemas.Unset] = schemas.unset,
        map: typing.Union[MetaOapg.properties.map, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[MetaOapg.additional_properties, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes, ],
    ) -> 'MixedPropertiesAndAdditionalPropertiesClass':
        return super().__new__(
            cls,
            *args,
            uuid=uuid,
            dateTime=dateTime,
            map=map,
            _configuration=_configuration,
            **kwargs,
        )

from petstore_api.model.animal import Animal
