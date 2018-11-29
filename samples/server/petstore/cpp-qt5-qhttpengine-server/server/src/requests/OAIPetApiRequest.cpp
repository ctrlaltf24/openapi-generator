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

#include <QJsonArray>
#include <QJsonDocument>
#include <QJsonObject>
#include <QVariantMap>
#include <QDebug>

#include "OAIHelpers.h"
#include "OAIPetApiRequest.h"

namespace OpenAPI {

OAIPetApiRequest::OAIPetApiRequest(QHttpEngine::Socket *s, OAIPetApiHandler* hdl) : QObject(s), socket(s), handler(hdl) {
    auto headers = s->headers();
    for(auto itr = headers.begin(); itr != headers.end(); itr++) {
        requestHeaders.insert(QString(itr.key()), QString(itr.value()));
    }
}

OAIPetApiRequest::~OAIPetApiRequest(){
    disconnect(this, nullptr, nullptr, nullptr);
    qDebug() << "OAIPetApiRequest::~OAIPetApiRequest()";
}

QMap<QString, QString>
OAIPetApiRequest::getRequestHeaders() const {
    return requestHeaders;
}

void OAIPetApiRequest::setResponseHeaders(const QMultiMap<QString, QString>& headers){
    for(auto itr = headers.begin(); itr != headers.end(); ++itr) {
        responseHeaders.insert(itr.key(), itr.value());
    }
}


QHttpEngine::Socket* OAIPetApiRequest::getRawSocket(){
    return socket;
}


void OAIPetApiRequest::addPetRequest(){
    qDebug() << "/v2/pet";
    connect(this, &OAIPetApiRequest::addPet, handler, &OAIPetApiHandler::addPet);

    
 
    QJsonDocument doc;
    socket->readJson(doc);
    QJsonObject obj = doc.object();
    OAIPet oai_pet;
    ::OpenAPI::fromJsonValue(oai_pet, obj);
    

    emit addPet(oai_pet);
}


void OAIPetApiRequest::deletePetRequest(const QString& pet_idstr){
    qDebug() << "/v2/pet/{petId}";
    connect(this, &OAIPetApiRequest::deletePet, handler, &OAIPetApiHandler::deletePet);

    
    qint64 pet_id;
    fromStringValue(pet_idstr, pet_id);
    
    QString api_key;
    if(socket->headers().keys().contains("api_key")){
        fromStringValue(socket->queryString().value("api_key"), api_key);
    }
    

    emit deletePet(pet_id, api_key);
}


void OAIPetApiRequest::findPetsByStatusRequest(){
    qDebug() << "/v2/pet/findByStatus";
    connect(this, &OAIPetApiRequest::findPetsByStatus, handler, &OAIPetApiHandler::findPetsByStatus);

    
    QList<QString> status;
    if(socket->queryString().keys().contains("status")){
        fromStringValue(socket->queryString().values("status"), status);
    }
    


    emit findPetsByStatus(status);
}


void OAIPetApiRequest::findPetsByTagsRequest(){
    qDebug() << "/v2/pet/findByTags";
    connect(this, &OAIPetApiRequest::findPetsByTags, handler, &OAIPetApiHandler::findPetsByTags);

    
    QList<QString> tags;
    if(socket->queryString().keys().contains("tags")){
        fromStringValue(socket->queryString().values("tags"), tags);
    }
    


    emit findPetsByTags(tags);
}


void OAIPetApiRequest::getPetByIdRequest(const QString& pet_idstr){
    qDebug() << "/v2/pet/{petId}";
    connect(this, &OAIPetApiRequest::getPetById, handler, &OAIPetApiHandler::getPetById);

    
    qint64 pet_id;
    fromStringValue(pet_idstr, pet_id);
    

    emit getPetById(pet_id);
}


void OAIPetApiRequest::updatePetRequest(){
    qDebug() << "/v2/pet";
    connect(this, &OAIPetApiRequest::updatePet, handler, &OAIPetApiHandler::updatePet);

    
 
    QJsonDocument doc;
    socket->readJson(doc);
    QJsonObject obj = doc.object();
    OAIPet oai_pet;
    ::OpenAPI::fromJsonValue(oai_pet, obj);
    

    emit updatePet(oai_pet);
}


void OAIPetApiRequest::updatePetWithFormRequest(const QString& pet_idstr){
    qDebug() << "/v2/pet/{petId}";
    connect(this, &OAIPetApiRequest::updatePetWithForm, handler, &OAIPetApiHandler::updatePetWithForm);

    
    qint64 pet_id;
    fromStringValue(pet_idstr, pet_id);
    
    QString name;
    QString status;

    emit updatePetWithForm(pet_id, name, status);
}


void OAIPetApiRequest::uploadFileRequest(const QString& pet_idstr){
    qDebug() << "/v2/pet/{petId}/uploadImage";
    connect(this, &OAIPetApiRequest::uploadFile, handler, &OAIPetApiHandler::uploadFile);

    
    qint64 pet_id;
    fromStringValue(pet_idstr, pet_id);
    
    QString additional_metadata;
    QIODevice* file;

    emit uploadFile(pet_id, additional_metadata, file);
}



void OAIPetApiRequest::addPetResponse(){
    writeResponseHeaders();
    socket->setStatusCode(QHttpEngine::Socket::OK);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIPetApiRequest::deletePetResponse(){
    writeResponseHeaders();
    socket->setStatusCode(QHttpEngine::Socket::OK);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIPetApiRequest::findPetsByStatusResponse(const QList<OAIPet>& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toArray());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIPetApiRequest::findPetsByTagsResponse(const QList<OAIPet>& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toArray());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIPetApiRequest::getPetByIdResponse(const OAIPet& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIPetApiRequest::updatePetResponse(){
    writeResponseHeaders();
    socket->setStatusCode(QHttpEngine::Socket::OK);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIPetApiRequest::updatePetWithFormResponse(){
    writeResponseHeaders();
    socket->setStatusCode(QHttpEngine::Socket::OK);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIPetApiRequest::uploadFileResponse(const OAIApiResponse& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIPetApiRequest::addPetError(QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    socket->setStatusCode(QHttpEngine::Socket::NotFound);
    socket->write(error_str.toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIPetApiRequest::deletePetError(QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    socket->setStatusCode(QHttpEngine::Socket::NotFound);
    socket->write(error_str.toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIPetApiRequest::findPetsByStatusError(const QList<OAIPet>& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toArray());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIPetApiRequest::findPetsByTagsError(const QList<OAIPet>& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toArray());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIPetApiRequest::getPetByIdError(const OAIPet& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIPetApiRequest::updatePetError(QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    socket->setStatusCode(QHttpEngine::Socket::NotFound);
    socket->write(error_str.toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIPetApiRequest::updatePetWithFormError(QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    socket->setStatusCode(QHttpEngine::Socket::NotFound);
    socket->write(error_str.toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIPetApiRequest::uploadFileError(const OAIApiResponse& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIPetApiRequest::sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type); // TODO
    socket->write(res);
    if(socket->isOpen()){
        socket->close();
    }    
}

void OAIPetApiRequest::sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type);  // TODO
    socket->write(res->readAll());
    if(socket->isOpen()){
        socket->close();
    }
}

}
