/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


#include "OAIApiResponse.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIApiResponse::OAIApiResponse(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIApiResponse::OAIApiResponse() {
    this->initializeModel();
}

OAIApiResponse::~OAIApiResponse() {

}

void
OAIApiResponse::initializeModel() {
    
    m_code_isSet = false;
    m_code_isValid = false;
    
    m_type_isSet = false;
    m_type_isValid = false;
    
    m_message_isSet = false;
    m_message_isValid = false;
    
}

void
OAIApiResponse::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIApiResponse::fromJsonObject(QJsonObject json) {
    
    m_code_isValid = ::OpenAPI::fromJsonValue(code, json[QString("code")]);
    m_code_isSet = !json[QString("code")].isNull() && m_code_isValid;
    
    m_type_isValid = ::OpenAPI::fromJsonValue(type, json[QString("type")]);
    m_type_isSet = !json[QString("type")].isNull() && m_type_isValid;
    
    m_message_isValid = ::OpenAPI::fromJsonValue(message, json[QString("message")]);
    m_message_isSet = !json[QString("message")].isNull() && m_message_isValid;
    
}

QString
OAIApiResponse::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIApiResponse::asJsonObject() const {
    QJsonObject obj;
    if(m_code_isSet){
        obj.insert(QString("code"), ::OpenAPI::toJsonValue(code));
    }
    if(m_type_isSet){
        obj.insert(QString("type"), ::OpenAPI::toJsonValue(type));
    }
    if(m_message_isSet){
        obj.insert(QString("message"), ::OpenAPI::toJsonValue(message));
    }
    return obj;
}


qint32
OAIApiResponse::getCode() const {
    return code;
}
void
OAIApiResponse::setCode(const qint32 &code) {
    this->code = code;
    this->m_code_isSet = true;
}


QString
OAIApiResponse::getType() const {
    return type;
}
void
OAIApiResponse::setType(const QString &type) {
    this->type = type;
    this->m_type_isSet = true;
}


QString
OAIApiResponse::getMessage() const {
    return message;
}
void
OAIApiResponse::setMessage(const QString &message) {
    this->message = message;
    this->m_message_isSet = true;
}

bool
OAIApiResponse::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(m_code_isSet){ isObjectUpdated = true; break;}
    
        if(m_type_isSet){ isObjectUpdated = true; break;}
    
        if(m_message_isSet){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

bool
OAIApiResponse::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

}

