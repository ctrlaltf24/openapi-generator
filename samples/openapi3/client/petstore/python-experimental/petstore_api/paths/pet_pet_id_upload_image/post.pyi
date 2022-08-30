# coding: utf-8

"""


    Generated by: https://openapi-generator.tech
"""

from dataclasses import dataclass
import re  # noqa: F401
import sys  # noqa: F401
import typing
import urllib3
import functools  # noqa: F401
from urllib3._collections import HTTPHeaderDict

from petstore_api import api_client, exceptions
import decimal  # noqa: F401
from datetime import date, datetime  # noqa: F401
import uuid  # noqa: F401

import frozendict  # noqa: F401

from petstore_api import schemas  # noqa: F401

from petstore_api.model.api_response import ApiResponse

# path params
PetIdSchema = schemas.Int64Schema
# body param


class SchemaForRequestBodyMultipartFormData(
    schemas.DictSchema
):


    class MetaOapg:
        class properties:
            additionalMetadata = schemas.StrSchema
            file = schemas.BinarySchema
            __annotations__ = {
                "additionalMetadata": additionalMetadata,
                "file": file,
            }
        additional_properties = schemas.AnyTypeSchema
    
    additionalMetadata: typing.Union[MetaOapg.properties.additionalMetadata, schemas.Unset]
    file: typing.Union[MetaOapg.properties.file, schemas.Unset]
    
    @typing.overload
    def __getitem__(self, name: typing.Literal["additionalMetadata"]) -> typing.Union[MetaOapg.properties.additionalMetadata, schemas.Unset]: ...
    
    @typing.overload
    def __getitem__(self, name: typing.Literal["file"]) -> typing.Union[MetaOapg.properties.file, schemas.Unset]: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> MetaOapg.additional_properties: ...
    
    def __getitem__(self, name: typing.Union[str, typing.Literal["additionalMetadata"], typing.Literal["file"], ]):
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
        additionalMetadata: typing.Union[MetaOapg.properties.additionalMetadata, str, schemas.Unset] = schemas.unset,
        file: typing.Union[MetaOapg.properties.file, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[MetaOapg.additional_properties, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes, ],
    ) -> 'SchemaForRequestBodyMultipartFormData':
        return super().__new__(
            cls,
            *args,
            additionalMetadata=additionalMetadata,
            file=file,
            _configuration=_configuration,
            **kwargs,
        )
SchemaFor200ResponseBodyApplicationJson = ApiResponse
