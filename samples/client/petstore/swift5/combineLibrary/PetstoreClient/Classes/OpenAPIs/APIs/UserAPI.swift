//
// UserAPI.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(Combine)
import Combine
#endif
#if canImport(AnyCodable)
import AnyCodable
#endif

open class UserAPI {

    /**
     Create user
     
     - parameter body: (body) Created user object 
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - returns: AnyPublisher<Void, Error>
     */
    #if canImport(Combine)
    @available(macOS 10.15, iOS 13.0, tvOS 13.0, watchOS 6.0, *)
    open class func createUser(body: User, apiResponseQueue: DispatchQueue = PetstoreClientAPI.apiResponseQueue) -> AnyPublisher<Void, Error> {
        var task: URLSessionTask?
        return Future<Void, Error> { promise in
            task = createUserWithRequestBuilder(body: body).execute(apiResponseQueue) { result in
                switch result {
                case .success:
                    promise(.success(()))
                case let .failure(error):
                    promise(.failure(error))
                }
            }
        }
        .handleEvents(receiveCancel: {
            task?.cancel()
        })
        .eraseToAnyPublisher()
    }
    #endif

    /**
     Create user
     - POST /user
     - This can only be done by the logged in user.
     - parameter body: (body) Created user object 
     - returns: RequestBuilder<Void> 
     */
    open class func createUserWithRequestBuilder(body: User) -> RequestBuilder<Void> {
        let localVariablePath = "/user"
        let localVariableURLString = PetstoreClientAPI.basePath + localVariablePath
        let localVariableParameters = JSONEncodingHelper.encodingParameters(forEncodableObject: body)

        let localVariableUrlComponents = URLComponents(string: localVariableURLString)

        let localVariableNillableHeaders: [String: Any?] = [
            :
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<Void>.Type = PetstoreClientAPI.requestBuilderFactory.getNonDecodableBuilder()

        return localVariableRequestBuilder.init(method: "POST", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters)
    }

    /**
     Creates list of users with given input array
     
     - parameter body: (body) List of user object 
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - returns: AnyPublisher<Void, Error>
     */
    #if canImport(Combine)
    @available(macOS 10.15, iOS 13.0, tvOS 13.0, watchOS 6.0, *)
    open class func createUsersWithArrayInput(body: [User], apiResponseQueue: DispatchQueue = PetstoreClientAPI.apiResponseQueue) -> AnyPublisher<Void, Error> {
        var task: URLSessionTask?
        return Future<Void, Error> { promise in
            task = createUsersWithArrayInputWithRequestBuilder(body: body).execute(apiResponseQueue) { result in
                switch result {
                case .success:
                    promise(.success(()))
                case let .failure(error):
                    promise(.failure(error))
                }
            }
        }
        .handleEvents(receiveCancel: {
            task?.cancel()
        })
        .eraseToAnyPublisher()
    }
    #endif

    /**
     Creates list of users with given input array
     - POST /user/createWithArray
     - parameter body: (body) List of user object 
     - returns: RequestBuilder<Void> 
     */
    open class func createUsersWithArrayInputWithRequestBuilder(body: [User]) -> RequestBuilder<Void> {
        let localVariablePath = "/user/createWithArray"
        let localVariableURLString = PetstoreClientAPI.basePath + localVariablePath
        let localVariableParameters = JSONEncodingHelper.encodingParameters(forEncodableObject: body)

        let localVariableUrlComponents = URLComponents(string: localVariableURLString)

        let localVariableNillableHeaders: [String: Any?] = [
            :
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<Void>.Type = PetstoreClientAPI.requestBuilderFactory.getNonDecodableBuilder()

        return localVariableRequestBuilder.init(method: "POST", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters)
    }

    /**
     Creates list of users with given input array
     
     - parameter body: (body) List of user object 
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - returns: AnyPublisher<Void, Error>
     */
    #if canImport(Combine)
    @available(macOS 10.15, iOS 13.0, tvOS 13.0, watchOS 6.0, *)
    open class func createUsersWithListInput(body: [User], apiResponseQueue: DispatchQueue = PetstoreClientAPI.apiResponseQueue) -> AnyPublisher<Void, Error> {
        var task: URLSessionTask?
        return Future<Void, Error> { promise in
            task = createUsersWithListInputWithRequestBuilder(body: body).execute(apiResponseQueue) { result in
                switch result {
                case .success:
                    promise(.success(()))
                case let .failure(error):
                    promise(.failure(error))
                }
            }
        }
        .handleEvents(receiveCancel: {
            task?.cancel()
        })
        .eraseToAnyPublisher()
    }
    #endif

    /**
     Creates list of users with given input array
     - POST /user/createWithList
     - parameter body: (body) List of user object 
     - returns: RequestBuilder<Void> 
     */
    open class func createUsersWithListInputWithRequestBuilder(body: [User]) -> RequestBuilder<Void> {
        let localVariablePath = "/user/createWithList"
        let localVariableURLString = PetstoreClientAPI.basePath + localVariablePath
        let localVariableParameters = JSONEncodingHelper.encodingParameters(forEncodableObject: body)

