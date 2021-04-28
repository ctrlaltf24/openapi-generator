//
// ArrayOfArrayOfNumberOnly.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
import AnyCodable

internal struct ArrayOfArrayOfNumberOnly: Codable, Hashable {

    internal var arrayArrayNumber: [[Double]]?

    internal init(arrayArrayNumber: [[Double]]? = nil) {
        self.arrayArrayNumber = arrayArrayNumber
    }
    internal enum CodingKeys: String, CodingKey, CaseIterable {
        case arrayArrayNumber = "ArrayArrayNumber"
    }

    // Encodable protocol methods

    internal func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(arrayArrayNumber, forKey: .arrayArrayNumber)
    }



}
