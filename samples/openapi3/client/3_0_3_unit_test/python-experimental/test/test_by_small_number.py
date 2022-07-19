# coding: utf-8

"""
    openapi 3.0.3 sample spec

    sample spec for testing openapi functionality, built from json schema tests for draft6  # noqa: E501

    The version of the OpenAPI document: 0.0.1
    Generated by: https://openapi-generator.tech
"""

import unittest

import unit_test_api
from unit_test_api.model.by_small_number import BySmallNumber
from unit_test_api import configuration


class TestBySmallNumber(unittest.TestCase):
    """BySmallNumber unit test stubs"""
    _configuration = configuration.Configuration()

    def test_000751_is_not_multiple_of00001_fails(self):
        # 0.00751 is not multiple of 0.0001
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            BySmallNumber._from_openapi_data(
                0.00751,
                _configuration=self._configuration
            )

    def test_00075_is_multiple_of00001_passes(self):
        # 0.0075 is multiple of 0.0001
        BySmallNumber._from_openapi_data(
            0.0075,
            _configuration=self._configuration
        )


if __name__ == '__main__':
    unittest.main()
