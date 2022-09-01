# coding: utf-8

"""
    openapi 3.0.3 sample spec

    sample spec for testing openapi functionality, built from json schema tests for draft6  # noqa: E501

    The version of the OpenAPI document: 0.0.1
    Generated by: https://openapi-generator.tech
"""

import unittest

import unit_test_api
from unit_test_api.model.pattern_is_not_anchored import PatternIsNotAnchored
from unit_test_api import configuration


class TestPatternIsNotAnchored(unittest.TestCase):
    """PatternIsNotAnchored unit test stubs"""
    _configuration = configuration.Configuration()

    def test_matches_a_substring_passes(self):
        # matches a substring
        PatternIsNotAnchored.from_openapi_data_oapg(
            "xxaayy",
            _configuration=self._configuration
        )


if __name__ == '__main__':
    unittest.main()