        let localVariableUrlComponents = URLComponents(string: localVariableURLString)

        let localVariableNillableHeaders: [String: Any?] = [
            :
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<Void>.Type = PetstoreClientAPI.requestBuilderFactory.getNonDecodableBuilder()

        return localVariableRequestBuilder.init(method: "POST", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters)
    }

    /**
     Delete user
     
     - parameter username: (path) The name that needs to be deleted 
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - returns: AnyPublisher<Void, Error>
     */
    #if canImport(Combine)
    @available(macOS 10.15, iOS 13.0, tvOS 13.0, watchOS 6.0, *)
    open class func deleteUser(username: String, apiResponseQueue: DispatchQueue = PetstoreClientAPI.apiResponseQueue) -> AnyPublisher<Void, Error> {
        var task: URLSessionTask?
        return Future<Void, Error> { promise in
            task = deleteUserWithRequestBuilder(username: username).execute(apiResponseQueue) { result in
                switch result {
                case .success:
                    promise(.success(()))
                case let .failure(error):
                    promise(.failure(error))
                }
            }
        }
        .handleEvents(receiveCancel: {
            task?.cancel()
        })
        .eraseToAnyPublisher()
    }
    #endif

    /**
     Delete user
     - DELETE /user/{username}
     - This can only be done by the logged in user.
     - parameter username: (path) The name that needs to be deleted 
     - returns: RequestBuilder<Void> 
     */
    open class func deleteUserWithRequestBuilder(username: String) -> RequestBuilder<Void> {
        var localVariablePath = "/user/{username}"
        let usernamePreEscape = "\(APIHelper.mapValueToPathItem(username))"
        let usernamePostEscape = usernamePreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        localVariablePath = localVariablePath.replacingOccurrences(of: "{username}", with: usernamePostEscape, options: .literal, range: nil)
        let localVariableURLString = PetstoreClientAPI.basePath + localVariablePath
        let localVariableParameters: [String: Any]? = nil

        let localVariableUrlComponents = URLComponents(string: localVariableURLString)

        let localVariableNillableHeaders: [String: Any?] = [
            :
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<Void>.Type = PetstoreClientAPI.requestBuilderFactory.getNonDecodableBuilder()

        return localVariableRequestBuilder.init(method: "DELETE", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters)
    }

    /**
     Get user by user name
     
     - parameter username: (path) The name that needs to be fetched. Use user1 for testing. 
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - returns: AnyPublisher<User, Error>
     */
    #if canImport(Combine)
    @available(macOS 10.15, iOS 13.0, tvOS 13.0, watchOS 6.0, *)
    open class func getUserByName(username: String, apiResponseQueue: DispatchQueue = PetstoreClientAPI.apiResponseQueue) -> AnyPublisher<User, Error> {
        var task: URLSessionTask?
        return Future<User, Error> { promise in
            task = getUserByNameWithRequestBuilder(username: username).execute(apiResponseQueue) { result in
                switch result {
                case let .success(response):
                    promise(.success(response.body!))
                case let .failure(error):
                    promise(.failure(error))
                }
            }
        }
        .handleEvents(receiveCancel: {
            task?.cancel()
        })
        .eraseToAnyPublisher()
    }
    #endif

    /**
     Get user by user name
     - GET /user/{username}
     - parameter username: (path) The name that needs to be fetched. Use user1 for testing. 
     - returns: RequestBuilder<User> 
     */
    open class func getUserByNameWithRequestBuilder(username: String) -> RequestBuilder<User> {
        var localVariablePath = "/user/{username}"
        let usernamePreEscape = "\(APIHelper.mapValueToPathItem(username))"
        let usernamePostEscape = usernamePreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        localVariablePath = localVariablePath.replacingOccurrences(of: "{username}", with: usernamePostEscape, options: .literal, range: nil)
        let localVariableURLString = PetstoreClientAPI.basePath + localVariablePath
        let localVariableParameters: [String: Any]? = nil

        let localVariableUrlComponents = URLComponents(string: localVariableURLString)

        let localVariableNillableHeaders: [String: Any?] = [
            :
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<User>.Type = PetstoreClientAPI.requestBuilderFactory.getBuilder()

        return localVariableRequestBuilder.init(method: "GET", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters)
    }

    /**
     Logs user into the system
     
     - parameter username: (query) The user name for login 
     - parameter password: (query) The password for login in clear text 
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - returns: AnyPublisher<String, Error>
     */
    #if canImport(Combine)
    @available(macOS 10.15, iOS 13.0, tvOS 13.0, watchOS 6.0, *)
    open class func loginUser(username: String, password: String, apiResponseQueue: DispatchQueue = PetstoreClientAPI.apiResponseQueue) -> AnyPublisher<String, Error> {
        var task: URLSessionTask?
        return Future<String, Error> { promise in
            task = loginUserWithRequestBuilder(username: username, password: password).execute(apiResponseQueue) { result in
                switch result {
                case let .success(response):
                    promise(.success(response.body!))
                case let .failure(error):
                    promise(.failure(error))
                }
            }
        }
        .handleEvents(receiveCancel: {
            task?.cancel()
        })
        .eraseToAnyPublisher()
    }
    #endif

