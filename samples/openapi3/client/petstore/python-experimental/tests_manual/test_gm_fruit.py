# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import petstore_api
from petstore_api.model import apple
from petstore_api.model import banana
from petstore_api.model.gm_fruit import GmFruit
from petstore_api.schemas import frozendict

class TestGmFruit(unittest.TestCase):
    """GmFruit unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGmFruit(self):
        """Test GmFruit"""

        # make an instance of GmFruit, a composed schema anyOf model
        # banana test
        length_cm = 20.3
        color = 'yellow'
        cultivar = 'banaple'
        fruit = GmFruit(lengthCm=length_cm, color=color, cultivar=cultivar)
        assert isinstance(fruit, banana.Banana)
        assert isinstance(fruit, apple.Apple)
        assert isinstance(fruit, frozendict)
        assert isinstance(fruit, GmFruit)
        # check its properties
        self.assertEqual(fruit.lengthCm, length_cm)
        self.assertEqual(fruit['lengthCm'], length_cm)
        self.assertEqual(getattr(fruit, 'lengthCm'), length_cm)
        self.assertEqual(fruit.color, color)
        self.assertEqual(fruit['color'], color)
        self.assertEqual(getattr(fruit, 'color'), color)
        # check the dict representation
        self.assertEqual(
            fruit,
            {
                'lengthCm': length_cm,
                'color': color,
                'cultivar': cultivar
            }
        )

        with self.assertRaises(KeyError):
            invalid_variable = fruit['origin']
        # with getattr
        self.assertTrue(getattr(fruit, 'origin', 'some value'), 'some value')

        # make sure that the ModelComposed class properties are correct
        # model._composed_schemas stores the anyOf/allOf/oneOf info
        self.assertEqual(
            fruit.MetaOapg.any_of,
            [
                apple.Apple,
                banana.Banana,
            ],
        )

        # including extra parameters works
        fruit = GmFruit(
            color=color,
            length_cm=length_cm,
            cultivar=cultivar,
            unknown_property='some value'
        )

        # including input parameters for both anyOf instances works
        color = 'orange'
        color_stored = b'orange'
        fruit = GmFruit(
            color=color,
            cultivar=cultivar,
            length_cm=length_cm
        )
        self.assertEqual(fruit.color, color)
        self.assertEqual(fruit['color'], color)
        self.assertEqual(getattr(fruit, 'color'), color)
        self.assertEqual(fruit.cultivar, cultivar)
        self.assertEqual(fruit['cultivar'], cultivar)
        self.assertEqual(getattr(fruit, 'cultivar'), cultivar)
        self.assertEqual(fruit.length_cm, length_cm)
        self.assertEqual(fruit['length_cm'], length_cm)
        self.assertEqual(getattr(fruit, 'length_cm'), length_cm)

        # make an instance of GmFruit, a composed schema anyOf model
        # apple test
        color = 'red'
        cultivar = 'golden delicious'
        origin = 'California'
        fruit = GmFruit(color=color, cultivar=cultivar, origin=origin)
        # check its properties
        self.assertEqual(fruit.color, color)
        self.assertEqual(fruit['color'], color)
        self.assertEqual(getattr(fruit, 'color'), color)
        self.assertEqual(fruit.cultivar, cultivar)
        self.assertEqual(fruit['cultivar'], cultivar)
        self.assertEqual(getattr(fruit, 'cultivar'), cultivar)

        self.assertEqual(fruit.origin, origin)
        self.assertEqual(fruit['origin'], origin)
        self.assertEqual(getattr(fruit, 'origin'), origin)

        # check the dict representation
        self.assertEqual(
            fruit,
            {
                'color': color,
                'cultivar': cultivar,
                'origin': origin,
            }
        )

if __name__ == '__main__':
    unittest.main()
