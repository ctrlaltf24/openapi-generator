//
// ArrayOfNumberOnly.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
import AnyCodable

@objc public class ArrayOfNumberOnly: NSObject, Codable {

    public var arrayNumber: [Double]?

    public init(arrayNumber: [Double]? = nil) {
        self.arrayNumber = arrayNumber
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case arrayNumber = "ArrayNumber"
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(arrayNumber, forKey: .arrayNumber)
    }
}
