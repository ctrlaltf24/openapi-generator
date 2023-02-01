/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 6.3.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * SingleRefType.h
 *
 * 
 */

#ifndef SingleRefType_H_
#define SingleRefType_H_



#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  SingleRefType 
{
public:
    SingleRefType() = default;
    explicit SingleRefType(boost::property_tree::ptree const& pt);
    virtual ~SingleRefType() = default;

    SingleRefType(const SingleRefType& other) = default; // copy constructor
    SingleRefType(SingleRefType&& other) noexcept = default; // move constructor

    SingleRefType& operator=(const SingleRefType& other) = default; // copy assignment
    SingleRefType& operator=(SingleRefType&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    std::string toString() const;
    void fromString(const std::string& str);

    /////////////////////////////////////////////
    /// SingleRefType members
    std::string getEnumValue() const;
    void setEnumValue(const std::string& val);

protected:
    std::string m_SingleRefTypeEnumValue;
};

std::vector<SingleRefType> createSingleRefTypeVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<SingleRefType>(const SingleRefType& val) {
    return val.toPropertyTree();
}

template<>
inline SingleRefType fromPt<SingleRefType>(const boost::property_tree::ptree& pt) {
    SingleRefType ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* SingleRefType_H_ */
