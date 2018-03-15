//
// AllPrimitives.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** Object which contains lots of different primitive Swagger types */

public struct AllPrimitives: Codable {

    public enum MyInlineStringEnum: String, Codable { 
        case inlinestringenumvalue1 = "inlineStringEnumValue1"
        case inlinestringenumvalue2 = "inlineStringEnumValue2"
        case inlinestringenumvalue3 = "inlineStringEnumValue3"
    }
    public var myInteger: Int?
    public var myIntegerArray: [Int]?
    public var myLong: Int64?
    public var myLongArray: [Int64]?
    public var myFloat: Float?
    public var myFloatArray: [Float]?
    public var myDouble: Double?
    public var myDoubleArray: [Double]?
    public var myString: String?
    public var myStringArray: [String]?
    public var myBytes: Data?
    public var myBytesArray: [Data]?
    public var myBoolean: Bool?
    public var myBooleanArray: [Bool]?
    public var myDate: Date?
    public var myDateArray: [Date]?
    public var myDateTime: Date?
    public var myDateTimeArray: [Date]?
    public var myFile: URL?
    public var myFileArray: [URL]?
    public var myUUID: UUID?
    public var myUUIDArray: [UUID]?
    public var myStringEnum: StringEnum?
    public var myStringEnumArray: [StringEnum]?
    public var myInlineStringEnum: MyInlineStringEnum?

    public init(myInteger: Int?, myIntegerArray: [Int]?, myLong: Int64?, myLongArray: [Int64]?, myFloat: Float?, myFloatArray: [Float]?, myDouble: Double?, myDoubleArray: [Double]?, myString: String?, myStringArray: [String]?, myBytes: Data?, myBytesArray: [Data]?, myBoolean: Bool?, myBooleanArray: [Bool]?, myDate: Date?, myDateArray: [Date]?, myDateTime: Date?, myDateTimeArray: [Date]?, myFile: URL?, myFileArray: [URL]?, myUUID: UUID?, myUUIDArray: [UUID]?, myStringEnum: StringEnum?, myStringEnumArray: [StringEnum]?, myInlineStringEnum: MyInlineStringEnum?) {
        self.myInteger = myInteger
        self.myIntegerArray = myIntegerArray
        self.myLong = myLong
        self.myLongArray = myLongArray
        self.myFloat = myFloat
        self.myFloatArray = myFloatArray
        self.myDouble = myDouble
        self.myDoubleArray = myDoubleArray
        self.myString = myString
        self.myStringArray = myStringArray
        self.myBytes = myBytes
        self.myBytesArray = myBytesArray
        self.myBoolean = myBoolean
        self.myBooleanArray = myBooleanArray
        self.myDate = myDate
        self.myDateArray = myDateArray
        self.myDateTime = myDateTime
        self.myDateTimeArray = myDateTimeArray
        self.myFile = myFile
        self.myFileArray = myFileArray
        self.myUUID = myUUID
        self.myUUIDArray = myUUIDArray
        self.myStringEnum = myStringEnum
        self.myStringEnumArray = myStringEnumArray
        self.myInlineStringEnum = myInlineStringEnum
    }



}

