//
// CatAllOf.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
import AnyCodable

public final class CatAllOf: Codable, Hashable {

    public var declawed: Bool?

    public init(declawed: Bool? = nil) {
        self.declawed = declawed
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case declawed
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(declawed, forKey: .declawed)
    }

    public static func == (lhs: CatAllOf, rhs: CatAllOf) -> Bool {
        lhs.declawed == rhs.declawed
        
    }

    public func hash(into hasher: inout Hasher) {
        hasher.combine(declawed?.hashValue)
        
    }
}
