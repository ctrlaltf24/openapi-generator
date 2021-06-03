# coding: utf-8

from datetime import date, datetime  # noqa: F401

from typing import Dict, List, Optional  # noqa: F401

from pydantic import BaseModel, EmailStr, validator  # noqa: F401


class Tag(BaseModel):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.

    Tag - a model defined in OpenAPI

        id: The id of this Tag [Optional].
        name: The name of this Tag [Optional].
    """

    id: Optional[int] = None
    name: Optional[str] = None
