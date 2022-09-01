# coding: utf-8

"""
    openapi 3.0.3 sample spec

    sample spec for testing openapi functionality, built from json schema tests for draft6  # noqa: E501

    The version of the OpenAPI document: 0.0.1
    Generated by: https://openapi-generator.tech
"""

import unittest

import unit_test_api
from unit_test_api.model.simple_enum_validation import SimpleEnumValidation
from unit_test_api import configuration


class TestSimpleEnumValidation(unittest.TestCase):
    """SimpleEnumValidation unit test stubs"""
    _configuration = configuration.Configuration()

    def test_something_else_is_invalid_fails(self):
        # something else is invalid
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            SimpleEnumValidation.from_openapi_data_oapg(
                4,
                _configuration=self._configuration
            )

    def test_one_of_the_enum_is_valid_passes(self):
        # one of the enum is valid
        SimpleEnumValidation.from_openapi_data_oapg(
            1,
            _configuration=self._configuration
        )


if __name__ == '__main__':
    unittest.main()
