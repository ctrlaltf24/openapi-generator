//
// FormatTest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

internal struct FormatTest: Codable {

    internal var integer: Int?
    internal var int32: Int?
    internal var int64: Int64?
    internal var number: Double
    internal var float: Float?
    internal var double: Double?
    internal var string: String?
    internal var byte: Data
    internal var binary: URL?
    internal var date: Date
    internal var dateTime: Date?
    internal var uuid: UUID?
    internal var password: String

    internal init(integer: Int?, int32: Int?, int64: Int64?, number: Double, float: Float?, double: Double?, string: String?, byte: Data, binary: URL?, date: Date, dateTime: Date?, uuid: UUID?, password: String) {
        self.integer = integer
        self.int32 = int32
        self.int64 = int64
        self.number = number
        self.float = float
        self.double = double
        self.string = string
        self.byte = byte
        self.binary = binary
        self.date = date
        self.dateTime = dateTime
        self.uuid = uuid
        self.password = password
    }

}
