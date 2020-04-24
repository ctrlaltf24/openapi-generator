/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#include "OAIOrder.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIOrder::OAIOrder(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIOrder::OAIOrder() {
    this->initializeModel();
}

OAIOrder::~OAIOrder() {}

void OAIOrder::initializeModel() {

    m_id_isSet = false;
    m_id_isValid = false;

    m_pet_id_isSet = false;
    m_pet_id_isValid = false;

    m_quantity_isSet = false;
    m_quantity_isValid = false;

    m_ship_date_isSet = false;
    m_ship_date_isValid = false;

    m_status_isSet = false;
    m_status_isValid = false;

    m_complete_isSet = false;
    m_complete_isValid = false;
}

void OAIOrder::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIOrder::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::OpenAPI::fromJsonValue(id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_pet_id_isValid = ::OpenAPI::fromJsonValue(pet_id, json[QString("petId")]);
    m_pet_id_isSet = !json[QString("petId")].isNull() && m_pet_id_isValid;

    m_quantity_isValid = ::OpenAPI::fromJsonValue(quantity, json[QString("quantity")]);
    m_quantity_isSet = !json[QString("quantity")].isNull() && m_quantity_isValid;

    m_ship_date_isValid = ::OpenAPI::fromJsonValue(ship_date, json[QString("shipDate")]);
    m_ship_date_isSet = !json[QString("shipDate")].isNull() && m_ship_date_isValid;

    m_status_isValid = ::OpenAPI::fromJsonValue(status, json[QString("status")]);
    m_status_isSet = !json[QString("status")].isNull() && m_status_isValid;

    m_complete_isValid = ::OpenAPI::fromJsonValue(complete, json[QString("complete")]);
    m_complete_isSet = !json[QString("complete")].isNull() && m_complete_isValid;
}

QString OAIOrder::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIOrder::asJsonObject() const {
    QJsonObject obj;
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(id));
    }
    if (m_pet_id_isSet) {
        obj.insert(QString("petId"), ::OpenAPI::toJsonValue(pet_id));
    }
    if (m_quantity_isSet) {
        obj.insert(QString("quantity"), ::OpenAPI::toJsonValue(quantity));
    }
    if (m_ship_date_isSet) {
        obj.insert(QString("shipDate"), ::OpenAPI::toJsonValue(ship_date));
    }
    if (m_status_isSet) {
        obj.insert(QString("status"), ::OpenAPI::toJsonValue(status));
    }
    if (m_complete_isSet) {
        obj.insert(QString("complete"), ::OpenAPI::toJsonValue(complete));
    }
    return obj;
}

qint64 OAIOrder::getId() const {
    return id;
}
void OAIOrder::setId(const qint64 &id) {
    this->id = id;
    this->m_id_isSet = true;
}

bool OAIOrder::is_id_Set() const{
    return m_id_isSet;
}

bool OAIOrder::is_id_Valid() const{
    return m_id_isValid;
}

qint64 OAIOrder::getPetId() const {
    return pet_id;
}
void OAIOrder::setPetId(const qint64 &pet_id) {
    this->pet_id = pet_id;
    this->m_pet_id_isSet = true;
}

bool OAIOrder::is_pet_id_Set() const{
    return m_pet_id_isSet;
}

bool OAIOrder::is_pet_id_Valid() const{
    return m_pet_id_isValid;
}

qint32 OAIOrder::getQuantity() const {
    return quantity;
}
void OAIOrder::setQuantity(const qint32 &quantity) {
    this->quantity = quantity;
    this->m_quantity_isSet = true;
}

bool OAIOrder::is_quantity_Set() const{
    return m_quantity_isSet;
}

bool OAIOrder::is_quantity_Valid() const{
    return m_quantity_isValid;
}

QDateTime OAIOrder::getShipDate() const {
    return ship_date;
}
void OAIOrder::setShipDate(const QDateTime &ship_date) {
    this->ship_date = ship_date;
    this->m_ship_date_isSet = true;
}

bool OAIOrder::is_ship_date_Set() const{
    return m_ship_date_isSet;
}

bool OAIOrder::is_ship_date_Valid() const{
    return m_ship_date_isValid;
}

QString OAIOrder::getStatus() const {
    return status;
}
void OAIOrder::setStatus(const QString &status) {
    this->status = status;
    this->m_status_isSet = true;
}

bool OAIOrder::is_status_Set() const{
    return m_status_isSet;
}

bool OAIOrder::is_status_Valid() const{
    return m_status_isValid;
}

bool OAIOrder::isComplete() const {
    return complete;
}
void OAIOrder::setComplete(const bool &complete) {
    this->complete = complete;
    this->m_complete_isSet = true;
}

bool OAIOrder::is_complete_Set() const{
    return m_complete_isSet;
}

bool OAIOrder::is_complete_Valid() const{
    return m_complete_isValid;
}

bool OAIOrder::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_pet_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_quantity_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_ship_date_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_status_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_complete_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIOrder::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
