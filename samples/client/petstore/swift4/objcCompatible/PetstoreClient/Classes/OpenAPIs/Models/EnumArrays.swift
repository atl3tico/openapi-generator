//
// EnumArrays.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

@objc public class EnumArrays: NSObject, Codable {

    public enum JustSymbol: String, Codable {
        case greaterThanOrEqualTo = ">="
        case dollar = "$"
    }
    public enum ArrayEnum: String, Codable {
        case fish = "fish"
        case crab = "crab"
    }
    public var justSymbol: JustSymbol?
    public var arrayEnum: [ArrayEnum]?

    public init(justSymbol: JustSymbol?, arrayEnum: [ArrayEnum]?) {
        self.justSymbol = justSymbol
        self.arrayEnum = arrayEnum
    }

    public enum CodingKeys: String, CodingKey {
        case justSymbol = "just_symbol"
        case arrayEnum = "array_enum"
    }

}
