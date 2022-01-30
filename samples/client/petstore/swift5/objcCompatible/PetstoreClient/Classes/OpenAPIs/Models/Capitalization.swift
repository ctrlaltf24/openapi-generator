//
// Capitalization.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

@objc public class Capitalization: NSObject, Codable, JSONEncodable {

    public var smallCamel: String?
    public var capitalCamel: String?
    public var smallSnake: String?
    public var capitalSnake: String?
    public var sCAETHFlowPoints: String?
    /** Name of the pet  */
    public var ATT_NAME: String?

    public init(smallCamel: String? = nil, capitalCamel: String? = nil, smallSnake: String? = nil, capitalSnake: String? = nil, sCAETHFlowPoints: String? = nil, ATT_NAME: String? = nil) {
        self.smallCamel = smallCamel
        self.capitalCamel = capitalCamel
        self.smallSnake = smallSnake
        self.capitalSnake = capitalSnake
        self.sCAETHFlowPoints = sCAETHFlowPoints
        self.ATT_NAME = ATT_NAME
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case smallCamel
        case capitalCamel = "CapitalCamel"
        case smallSnake = "small_Snake"
        case capitalSnake = "Capital_Snake"
        case sCAETHFlowPoints = "SCA_ETH_Flow_Points"
        case ATT_NAME
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(smallCamel, forKey: .smallCamel)
        try container.encodeIfPresent(capitalCamel, forKey: .capitalCamel)
        try container.encodeIfPresent(smallSnake, forKey: .smallSnake)
        try container.encodeIfPresent(capitalSnake, forKey: .capitalSnake)
        try container.encodeIfPresent(sCAETHFlowPoints, forKey: .sCAETHFlowPoints)
        try container.encodeIfPresent(ATT_NAME, forKey: .ATT_NAME)
    }
}

