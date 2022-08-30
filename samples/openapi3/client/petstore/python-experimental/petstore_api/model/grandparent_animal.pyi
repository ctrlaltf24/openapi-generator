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


class GrandparentAnimal(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        required = {
            "pet_type",
        }
        
        @classmethod
        @property
        def discriminator(cls):
            return {
                'pet_type': {
                    'ChildCat': ChildCat,
                    'ParentPet': ParentPet,
                }
            }
        class properties:
            pet_type = schemas.StrSchema
            __annotations__ = {
                "pet_type": pet_type,
            }
        additional_properties = schemas.AnyTypeSchema
    
    pet_type: MetaOapg.properties.pet_type
    
    @typing.overload
    def __getitem__(self, name: typing.Literal["pet_type"]) -> MetaOapg.properties.pet_type: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> MetaOapg.additional_properties: ...
    
    def __getitem__(self, name: typing.Union[str, typing.Literal["pet_type"], ]):
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
        pet_type: typing.Union[MetaOapg.properties.pet_type, str, ],
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[MetaOapg.additional_properties, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes, ],
    ) -> 'GrandparentAnimal':
        return super().__new__(
            cls,
            *args,
            pet_type=pet_type,
            _configuration=_configuration,
            **kwargs,
        )

from petstore_api.model.child_cat import ChildCat
from petstore_api.model.parent_pet import ParentPet
