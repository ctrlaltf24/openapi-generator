//
// Result.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

#if swift(<5)

public enum Result<Value, Error: Swift.Error> {
    case success(Value)
    case failure(Error)
}

#endif
