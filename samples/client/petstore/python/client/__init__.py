#!/usr/bin/env python
"""Add all of the modules in the current directory to __all__"""
import os

# import models into package
from .models.User import User
from .models.Category import Category
from .models.Pet import Pet
from .models.Tag import Tag
from .models.Order import Order

# import apis into package

from .UserApi import UserApi

from .PetApi import PetApi

from .StoreApi import StoreApi


# import ApiClient
from .swagger import ApiClient

__all__ = []

for module in os.listdir(os.path.dirname(__file__)):
  if module != '__init__.py' and module[-3:] == '.py':
    __all__.append(module[:-3])