    /**
     Logs user into the system
     - GET /user/login
     - responseHeaders: [X-Rate-Limit(Int), X-Expires-After(Date)]
     - parameter username: (query) The user name for login 
     - parameter password: (query) The password for login in clear text 
     - returns: RequestBuilder<String> 
     */
    open class func loginUserWithRequestBuilder(username: String, password: String) -> RequestBuilder<String> {
        let localVariablePath = "/user/login"
        let localVariableURLString = PetstoreClientAPI.basePath + localVariablePath
        let localVariableParameters: [String: Any]? = nil

        var localVariableUrlComponents = URLComponents(string: localVariableURLString)
        localVariableUrlComponents?.queryItems = APIHelper.mapValuesToQueryItems([
            "username": username.encodeToJSON(),
            "password": password.encodeToJSON(),
        ])

        let localVariableNillableHeaders: [String: Any?] = [
            :
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<String>.Type = PetstoreClientAPI.requestBuilderFactory.getBuilder()

        return localVariableRequestBuilder.init(method: "GET", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters)
    }

    /**
     Logs out current logged in user session
     
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - returns: AnyPublisher<Void, Error>
     */
    #if canImport(Combine)
    @available(macOS 10.15, iOS 13.0, tvOS 13.0, watchOS 6.0, *)
    open class func logoutUser(apiResponseQueue: DispatchQueue = PetstoreClientAPI.apiResponseQueue) -> AnyPublisher<Void, Error> {
        var task: URLSessionTask?
        return Future<Void, Error> { promise in
            task = logoutUserWithRequestBuilder().execute(apiResponseQueue) { result in
                switch result {
                case .success:
                    promise(.success(()))
                case let .failure(error):
                    promise(.failure(error))
                }
            }
        }
        .handleEvents(receiveCancel: {
            task?.cancel()
        })
        .eraseToAnyPublisher()
    }
    #endif

    /**
     Logs out current logged in user session
     - GET /user/logout
     - returns: RequestBuilder<Void> 
     */
    open class func logoutUserWithRequestBuilder() -> RequestBuilder<Void> {
        let localVariablePath = "/user/logout"
        let localVariableURLString = PetstoreClientAPI.basePath + localVariablePath
        let localVariableParameters: [String: Any]? = nil

        let localVariableUrlComponents = URLComponents(string: localVariableURLString)

        let localVariableNillableHeaders: [String: Any?] = [
            :
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<Void>.Type = PetstoreClientAPI.requestBuilderFactory.getNonDecodableBuilder()

        return localVariableRequestBuilder.init(method: "GET", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters)
    }

    /**
     Updated user
     
     - parameter username: (path) name that need to be deleted 
     - parameter body: (body) Updated user object 
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - returns: AnyPublisher<Void, Error>
     */
    #if canImport(Combine)
    @available(macOS 10.15, iOS 13.0, tvOS 13.0, watchOS 6.0, *)
    open class func updateUser(username: String, body: User, apiResponseQueue: DispatchQueue = PetstoreClientAPI.apiResponseQueue) -> AnyPublisher<Void, Error> {
        var task: URLSessionTask?
        return Future<Void, Error> { promise in
            task = updateUserWithRequestBuilder(username: username, body: body).execute(apiResponseQueue) { result in
                switch result {
                case .success:
                    promise(.success(()))
                case let .failure(error):
                    promise(.failure(error))
                }
            }
        }
        .handleEvents(receiveCancel: {
            task?.cancel()
        })
        .eraseToAnyPublisher()
    }
    #endif

    /**
     Updated user
     - PUT /user/{username}
     - This can only be done by the logged in user.
     - parameter username: (path) name that need to be deleted 
     - parameter body: (body) Updated user object 
     - returns: RequestBuilder<Void> 
     */
    open class func updateUserWithRequestBuilder(username: String, body: User) -> RequestBuilder<Void> {
        var localVariablePath = "/user/{username}"
        let usernamePreEscape = "\(APIHelper.mapValueToPathItem(username))"
        let usernamePostEscape = usernamePreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        localVariablePath = localVariablePath.replacingOccurrences(of: "{username}", with: usernamePostEscape, options: .literal, range: nil)
        let localVariableURLString = PetstoreClientAPI.basePath + localVariablePath
        let localVariableParameters = JSONEncodingHelper.encodingParameters(forEncodableObject: body)

        let localVariableUrlComponents = URLComponents(string: localVariableURLString)

        let localVariableNillableHeaders: [String: Any?] = [
            :
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<Void>.Type = PetstoreClientAPI.requestBuilderFactory.getNonDecodableBuilder()

        return localVariableRequestBuilder.init(method: "PUT", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters)
    }
}
