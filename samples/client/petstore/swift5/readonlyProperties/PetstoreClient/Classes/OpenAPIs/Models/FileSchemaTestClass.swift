//
// FileSchemaTestClass.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
import AnyCodable

public struct FileSchemaTestClass: Codable, Hashable {

    public private(set) var file: File?
    public private(set) var files: [File]?

    public init(file: File? = nil, files: [File]? = nil) {
        self.file = file
        self.files = files
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case file
        case files
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(file, forKey: .file)
        try container.encodeIfPresent(files, forKey: .files)
    }
}
