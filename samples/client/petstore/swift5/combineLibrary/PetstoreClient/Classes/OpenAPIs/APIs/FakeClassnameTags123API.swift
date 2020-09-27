//
// FakeClassnameTags123API.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
import Combine

open class FakeClassnameTags123API {
    /**
     To test class name in snake case
     
     - parameter body: (body) client model 
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - returns: AnyPublisher<Client, Error>
     */
    @available(OSX 10.15, iOS 13.0, tvOS 13.0, watchOS 6.0, *)
    open class func testClassname(body: Client, apiResponseQueue: DispatchQueue = PetstoreClientAPI.apiResponseQueue) -> AnyPublisher<Client, Error> {
        return Future<Client, Error>.init { promise in
            testClassnameWithRequestBuilder(body: body).execute(apiResponseQueue) { result -> Void in
                switch result {
                case let .success(response):
                    promise(.success(response.body!))
                case let .failure(error):
                    promise(.failure(error))
                }
            }
        }.eraseToAnyPublisher()
    }

    /**
     To test class name in snake case
     - PATCH /fake_classname_test
     - To test class name in snake case
     - API Key:
       - type: apiKey api_key_query (QUERY)
       - name: api_key_query
     - parameter body: (body) client model 
     - returns: RequestBuilder<Client> 
     */
    open class func testClassnameWithRequestBuilder(body: Client) -> RequestBuilder<Client> {
        let path = "/fake_classname_test"
        let URLString = PetstoreClientAPI.basePath + path
        let parameters = JSONEncodingHelper.encodingParameters(forEncodableObject: body)

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<Client>.Type = PetstoreClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "PATCH", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }

}
