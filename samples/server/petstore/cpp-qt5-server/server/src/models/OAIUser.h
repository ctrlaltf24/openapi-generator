/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * OAIUser.h
 *
 * A User who is purchasing from the pet store
 */

#ifndef OAIUser_H_
#define OAIUser_H_

#include <QJsonObject>


#include <QString>

#include "OAIObject.h"

namespace OpenAPI {

class OAIUser: public OAIObject {
public:
    OAIUser();
    OAIUser(QString json);
    ~OAIUser() override;
    void init();

    QString asJson () const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    qint64 getId();
    void setId(const qint64 &id);

    QString getUsername();
    void setUsername(const QString &username);

    QString getFirstName();
    void setFirstName(const QString &first_name);

    QString getLastName();
    void setLastName(const QString &last_name);

    QString getEmail();
    void setEmail(const QString &email);

    QString getPassword();
    void setPassword(const QString &password);

    QString getPhone();
    void setPhone(const QString &phone);

    qint32 getUserStatus();
    void setUserStatus(const qint32 &user_status);

    virtual bool isSet() const override;

private:
    qint64 id;
    bool m_id_isSet;

    QString username;
    bool m_username_isSet;

    QString first_name;
    bool m_first_name_isSet;

    QString last_name;
    bool m_last_name_isSet;

    QString email;
    bool m_email_isSet;

    QString password;
    bool m_password_isSet;

    QString phone;
    bool m_phone_isSet;

    qint32 user_status;
    bool m_user_status_isSet;

};

}

#endif /* OAIUser_H_ */
