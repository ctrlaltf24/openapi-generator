# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""

from datetime import date, datetime  # noqa: F401
import decimal  # noqa: F401
import functools  # noqa: F401
import io  # noqa: F401
import re  # noqa: F401
import typing  # noqa: F401
import uuid  # noqa: F401

import frozendict  # noqa: F401

from petstore_api import schemas  # noqa: F401


class MapTest(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        class properties:
            
            
            class map_map_of_string(
                schemas.DictSchema
            ):
            
            
                class MetaOapg:
                    
                    
                    class additional_properties(
                        schemas.DictSchema
                    ):
                    
                    
                        class MetaOapg:
                            additional_properties = schemas.StrSchema
                        
                        def __getitem__(self, name: typing.Union[str, ]) -> MetaOapg.additional_properties:
                            # dict_instance[name] accessor
                            return super().__getitem__(name)
                        
                        def get_item_oapg(self, name: typing.Union[str, ]) -> MetaOapg.additional_properties:
                            return super().get_item_oapg(name)
                    
                        def __new__(
                            cls,
                            *args: typing.Union[dict, frozendict.frozendict, ],
                            _configuration: typing.Optional[schemas.Configuration] = None,
                            **kwargs: typing.Union[MetaOapg.additional_properties, str, ],
                        ) -> 'additional_properties':
                            return super().__new__(
                                cls,
                                *args,
                                _configuration=_configuration,
                                **kwargs,
                            )
                
                def __getitem__(self, name: typing.Union[str, ]) -> MetaOapg.additional_properties:
                    # dict_instance[name] accessor
                    return super().__getitem__(name)
                
                def get_item_oapg(self, name: typing.Union[str, ]) -> MetaOapg.additional_properties:
                    return super().get_item_oapg(name)
            
                def __new__(
                    cls,
                    *args: typing.Union[dict, frozendict.frozendict, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[MetaOapg.additional_properties, dict, frozendict.frozendict, ],
                ) -> 'map_map_of_string':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                        **kwargs,
                    )
            
            
            class map_of_enum_string(
                schemas.DictSchema
            ):
            
            
                class MetaOapg:
                    
                    
                    class additional_properties(
                        schemas.SchemaEnumMakerClsFactory(
                            enum_value_to_name={
                                "UPPER": "UPPER",
                                "lower": "LOWER",
                            }
                        ),
                        schemas.StrSchema
                    ):
                        
                        @classmethod
                        @property
                        def UPPER(cls):
                            return cls("UPPER")
                        
                        @classmethod
                        @property
                        def LOWER(cls):
                            return cls("lower")
                
                def __getitem__(self, name: typing.Union[str, ]) -> MetaOapg.additional_properties:
                    # dict_instance[name] accessor
                    return super().__getitem__(name)
                
                def get_item_oapg(self, name: typing.Union[str, ]) -> MetaOapg.additional_properties:
                    return super().get_item_oapg(name)
            
                def __new__(
                    cls,
                    *args: typing.Union[dict, frozendict.frozendict, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[MetaOapg.additional_properties, str, ],
                ) -> 'map_of_enum_string':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                        **kwargs,
                    )
            
            
            class direct_map(
                schemas.DictSchema
            ):
            
            
                class MetaOapg:
                    additional_properties = schemas.BoolSchema
                
                def __getitem__(self, name: typing.Union[str, ]) -> MetaOapg.additional_properties:
                    # dict_instance[name] accessor
                    return super().__getitem__(name)
                
                def get_item_oapg(self, name: typing.Union[str, ]) -> MetaOapg.additional_properties:
                    return super().get_item_oapg(name)
            
                def __new__(
                    cls,
                    *args: typing.Union[dict, frozendict.frozendict, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[MetaOapg.additional_properties, bool, ],
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
            __annotations__ = {
                "map_map_of_string": map_map_of_string,
                "map_of_enum_string": map_of_enum_string,
                "direct_map": direct_map,
                "indirect_map": indirect_map,
            }
    
    @typing.overload
    def __getitem__(self, name: typing.Literal["map_map_of_string"]) -> MetaOapg.properties.map_map_of_string: ...
    
    @typing.overload
    def __getitem__(self, name: typing.Literal["map_of_enum_string"]) -> MetaOapg.properties.map_of_enum_string: ...
    
    @typing.overload
    def __getitem__(self, name: typing.Literal["direct_map"]) -> MetaOapg.properties.direct_map: ...
    
    @typing.overload
    def __getitem__(self, name: typing.Literal["indirect_map"]) -> 'StringBooleanMap': ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing.Literal["map_map_of_string", "map_of_enum_string", "direct_map", "indirect_map", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing.Literal["map_map_of_string"]) -> typing.Union[MetaOapg.properties.map_map_of_string, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing.Literal["map_of_enum_string"]) -> typing.Union[MetaOapg.properties.map_of_enum_string, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing.Literal["direct_map"]) -> typing.Union[MetaOapg.properties.direct_map, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing.Literal["indirect_map"]) -> typing.Union['StringBooleanMap', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing.Literal["map_map_of_string", "map_of_enum_string", "direct_map", "indirect_map", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        map_map_of_string: typing.Union[MetaOapg.properties.map_map_of_string, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        map_of_enum_string: typing.Union[MetaOapg.properties.map_of_enum_string, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        direct_map: typing.Union[MetaOapg.properties.direct_map, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        indirect_map: typing.Union['StringBooleanMap', schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
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
