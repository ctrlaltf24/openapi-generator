# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import
import sys
import unittest

import petstore_api
try:
    from petstore_api.model import child_cat
except ImportError:
    child_cat = sys.modules[
        'petstore_api.model.child_cat']
try:
    from petstore_api.model import parent_pet
except ImportError:
    parent_pet = sys.modules[
        'petstore_api.model.parent_pet']
from petstore_api.model.grandparent_animal import GrandparentAnimal


class TestGrandparentAnimal(unittest.TestCase):
    """GrandparentAnimal unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGrandparentAnimal(self):
        """Test GrandparentAnimal"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GrandparentAnimal()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
