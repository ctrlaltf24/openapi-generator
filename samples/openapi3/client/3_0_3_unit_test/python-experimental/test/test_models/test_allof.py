# coding: utf-8

"""
    openapi 3.0.3 sample spec

    sample spec for testing openapi functionality, built from json schema tests for draft6  # noqa: E501

    The version of the OpenAPI document: 0.0.1
    Generated by: https://openapi-generator.tech
"""

import unittest

import unit_test_api
from unit_test_api.model.allof import Allof
from unit_test_api import configuration


class TestAllof(unittest.TestCase):
    """Allof unit test stubs"""
    _configuration = configuration.Configuration()

    def test_allof_passes(self):
        # allOf
        Allof.from_openapi_data_oapg(
            {
                "foo":
                    "baz",
                "bar":
                    2,
            },
            _configuration=self._configuration
        )

    def test_mismatch_first_fails(self):
        # mismatch first
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            Allof.from_openapi_data_oapg(
                {
                    "bar":
                        2,
                },
                _configuration=self._configuration
            )

    def test_mismatch_second_fails(self):
        # mismatch second
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            Allof.from_openapi_data_oapg(
                {
                    "foo":
                        "baz",
                },
                _configuration=self._configuration
            )

    def test_wrong_type_fails(self):
        # wrong type
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            Allof.from_openapi_data_oapg(
                {
                    "foo":
                        "baz",
                    "bar":
                        "quux",
                },
                _configuration=self._configuration
            )


if __name__ == '__main__':
    unittest.main()
