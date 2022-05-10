# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""

import sys
from collections import namedtuple
import os
import json
import unittest
from unittest.mock import patch

import petstore_api
from petstore_api.api.fake_api import FakeApi  # noqa: E501
from petstore_api.rest import RESTClientObject, RESTResponse
from petstore_api.model_utils import file_type, model_to_dict

HTTPResponse = namedtuple(
    'urllib3_response_HTTPResponse',
    ['status', 'reason', 'data', 'getheaders', 'getheader']
)

headers = {'Content-Type': 'application/json'}
def get_headers():
    return {}
def get_header(name, default=None):
    return {}.get(name, default)


class TestFakeApi(unittest.TestCase):
    """FakeApi unit test stubs"""

    def setUp(self):
        self.api = FakeApi()  # noqa: E501

    def tearDown(self):
        pass

    @staticmethod
    def mock_response(body_value):
        http_response = HTTPResponse(
            status=200,
            reason='OK',
            data=json.dumps(body_value).encode('utf-8'),
            getheaders=get_headers,
            getheader=get_header
        )
        return RESTResponse(http_response)

    @staticmethod
    def assert_request_called_with(
        mock_method,
        url,
        accept='application/json',
        http_method='POST',
        content_type='application/json',
        **kwargs
    ):
        headers = {
            'Accept': accept,
            'User-Agent': 'OpenAPI-Generator/1.0.0/python',
        }
        if content_type:
            headers['Content-Type'] = content_type
        used_kwargs = dict(
            _preload_content=True,
            _request_timeout=None,
            headers=headers,
            query_params=[]
        )
        if 'post_params' in kwargs:
            used_kwargs['post_params'] = kwargs['post_params']
        if 'body' in kwargs:
            used_kwargs['body'] = kwargs['body']
            if 'post_params' not in used_kwargs:
                used_kwargs['post_params'] = []
        mock_method.assert_called_with(
            http_method,
            url,
            **used_kwargs
        )

    def test_array_model(self):
        """Test case for array_model

        """
        from petstore_api.model import animal_farm, animal
        endpoint = self.api.array_model_endpoint
        assert endpoint.openapi_types['body'] == (animal_farm.AnimalFarm,)
        assert endpoint.settings['response_type'] == (animal_farm.AnimalFarm,)

        # serialization + deserialization works
        with patch.object(RESTClientObject, 'request') as mock_method:
            cat = animal.Animal(class_name="Cat", color="black")
            body = animal_farm.AnimalFarm([cat])
            json_data = [{"className": "Cat", "color": "black"}]
            mock_method.return_value = self.mock_response(json_data)

            response = self.api.array_model(body=body)
            self.assert_request_called_with(
                mock_method,
                'http://petstore.swagger.io:80/v2/fake/refs/arraymodel',
                body=json_data,
            )

            assert isinstance(response, animal_farm.AnimalFarm)
            assert response == body

    def test_boolean(self):
        """Test case for boolean

        """
        endpoint = self.api.boolean_endpoint
        assert endpoint.openapi_types['body'] == (bool,)
        assert endpoint.settings['response_type'] == (bool,)

    def test_recursionlimit(self):
        """Test case for recursionlimit

        """
        assert sys.getrecursionlimit() == 1234

    def test_fake_health_get(self):
        """Test case for fake_health_get

        Health check endpoint  # noqa: E501
        """
        pass

    def test_additional_properties_with_array_of_enums(self):
        """Test case for additional_properties_with_array_of_enums

        Additional Properties with Array of Enums  # noqa: E501
        """
        pass

    def test_enum_test(self):
        """Test case for enum_test

        Object contains enum properties and array properties containing enums
        """
        from petstore_api.model.enum_test import EnumTest
        from petstore_api.model.string_enum import StringEnum
        from petstore_api.model.array_of_enums import ArrayOfEnums

        endpoint = self.api.enum_test_endpoint
        assert endpoint.openapi_types['enum_test'] == (EnumTest,)
        assert endpoint.settings['response_type'] == (EnumTest,)

        # serialization + deserialization works w/ inline array
        with patch.object(RESTClientObject, 'request') as mock_method:
            body = EnumTest(
                enum_string_required='lower',
                inline_array_of_str_enum=[StringEnum('approved')]
            )
            json_value = {'enum_string_required': 'lower', 'InlineArrayOfStrEnum': ['approved']}
            mock_method.return_value = self.mock_response(json_value)

            response = self.api.enum_test(enum_test=body)
            self.assert_request_called_with(
                mock_method,
                'http://petstore.swagger.io:80/v2/fake/refs/enum-test',
                body=json_value,
            )

            assert isinstance(response, EnumTest)
            assert response == body

        # serialization + deserialization works w/ refed array
        with patch.object(RESTClientObject, 'request') as mock_method:
            body = EnumTest(
                enum_string_required='lower',
                array_of_str_enum=ArrayOfEnums([StringEnum('approved')])
            )
            json_value = {'enum_string_required': 'lower', 'ArrayOfStrEnum': ['approved']}
            mock_method.return_value = self.mock_response(json_value)

            response = self.api.enum_test(enum_test=body)
            self.assert_request_called_with(
                mock_method,
                'http://petstore.swagger.io:80/v2/fake/refs/enum-test',
                body=json_value,
            )

            assert isinstance(response, EnumTest)
            assert response == body


    def test_array_of_enums(self):
        """Test case for array_of_enums

        Array of Enums  # noqa: E501
        """
        from petstore_api.model import array_of_enums, string_enum
        endpoint = self.api.array_of_enums_endpoint
        assert endpoint.openapi_types['array_of_enums'] == (array_of_enums.ArrayOfEnums,)
        assert endpoint.settings['response_type'] == (array_of_enums.ArrayOfEnums,)

        # serialization + deserialization works
        with patch.object(RESTClientObject, 'request') as mock_method:
            value = [string_enum.StringEnum("placed")]
            body = array_of_enums.ArrayOfEnums(value)
            value_simple = ["placed"]
            mock_method.return_value = self.mock_response(value_simple)

            response = self.api.array_of_enums(array_of_enums=body)
            self.assert_request_called_with(
                mock_method,
                'http://petstore.swagger.io:80/v2/fake/refs/array-of-enums',
                body=value_simple,
            )

            assert isinstance(response, array_of_enums.ArrayOfEnums)
            assert response.value == value

    def test_number_with_validations(self):
        """Test case for number_with_validations

        """
        from petstore_api.model import number_with_validations
        endpoint = self.api.number_with_validations_endpoint
        assert endpoint.openapi_types['body'] == (number_with_validations.NumberWithValidations,)
        assert endpoint.settings['response_type'] == (number_with_validations.NumberWithValidations,)

        # serialization + deserialization works
        with patch.object(RESTClientObject, 'request') as mock_method:
            value = 10.0
            body = number_with_validations.NumberWithValidations(value)
            mock_method.return_value = self.mock_response(value)

            response = self.api.number_with_validations(body=body)
            self.assert_request_called_with(
                mock_method,
                'http://petstore.swagger.io:80/v2/fake/refs/number',
                body=value,
            )

            assert isinstance(response, number_with_validations.NumberWithValidations)
            assert response.value == value

    def test_object_model_with_ref_props(self):
        """Test case for object_model_with_ref_props

        """
        from petstore_api.model.object_model_with_ref_props import ObjectModelWithRefProps
        from petstore_api.model.number_with_validations import NumberWithValidations
        endpoint = self.api.object_model_with_ref_props_endpoint
        assert endpoint.openapi_types['body'] == (ObjectModelWithRefProps,)
        assert endpoint.settings['response_type'] == (ObjectModelWithRefProps,)

        json_payloads = [
            {},  # only required + no optional properties works
            {  # optional properties works
                "my_number": 11.0,
                "my_string": 'a',
                "my_boolean": True,
            }
        ]
        # instantiation works
        expected_models = [
            ObjectModelWithRefProps(),
            ObjectModelWithRefProps(
                my_number=NumberWithValidations(11.0),
                my_string='a',
                my_boolean=True
            )
        ]

        pairs = zip(json_payloads, expected_models)
        # serialization + deserialization works
        for (json_payload, expected_model) in pairs:
            with patch.object(RESTClientObject, 'request') as mock_method:
                mock_method.return_value = self.mock_response(json_payload)

                response = self.api.object_model_with_ref_props(body=expected_model)
                self.assert_request_called_with(
                    mock_method,
                    'http://petstore.swagger.io:80/v2/fake/refs/object_model_with_ref_props',
                    body=json_payload,
                )

                assert isinstance(response, expected_model.__class__)
                assert response == expected_model

    def test_composed_one_of_number_with_validations(self):
        """Test case for composed_one_of_number_with_validations

        """
        from petstore_api.model import animal, composed_one_of_number_with_validations, number_with_validations
        endpoint = self.api.composed_one_of_number_with_validations_endpoint
        assert endpoint.openapi_types['composed_one_of_number_with_validations'] == (
            composed_one_of_number_with_validations.ComposedOneOfNumberWithValidations,)
        assert endpoint.settings['response_type'] == (
            composed_one_of_number_with_validations.ComposedOneOfNumberWithValidations,)

        # serialization + deserialization works
        num_with_validations = number_with_validations.NumberWithValidations(10.0)
        cat_in_composed = composed_one_of_number_with_validations.ComposedOneOfNumberWithValidations(
            class_name="Cat", color="black"
        )
        import datetime
        date = datetime.date(1970, 1, 1)
        body_value_simple = [
            (num_with_validations, 10.0),
            (cat_in_composed, {"className": "Cat", "color": "black"}),
            (None, None),
            (date, '1970-01-01'),
        ]
        for (body, value_simple) in body_value_simple:
            with patch.object(RESTClientObject, 'request') as mock_method:
                mock_method.return_value = self.mock_response(value_simple)

                response = self.api.composed_one_of_number_with_validations(composed_one_of_number_with_validations=body)
                self.assert_request_called_with(
                    mock_method,
                    'http://petstore.swagger.io:80/v2/fake/refs/composed_one_of_number_with_validations',
                    body=value_simple,
                )

                assert isinstance(response, body.__class__)
                assert response == body

    def test_string(self):
        """Test case for string

        """
        endpoint = self.api.string_endpoint
        assert endpoint.openapi_types['body'] == (str,)
        assert endpoint.settings['response_type'] == (str,)

        # serialization + deserialization works
        with patch.object(RESTClientObject, 'request') as mock_method:
            body = "blah"
            value_simple = body
            mock_method.return_value = self.mock_response(value_simple)

            response = self.api.string(body=body)
            self.assert_request_called_with(
                mock_method,
                'http://petstore.swagger.io:80/v2/fake/refs/string',
                body=value_simple,
            )

            assert isinstance(response, str)
            assert response == value_simple

    def test_string_enum(self):
        """Test case for string_enum

        """
        from petstore_api.model import string_enum
        endpoint = self.api.string_enum_endpoint
        assert endpoint.openapi_types['body'] == (string_enum.StringEnum,)
        assert endpoint.settings['response_type'] == (string_enum.StringEnum,)

        # serialization + deserialization works
        from petstore_api.rest import RESTClientObject, RESTResponse
        with patch.object(RESTClientObject, 'request') as mock_method:
            value = "placed"
            body = string_enum.StringEnum(value)
            mock_method.return_value = self.mock_response(value)

            response = self.api.string_enum(body=body)
            self.assert_request_called_with(
                mock_method,
                'http://petstore.swagger.io:80/v2/fake/refs/enum',
                body=value,
            )

            assert isinstance(response, string_enum.StringEnum)
            assert response.value == value

    def test_upload_file(self):
        # uploads a file
        test_file_dir = os.path.realpath(
            os.path.join(os.path.dirname(__file__), "..", "testfiles"))
        file_path1 = os.path.join(test_file_dir, "1px_pic1.png")

        headers = {}
        def get_headers():
            return headers
        def get_header(name, default=None):
            return headers.get(name, default)
        api_respponse = {
            'code': 200,
            'type': 'blah',
            'message': 'file upload succeeded'
        }
        http_response = HTTPResponse(
            status=200,
            reason='OK',
            data=json.dumps(api_respponse).encode('utf-8'),
            getheaders=get_headers,
            getheader=get_header
        )
        mock_response = RESTResponse(http_response)
        file1 = open(file_path1, "rb")
        try:
            with patch.object(RESTClientObject, 'request') as mock_method:
                mock_method.return_value = mock_response
                res = self.api.upload_file(
                    file=file1)
                body = None
                post_params=[
                    ('file', ('1px_pic1.png', b'\x89PNG\r\n\x1a\n\x00\x00\x00\rIHDR\x00\x00\x00\x01\x00\x00\x00\x01\x08\x00\x00\x00\x00:~\x9bU\x00\x00\x00\nIDATx\x9cc\xfa\x0f\x00\x01\x05\x01\x02\xcf\xa0.\xcd\x00\x00\x00\x00IEND\xaeB`\x82', 'image/png')),
                ]
                self.assert_request_called_with(
                    mock_method,
                    'http://petstore.swagger.io:80/v2/fake/uploadFile',
                    body=body, post_params=post_params, content_type='multipart/form-data'
                )
        except petstore_api.ApiException as e:
            self.fail("upload_file() raised {0} unexpectedly".format(type(e)))
        finally:
            file1.close()

        # passing in an array of files to when file only allows one
        # raises an exceptions
        try:
            file = open(file_path1, "rb")
            with self.assertRaises(petstore_api.ApiTypeError) as exc:
                self.api.upload_file(file=[file])
        finally:
            file.close()

        # passing in a closed file raises an exception
        with self.assertRaises(petstore_api.ApiValueError) as exc:
            file = open(file_path1, "rb")
            file.close()
            self.api.upload_file(file=file)

    def test_upload_files(self):
        test_file_dir = os.path.realpath(
            os.path.join(os.path.dirname(__file__), "..", "testfiles"))
        file_path1 = os.path.join(test_file_dir, "1px_pic1.png")
        file_path2 = os.path.join(test_file_dir, "1px_pic2.png")

        headers = {}
        def get_headers():
            return headers
        def get_header(name, default=None):
            return headers.get(name, default)
        api_respponse = {
            'code': 200,
            'type': 'blah',
            'message': 'file upload succeeded'
        }
        http_response = HTTPResponse(
            status=200,
            reason='OK',
            data=json.dumps(api_respponse).encode('utf-8'),
            getheaders=get_headers,
            getheader=get_header
        )
        mock_response = RESTResponse(http_response)
        file1 = open(file_path1, "rb")
        file2 = open(file_path2, "rb")
        try:
            with patch.object(RESTClientObject, 'request') as mock_method:
                mock_method.return_value = mock_response
                res = self.api.upload_files(
                    files=[file1, file2])
                post_params=[
                    ('files', ('1px_pic1.png', b'\x89PNG\r\n\x1a\n\x00\x00\x00\rIHDR\x00\x00\x00\x01\x00\x00\x00\x01\x08\x00\x00\x00\x00:~\x9bU\x00\x00\x00\nIDATx\x9cc\xfa\x0f\x00\x01\x05\x01\x02\xcf\xa0.\xcd\x00\x00\x00\x00IEND\xaeB`\x82', 'image/png')),
                    ('files', ('1px_pic2.png', b'\x89PNG\r\n\x1a\n\x00\x00\x00\rIHDR\x00\x00\x00\x01\x00\x00\x00\x01\x08\x00\x00\x00\x00:~\x9bU\x00\x00\x00\nIDATx\x9cc\xfa\x0f\x00\x01\x05\x01\x02\xcf\xa0.\xcd\x00\x00\x00\x00IEND\xaeB`\x82', 'image/png'))
                ]
                self.assert_request_called_with(
                    mock_method,
                    'http://petstore.swagger.io:80/v2/fake/uploadFiles',
                    body=None, post_params=post_params, content_type='multipart/form-data'
                )
        except petstore_api.ApiException as e:
            self.fail("upload_file() raised {0} unexpectedly".format(type(e)))
        finally:
            file1.close()
            file2.close()

        # passing in a single file when an array of file is required
        # raises an exception
        try:
            file = open(file_path1, "rb")
            with self.assertRaises(petstore_api.ApiTypeError) as exc:
                self.api.upload_files(files=file)
        finally:
            file.close()

    def test_download_attachment(self):
        """Ensures that file deserialization works"""

        # sample from http://www.jtricks.com/download-text
        file_name = 'content.txt'
        headers_dict = {
                    'with_filename': {'Content-Disposition': 'attachment; filename={}'.format(file_name), 'Content-Type': 'text/plain'},
                    'no_filename': {'Content-Disposition': 'attachment;', 'Content-Type': 'text/plain'}
        }
        def get_headers(*args):
            return args
        file_data = (
            "You are reading text file that was supposed to be downloaded\r\n"
            "to your hard disk. If your browser offered to save you the file,"
            "\r\nthen it handled the Content-Disposition header correctly."
        )
        for key, headers in headers_dict.items():
            def get_header(name, default=None):
                return headers_dict[key].get(name, default)
            http_response = HTTPResponse(
                status=200,
                reason='OK',
                data=file_data,
                getheaders=get_headers(headers),
                getheader=get_header
            )
            # deserialize response to a file
            mock_response = RESTResponse(http_response)
            with patch.object(RESTClientObject, 'request') as mock_method:
                mock_method.return_value = mock_response
                try:
                    file_object = self.api.download_attachment(file_name='download-text')
                    self.assert_request_called_with(
                        mock_method,
                        'http://www.jtricks.com/download-text',
                        http_method='GET',
                        accept='text/plain',
                        content_type=None,
                    )
                    self.assertTrue(isinstance(file_object, file_type))
                    self.assertFalse(file_object.closed)
                    self.assertEqual(file_object.read(), file_data.encode('utf-8'))
                finally:
                    file_object.close()
                    os.unlink(file_object.name)

    def test_upload_download_file(self):
        test_file_dir = os.path.realpath(
            os.path.join(os.path.dirname(__file__), "..", "testfiles"))
        file_path1 = os.path.join(test_file_dir, "1px_pic1.png")

        with open(file_path1, "rb") as f:
            expected_file_data = f.read()

        headers = {'Content-Type': 'application/octet-stream'}
        def get_headers():
            return headers
        def get_header(name, default=None):
            return headers.get(name, default)
        http_response = HTTPResponse(
            status=200,
            reason='OK',
            data=expected_file_data,
            getheaders=get_headers,
            getheader=get_header
        )
        mock_response = RESTResponse(http_response)
        file1 = open(file_path1, "rb")
        try:
            with patch.object(RESTClientObject, 'request') as mock_method:
                mock_method.return_value = mock_response
                downloaded_file = self.api.upload_download_file(body=file1)
                self.assert_request_called_with(
                    mock_method,
                    'http://petstore.swagger.io:80/v2/fake/uploadDownloadFile',
                    body=expected_file_data,
                    content_type='application/octet-stream',
                    accept='application/octet-stream'
                )

                self.assertTrue(isinstance(downloaded_file, file_type))
                self.assertFalse(downloaded_file.closed)
                self.assertEqual(downloaded_file.read(), expected_file_data)
        except petstore_api.ApiException as e:
            self.fail("upload_download_file() raised {0} unexpectedly".format(type(e)))
        finally:
            file1.close()
            downloaded_file.close()
            os.unlink(downloaded_file.name)

    def test_test_body_with_file_schema(self):
        """Test case for test_body_with_file_schema

        """
        pass

    def test_test_body_with_query_params(self):
        """Test case for test_body_with_query_params

        """
        pass

    def test_test_client_model(self):
        """Test case for test_client_model

        To test \"client\" model  # noqa: E501
        """
        pass

    def test_test_endpoint_parameters(self):
        """Test case for test_endpoint_parameters

        Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트   # noqa: E501
        """
        pass

    def test_test_enum_parameters(self):
        """Test case for test_enum_parameters

        To test enum parameters  # noqa: E501
        """
        pass

    def test_test_group_parameters(self):
        """Test case for test_group_parameters

        Fake endpoint to test group parameters (optional)  # noqa: E501
        """
        pass

    def test_test_inline_additional_properties(self):
        """Test case for test_inline_additional_properties

        test inline additionalProperties  # noqa: E501
        """
        pass

    def test_test_json_form_data(self):
        """Test case for test_json_form_data

        test json serialization of form data  # noqa: E501
        """
        pass

    def test_test_query_parameter_collection_format(self):
        """Test case for test_query_parameter_collection_format

        """
        pass

    def test_post_inline_additional_properties_ref_payload(self):
        """Test case for postInlineAdditionlPropertiesRefPayload
        """
        from petstore_api.model.inline_additional_properties_ref_payload import InlineAdditionalPropertiesRefPayload
        from petstore_api.model.post_inline_additional_properties_payload_request_array_data_inner import PostInlineAdditionalPropertiesPayloadRequestArrayDataInner
        endpoint = self.api.post_inline_additional_properties_ref_payload_endpoint
        assert endpoint.openapi_types['inline_additional_properties_ref_payload'] == (InlineAdditionalPropertiesRefPayload,)
        assert endpoint.settings['response_type'] == (InlineAdditionalPropertiesRefPayload,)

        # serialization + deserialization works
        from petstore_api.rest import RESTClientObject, RESTResponse
        with patch.object(RESTClientObject, 'request') as mock_method:
            expected_json_body = {
                'arrayData': [
                    {
                        'labels': [
                            None,
                            'foo'
                        ]
                    }
                ]
            }
            inline_additional_properties_ref_payload = InlineAdditionalPropertiesRefPayload(
                array_data=[
                    PostInlineAdditionalPropertiesPayloadRequestArrayDataInner(labels=[None, 'foo'])
                ]
            )
            mock_method.return_value = self.mock_response(expected_json_body)

            response = self.api.post_inline_additional_properties_ref_payload(inline_additional_properties_ref_payload=inline_additional_properties_ref_payload)
            self.assert_request_called_with(
                mock_method,
                'http://petstore.swagger.io:80/v2/fake/postInlineAdditionalPropertiesRefPayload',
                body=expected_json_body
            )

            assert isinstance(response, InlineAdditionalPropertiesRefPayload)
            assert model_to_dict(response) == expected_json_body

    def test_post_inline_additional_properties_payload(self):
        """Test case for postInlineAdditionlPropertiesPayload
        """
        from petstore_api.model.post_inline_additional_properties_payload_request import PostInlineAdditionalPropertiesPayloadRequest
        from petstore_api.model.post_inline_additional_properties_payload_request_array_data_inner import PostInlineAdditionalPropertiesPayloadRequestArrayDataInner
        endpoint = self.api.post_inline_additional_properties_payload_endpoint
        assert endpoint.openapi_types['post_inline_additional_properties_payload_request'] == (PostInlineAdditionalPropertiesPayloadRequest,)
        assert endpoint.settings['response_type'] == (PostInlineAdditionalPropertiesPayloadRequest,)

        # serialization + deserialization works
        from petstore_api.rest import RESTClientObject, RESTResponse
        with patch.object(RESTClientObject, 'request') as mock_method:
            expected_json_body = {
                'arrayData': [
                    {
                        'labels': [
                            None,
                            'foo'
                        ]
                    }
                ]
            }
            post_inline_additional_properties_payload_request = PostInlineAdditionalPropertiesPayloadRequest(
                array_data=[
                    PostInlineAdditionalPropertiesPayloadRequestArrayDataInner(labels=[None, 'foo'])
                ]
            )
            mock_method.return_value = self.mock_response(expected_json_body)

            response = self.api.post_inline_additional_properties_payload(post_inline_additional_properties_payload_request=post_inline_additional_properties_payload_request)
            self.assert_request_called_with(
                mock_method,
                'http://petstore.swagger.io:80/v2/fake/postInlineAdditionalPropertiesPayload',
                body=expected_json_body
            )

            assert isinstance(response, PostInlineAdditionalPropertiesPayloadRequest)
            assert model_to_dict(response) == expected_json_body

    def test_post_tx_rx_any_of_payload(self):
        """Test case for postInlineAdditionlPropertiesPayload
        """
        from petstore_api.model.gm_fruit_no_properties import GmFruitNoProperties
        endpoint = self.api.tx_rx_any_of_model_endpoint
        assert endpoint.openapi_types['gm_fruit_no_properties'] == (GmFruitNoProperties,)
        assert endpoint.settings['response_type'] == (GmFruitNoProperties,)

        # serialization + deserialization works
        from petstore_api.rest import RESTClientObject, RESTResponse
        with patch.object(RESTClientObject, 'request') as mock_method:
            expected_json_body = {
                'cultivar': 'Alice',
                'origin': 'Kazakhstan',
                'lengthCm': 7,
            }
            fruit = GmFruitNoProperties(**expected_json_body)
            mock_method.return_value = self.mock_response(expected_json_body)

            response = self.api.tx_rx_any_of_model(gm_fruit_no_properties=fruit)
            self.assert_request_called_with(
                mock_method,
                'http://petstore.swagger.io:80/v2/fake/TxRxAnyOfModel',
                body=expected_json_body
            )

            assert isinstance(response, GmFruitNoProperties)
            assert model_to_dict(response) == expected_json_body

if __name__ == '__main__':
    unittest.main()
