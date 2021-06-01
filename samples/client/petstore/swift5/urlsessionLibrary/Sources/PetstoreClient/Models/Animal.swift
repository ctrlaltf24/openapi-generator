//
// Animal.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

@available(*, deprecated, renamed: "PetstoreClient.Animal")
public typealias Animal = PetstoreClient.Animal

extension PetstoreClient {

public final class Animal: Codable, Hashable {

    public var className: String
    public var color: String? = "red"

    public init(className: String, color: String? = "red") {
        self.className = className
        self.color = color
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case className
        case color
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(className, forKey: .className)
        try container.encodeIfPresent(color, forKey: .color)
    }

    public static func == (lhs: Animal, rhs: Animal) -> Bool {
        lhs.className == rhs.className &&
        lhs.color == rhs.color
        
    }

    public func hash(into hasher: inout Hasher) {
        hasher.combine(className.hashValue)
        hasher.combine(color?.hashValue)
        
    }
}
}
