/*
 * Echo Server API
 * Echo Server API
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: team@openapitools.oprg
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client;

import org.junit.Assert;
import org.openapitools.client.ApiException;
import org.openapitools.client.api.*;
import org.openapitools.client.model.*;
import org.junit.Test;
import org.junit.Ignore;

import java.util.*;


/**
 * API tests for QueryApi
 */
public class CustomTest {

    private final QueryApi api = new QueryApi();
    private final BodyApi bodyApi = new BodyApi();


    /**
     * Test body parameter(s)
     * <p>
     * Test body parameter(s)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void testEchoBodyPet() throws ApiException {
        Pet queryObject = new Pet().id(12345L).name("Hello World").
                photoUrls(Arrays.asList(new String[]{"http://a.com", "http://b.com"})).category(new Category().id(987L).name("new category"));

        Pet p = bodyApi.testEchoBodyPet(queryObject);
        Assert.assertNotNull(p);
        Assert.assertEquals("Hello World", p.getName());
        Assert.assertEquals(Long.valueOf(12345L), p.getId());

        // response is empty body
        Pet p2 = bodyApi.testEchoBodyPet(null);
        Assert.assertNull(p2);
    }

    /**
     * Test query parameter(s)
     * <p>
     * Test query parameter(s)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void testQueryStyleFormExplodeTrueObjectTest() throws ApiException {
        Pet queryObject = new Pet().id(12345L).name("Hello World").
                photoUrls(Arrays.asList(new String[]{"http://a.com", "http://b.com"})).category(new Category().id(987L).name("new category"));

        String response = api.testQueryStyleFormExplodeTrueObject(queryObject);
        org.openapitools.client.EchoServerResponseParser p = new org.openapitools.client.EchoServerResponseParser(response);
        Assert.assertEquals("/query/style_form/explode_true/object?id=12345&name=Hello%20World&category=class%20Category%20%7B%0A%20%20%20%20id%3A%20987%0A%20%20%20%20name%3A%20new%20category%0A%7D&photoUrls=http%3A%2F%2Fa.com&photoUrls=http%3A%2F%2Fb.com", p.path);
    }

    /**
     * Test query parameter(s)
     * <p>
     * Test query parameter(s)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void testQueryStyleDeepObjectExplodeTrueObject() throws ApiException {
        Pet queryObject = new Pet().id(12345L).name("Hello World").
                photoUrls(Arrays.asList(new String[]{"http://a.com", "http://b.com"})).category(new Category().id(987L).name("new category"));

        Assert.assertEquals("query_object[id]=12345&query_object[name]=Hello%20World&query_object[category][id]=987&query_object[category][name]=new%20category&query_object[photoUrls][0]=http%3A%2F%2Fa.com&query_object[photoUrls][1]=http%3A%2F%2Fb.com", queryObject.toUrlQueryString("query_object"));

        String response = api.testQueryStyleDeepObjectExplodeTrueObject(queryObject);
        org.openapitools.client.EchoServerResponseParser p = new org.openapitools.client.EchoServerResponseParser(response);
        Assert.assertEquals("/query/style_deepObject/explode_true/object?query_object[id]=12345&query_object[name]=Hello%20World&query_object[category][id]=987&query_object[category][name]=new%20category&query_object[photoUrls][0]=http%3A%2F%2Fa.com&query_object[photoUrls][1]=http%3A%2F%2Fb.com", p.path);
    }

    /**
     * Test query parameter(s)
     * <p>
     * Test query parameter(s)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void testQueryStyleFormExplodeTrueArrayString() throws ApiException {
        TestQueryStyleFormExplodeTrueArrayStringQueryObjectParameter q = new TestQueryStyleFormExplodeTrueArrayStringQueryObjectParameter()
                .values(Arrays.asList(new String[]{"hello world 1", "hello world 2"}));

        String response = api.testQueryStyleFormExplodeTrueArrayString(q);
        org.openapitools.client.EchoServerResponseParser p = new org.openapitools.client.EchoServerResponseParser(response);
        Assert.assertEquals("/query/style_form/explode_true/array_string?values=hello%20world%201&values=hello%20world%202", p.path);
    }
}
