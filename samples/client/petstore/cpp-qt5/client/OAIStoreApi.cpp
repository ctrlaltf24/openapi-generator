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

#include "OAIStoreApi.h"
#include "OAIHelpers.h"

#include <QJsonArray>
#include <QJsonDocument>

namespace OpenAPI {

OAIStoreApi::OAIStoreApi() : basePath("/v2"),
    host("petstore.swagger.io"),
    timeout(0){

}

OAIStoreApi::~OAIStoreApi() {

}

OAIStoreApi::OAIStoreApi(const QString& host, const QString& basePath, const int tout) {
    this->host = host;
    this->basePath = basePath;
    this->timeout = tout;
}

void OAIStoreApi::setBasePath(const QString& basePath){
    this->basePath = basePath;
}

void OAIStoreApi::setHost(const QString& host){
    this->host = host;
}

void OAIStoreApi::setApiTimeOutMs(const int tout){
    timeout = tout;
}

void OAIStoreApi::addHeaders(const QString& key, const QString& value){
    defaultHeaders.insert(key, value);
}


void
OAIStoreApi::deleteOrder(const QString& order_id) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/store/order/{orderId}");
    QString order_idPathParam("{"); 
    order_idPathParam.append("orderId").append("}");
    fullPath.replace(order_idPathParam, QUrl::toPercentEncoding(::OpenAPI::toStringValue(order_id)));
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    worker->setTimeOut(timeout);    
    OAIHttpRequestInput input(fullPath, "DELETE");


    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIStoreApi::deleteOrderCallback);

    worker->execute(&input);
}

void
OAIStoreApi::deleteOrderCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit deleteOrderSignal();
        emit deleteOrderSignalFull(worker);
    } else {
        emit deleteOrderSignalE(error_type, error_str);
        emit deleteOrderSignalEFull(worker, error_type, error_str);
    }
}

void
OAIStoreApi::getInventory() {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/store/inventory");
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    worker->setTimeOut(timeout);    
    OAIHttpRequestInput input(fullPath, "GET");


    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIStoreApi::getInventoryCallback);

    worker->execute(&input);
}

void
OAIStoreApi::getInventoryCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    QMap<QString, qint32> output;
    QString json(worker->response);
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject obj = doc.object();
    foreach(QString key, obj.keys()) {
        qint32 val;
        ::OpenAPI::fromJsonValue(val, obj[key]);
        output.insert(key, val);
    }
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit getInventorySignal(output);
        emit getInventorySignalFull(worker, output);
    } else {
        emit getInventorySignalE(output, error_type, error_str);
        emit getInventorySignalEFull(worker, error_type, error_str);
    }
}

void
OAIStoreApi::getOrderById(const qint64& order_id) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/store/order/{orderId}");
    QString order_idPathParam("{"); 
    order_idPathParam.append("orderId").append("}");
    fullPath.replace(order_idPathParam, QUrl::toPercentEncoding(::OpenAPI::toStringValue(order_id)));
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    worker->setTimeOut(timeout);    
    OAIHttpRequestInput input(fullPath, "GET");


    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIStoreApi::getOrderByIdCallback);

    worker->execute(&input);
}

void
OAIStoreApi::getOrderByIdCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    OAIOrder output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit getOrderByIdSignal(output);
        emit getOrderByIdSignalFull(worker, output);
    } else {
        emit getOrderByIdSignalE(output, error_type, error_str);
        emit getOrderByIdSignalEFull(worker, error_type, error_str);
    }
}

void
OAIStoreApi::placeOrder(const OAIOrder& body) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/store/order");
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    worker->setTimeOut(timeout);    
    OAIHttpRequestInput input(fullPath, "POST");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIStoreApi::placeOrderCallback);

    worker->execute(&input);
}

void
OAIStoreApi::placeOrderCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    OAIOrder output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit placeOrderSignal(output);
        emit placeOrderSignalFull(worker, output);
    } else {
        emit placeOrderSignalE(output, error_type, error_str);
        emit placeOrderSignalEFull(worker, error_type, error_str);
    }
}


}
