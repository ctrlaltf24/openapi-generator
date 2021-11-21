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

#include "PFXStoreApi.h"
#include "PFXServerConfiguration.h"
#include <QJsonArray>
#include <QJsonDocument>

namespace test_namespace {

PFXStoreApi::PFXStoreApi(const int timeOut)
    : _timeOut(timeOut),
      _manager(nullptr),
      _isResponseCompressionEnabled(false),
      _isRequestCompressionEnabled(false) {
    initializeServerConfigs();
}

PFXStoreApi::~PFXStoreApi() {
}

void PFXStoreApi::initializeServerConfigs() {
    //Default server
    QList<PFXServerConfiguration> defaultConf = QList<PFXServerConfiguration>();
    //varying endpoint server
    defaultConf.append(PFXServerConfiguration(
    QUrl("http://petstore.swagger.io/v2"),
    "No description provided",
    QMap<QString, PFXServerVariable>()));
    _serverConfigs.insert("deleteOrder", defaultConf);
    _serverIndices.insert("deleteOrder", 0);
    _serverConfigs.insert("getInventory", defaultConf);
    _serverIndices.insert("getInventory", 0);
    _serverConfigs.insert("getOrderById", defaultConf);
    _serverIndices.insert("getOrderById", 0);
    _serverConfigs.insert("placeOrder", defaultConf);
    _serverIndices.insert("placeOrder", 0);
}

/**
* returns 0 on success and -1, -2 or -3 on failure.
* -1 when the variable does not exist and -2 if the value is not defined in the enum and -3 if the operation or server index is not found
*/
int PFXStoreApi::setDefaultServerValue(int serverIndex, const QString &operation, const QString &variable, const QString &value) {
    auto it = _serverConfigs.find(operation);
    if (it != _serverConfigs.end() && serverIndex < it.value().size()) {
      return _serverConfigs[operation][serverIndex].setDefaultValue(variable,value);
    }
    return -3;
}
void PFXStoreApi::setServerIndex(const QString &operation, int serverIndex) {
    if (_serverIndices.contains(operation) && serverIndex < _serverConfigs.find(operation).value().size()) {
        _serverIndices[operation] = serverIndex;
    }
}

void PFXStoreApi::setApiKey(const QString &apiKeyName, const QString &apiKey) {
    _apiKeys.insert(apiKeyName,apiKey);
}

void PFXStoreApi::setBearerToken(const QString &token) {
    _bearerToken = token;
}

void PFXStoreApi::setUsername(const QString &username) {
    _username = username;
}

void PFXStoreApi::setPassword(const QString &password) {
    _password = password;
}


void PFXStoreApi::setTimeOut(const int timeOut) {
    _timeOut = timeOut;
}

void PFXStoreApi::setWorkingDirectory(const QString &path) {
    _workingDirectory = path;
}

void PFXStoreApi::setNetworkAccessManager(QNetworkAccessManager* manager) {
    _manager = manager;
}

/**
    * Appends a new ServerConfiguration to the config map for a specific operation.
    * @param operation The id to the target operation.
    * @param url A string that contains the URL of the server
    * @param description A String that describes the server
    * @param variables A map between a variable name and its value. The value is used for substitution in the server's URL template.
    * returns the index of the new server config on success and -1 if the operation is not found
    */
int PFXStoreApi::addServerConfiguration(const QString &operation, const QUrl &url, const QString &description, const QMap<QString, PFXServerVariable> &variables) {
    if (_serverConfigs.contains(operation)) {
        _serverConfigs[operation].append(PFXServerConfiguration(
                    url,
                    description,
                    variables));
        return _serverConfigs[operation].size()-1;
    } else {
        return -1;
    }
}

/**
    * Appends a new ServerConfiguration to the config map for a all operations and sets the index to that server.
    * @param url A string that contains the URL of the server
    * @param description A String that describes the server
    * @param variables A map between a variable name and its value. The value is used for substitution in the server's URL template.
    */
void PFXStoreApi::setNewServerForAllOperations(const QUrl &url, const QString &description, const QMap<QString, PFXServerVariable> &variables) {
#if QT_VERSION >= QT_VERSION_CHECK(5, 12, 0)
    for (auto keyIt = _serverIndices.keyBegin(); keyIt != _serverIndices.keyEnd(); keyIt++) {
        setServerIndex(*keyIt, addServerConfiguration(*keyIt, url, description, variables));
    }
#else
    for (auto &e : _serverIndices.keys()) {
        setServerIndex(e, addServerConfiguration(e, url, description, variables));
    }
#endif
}

/**
    * Appends a new ServerConfiguration to the config map for an operations and sets the index to that server.
    * @param URL A string that contains the URL of the server
    * @param description A String that describes the server
    * @param variables A map between a variable name and its value. The value is used for substitution in the server's URL template.
    */
void PFXStoreApi::setNewServer(const QString &operation, const QUrl &url, const QString &description, const QMap<QString, PFXServerVariable> &variables) {
    setServerIndex(operation, addServerConfiguration(operation, url, description, variables));
}

void PFXStoreApi::addHeaders(const QString &key, const QString &value) {
    _defaultHeaders.insert(key, value);
}

void PFXStoreApi::enableRequestCompression() {
    _isRequestCompressionEnabled = true;
}

void PFXStoreApi::enableResponseCompression() {
    _isResponseCompressionEnabled = true;
}

void PFXStoreApi::abortRequests() {
    emit abortRequestsSignal();
}

QString PFXStoreApi::getParamStylePrefix(const QString &style) {
    if (style == "matrix") {
        return ";";
    } else if (style == "label") {
        return ".";
    } else if (style == "form") {
        return "&";
    } else if (style == "simple") {
        return "";
    } else if (style == "spaceDelimited") {
        return "&";
    } else if (style == "pipeDelimited") {
        return "&";
    } else {
        return "none";
    }
}

QString PFXStoreApi::getParamStyleSuffix(const QString &style) {
    if (style == "matrix") {
        return "=";
    } else if (style == "label") {
        return "";
    } else if (style == "form") {
        return "=";
    } else if (style == "simple") {
        return "";
    } else if (style == "spaceDelimited") {
        return "=";
    } else if (style == "pipeDelimited") {
        return "=";
    } else {
        return "none";
    }
}

QString PFXStoreApi::getParamStyleDelimiter(const QString &style, const QString &name, bool isExplode) {

    if (style == "matrix") {
        return (isExplode) ? ";" + name + "=" : ",";

    } else if (style == "label") {
        return (isExplode) ? "." : ",";

    } else if (style == "form") {
        return (isExplode) ? "&" + name + "=" : ",";

    } else if (style == "simple") {
        return ",";
    } else if (style == "spaceDelimited") {
        return (isExplode) ? "&" + name + "=" : " ";

    } else if (style == "pipeDelimited") {
        return (isExplode) ? "&" + name + "=" : "|";

    } else if (style == "deepObject") {
        return (isExplode) ? "&" : "none";

    } else {
        return "none";
    }
}

void PFXStoreApi::deleteOrder(const QString &order_id) {
    QString fullPath = QString(_serverConfigs["deleteOrder"][_serverIndices.value("deleteOrder")].URL()+"/store/order/{orderId}");
    
    
    {
        QString order_idPathParam("{");
        order_idPathParam.append("orderId").append("}");
        QString pathPrefix, pathSuffix, pathDelimiter;
        QString pathStyle = "";
        if (pathStyle == "")
            pathStyle = "simple";
        pathPrefix = getParamStylePrefix(pathStyle);
        pathSuffix = getParamStyleSuffix(pathStyle);
        pathDelimiter = getParamStyleDelimiter(pathStyle, "orderId", false);
        QString paramString = (pathStyle == "matrix") ? pathPrefix+"orderId"+pathSuffix : pathPrefix;
        fullPath.replace(order_idPathParam, paramString+QUrl::toPercentEncoding(::test_namespace::toStringValue(order_id)));
    }
    PFXHttpRequestWorker *worker = new PFXHttpRequestWorker(this, _manager);
    worker->setTimeOut(_timeOut);
    worker->setWorkingDirectory(_workingDirectory);
    PFXHttpRequestInput input(fullPath, "DELETE");


#if QT_VERSION >= QT_VERSION_CHECK(5, 15, 0)
    for (auto keyValueIt = _defaultHeaders.keyValueBegin(); keyValueIt != _defaultHeaders.keyValueEnd(); keyValueIt++) {
        input.headers.insert(keyValueIt->first, keyValueIt->second);
    }
#else
    for (auto key : _defaultHeaders.keys()) {
        input.headers.insert(key, _defaultHeaders[key]);
    }
#endif

    connect(worker, &PFXHttpRequestWorker::on_execution_finished, this, &PFXStoreApi::deleteOrderCallback);
    connect(this, &PFXStoreApi::abortRequestsSignal, worker, &QObject::deleteLater);
    connect(worker, &QObject::destroyed, this, [this]() {
        if (findChildren<PFXHttpRequestWorker*>().count() == 0) {
            emit allPendingRequestsCompleted();
        }
    });

    worker->execute(&input);
}

void PFXStoreApi::deleteOrderCallback(PFXHttpRequestWorker *worker) {
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type != QNetworkReply::NoError) {
        error_str = QString("%1, %2").arg(worker->error_str, QString(worker->response));
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

void PFXStoreApi::getInventory() {
    QString fullPath = QString(_serverConfigs["getInventory"][_serverIndices.value("getInventory")].URL()+"/store/inventory");
    
    if (_apiKeys.contains("api_key")) {
        addHeaders("api_key",_apiKeys.find("api_key").value());
    }
    
    PFXHttpRequestWorker *worker = new PFXHttpRequestWorker(this, _manager);
    worker->setTimeOut(_timeOut);
    worker->setWorkingDirectory(_workingDirectory);
    PFXHttpRequestInput input(fullPath, "GET");


#if QT_VERSION >= QT_VERSION_CHECK(5, 15, 0)
    for (auto keyValueIt = _defaultHeaders.keyValueBegin(); keyValueIt != _defaultHeaders.keyValueEnd(); keyValueIt++) {
        input.headers.insert(keyValueIt->first, keyValueIt->second);
    }
#else
    for (auto key : _defaultHeaders.keys()) {
        input.headers.insert(key, _defaultHeaders[key]);
    }
#endif

    connect(worker, &PFXHttpRequestWorker::on_execution_finished, this, &PFXStoreApi::getInventoryCallback);
    connect(this, &PFXStoreApi::abortRequestsSignal, worker, &QObject::deleteLater);
    connect(worker, &QObject::destroyed, this, [this]() {
        if (findChildren<PFXHttpRequestWorker*>().count() == 0) {
            emit allPendingRequestsCompleted();
        }
    });

    worker->execute(&input);
}

void PFXStoreApi::getInventoryCallback(PFXHttpRequestWorker *worker) {
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type != QNetworkReply::NoError) {
        error_str = QString("%1, %2").arg(worker->error_str, QString(worker->response));
    }
    QMap<QString, qint32> output;
    QString json(worker->response);
    QByteArray array(json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject obj = doc.object();
    foreach (QString key, obj.keys()) {
        qint32 val;
        ::test_namespace::fromJsonValue(val, obj[key]);
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

void PFXStoreApi::getOrderById(const qint64 &order_id) {
    QString fullPath = QString(_serverConfigs["getOrderById"][_serverIndices.value("getOrderById")].URL()+"/store/order/{orderId}");
    
    
    {
        QString order_idPathParam("{");
        order_idPathParam.append("orderId").append("}");
        QString pathPrefix, pathSuffix, pathDelimiter;
        QString pathStyle = "";
        if (pathStyle == "")
            pathStyle = "simple";
        pathPrefix = getParamStylePrefix(pathStyle);
        pathSuffix = getParamStyleSuffix(pathStyle);
        pathDelimiter = getParamStyleDelimiter(pathStyle, "orderId", false);
        QString paramString = (pathStyle == "matrix") ? pathPrefix+"orderId"+pathSuffix : pathPrefix;
        fullPath.replace(order_idPathParam, paramString+QUrl::toPercentEncoding(::test_namespace::toStringValue(order_id)));
    }
    PFXHttpRequestWorker *worker = new PFXHttpRequestWorker(this, _manager);
    worker->setTimeOut(_timeOut);
    worker->setWorkingDirectory(_workingDirectory);
    PFXHttpRequestInput input(fullPath, "GET");


#if QT_VERSION >= QT_VERSION_CHECK(5, 15, 0)
    for (auto keyValueIt = _defaultHeaders.keyValueBegin(); keyValueIt != _defaultHeaders.keyValueEnd(); keyValueIt++) {
        input.headers.insert(keyValueIt->first, keyValueIt->second);
    }
#else
    for (auto key : _defaultHeaders.keys()) {
        input.headers.insert(key, _defaultHeaders[key]);
    }
#endif

    connect(worker, &PFXHttpRequestWorker::on_execution_finished, this, &PFXStoreApi::getOrderByIdCallback);
    connect(this, &PFXStoreApi::abortRequestsSignal, worker, &QObject::deleteLater);
    connect(worker, &QObject::destroyed, this, [this]() {
        if (findChildren<PFXHttpRequestWorker*>().count() == 0) {
            emit allPendingRequestsCompleted();
        }
    });

    worker->execute(&input);
}

void PFXStoreApi::getOrderByIdCallback(PFXHttpRequestWorker *worker) {
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type != QNetworkReply::NoError) {
        error_str = QString("%1, %2").arg(worker->error_str, QString(worker->response));
    }
    PFXOrder output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit getOrderByIdSignal(output);
        emit getOrderByIdSignalFull(worker, output);
    } else {
        emit getOrderByIdSignalE(output, error_type, error_str);
        emit getOrderByIdSignalEFull(worker, error_type, error_str);
    }
}

void PFXStoreApi::placeOrder(const PFXOrder &body) {
    QString fullPath = QString(_serverConfigs["placeOrder"][_serverIndices.value("placeOrder")].URL()+"/store/order");
    
    PFXHttpRequestWorker *worker = new PFXHttpRequestWorker(this, _manager);
    worker->setTimeOut(_timeOut);
    worker->setWorkingDirectory(_workingDirectory);
    PFXHttpRequestInput input(fullPath, "POST");

    {

        QByteArray output = body.asJson().toUtf8();
        input.request_body.append(output);
    }
#if QT_VERSION >= QT_VERSION_CHECK(5, 15, 0)
    for (auto keyValueIt = _defaultHeaders.keyValueBegin(); keyValueIt != _defaultHeaders.keyValueEnd(); keyValueIt++) {
        input.headers.insert(keyValueIt->first, keyValueIt->second);
    }
#else
    for (auto key : _defaultHeaders.keys()) {
        input.headers.insert(key, _defaultHeaders[key]);
    }
#endif

    connect(worker, &PFXHttpRequestWorker::on_execution_finished, this, &PFXStoreApi::placeOrderCallback);
    connect(this, &PFXStoreApi::abortRequestsSignal, worker, &QObject::deleteLater);
    connect(worker, &QObject::destroyed, this, [this]() {
        if (findChildren<PFXHttpRequestWorker*>().count() == 0) {
            emit allPendingRequestsCompleted();
        }
    });

    worker->execute(&input);
}

void PFXStoreApi::placeOrderCallback(PFXHttpRequestWorker *worker) {
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type != QNetworkReply::NoError) {
        error_str = QString("%1, %2").arg(worker->error_str, QString(worker->response));
    }
    PFXOrder output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit placeOrderSignal(output);
        emit placeOrderSignalFull(worker, output);
    } else {
        emit placeOrderSignalE(output, error_type, error_str);
        emit placeOrderSignalEFull(worker, error_type, error_str);
    }
}

void PFXStoreApi::tokenAvailable(){
  
    oauthToken token; 
    switch (_OauthMethod) {
    case 1: //implicit flow
        token = _implicitFlow.getToken(_latestScope.join(" "));
        if(token.isValid()){
            _latestInput.headers.insert("Authorization", "Bearer " + token.getToken());
            _latestWorker->execute(&_latestInput);
        }else{
            _implicitFlow.removeToken(_latestScope.join(" "));
            qDebug() << "Could not retreive a valid token";
        }
        break;
    case 2: //authorization flow
        token = _authFlow.getToken(_latestScope.join(" "));
        if(token.isValid()){
            _latestInput.headers.insert("Authorization", "Bearer " + token.getToken());
            _latestWorker->execute(&_latestInput);
        }else{
            _authFlow.removeToken(_latestScope.join(" "));    
            qDebug() << "Could not retreive a valid token";
        }
        break;
    case 3: //client credentials flow
        token = _credentialFlow.getToken(_latestScope.join(" "));
        if(token.isValid()){
            _latestInput.headers.insert("Authorization", "Bearer " + token.getToken());
            _latestWorker->execute(&_latestInput);
        }else{
            _credentialFlow.removeToken(_latestScope.join(" "));    
            qDebug() << "Could not retreive a valid token";
        }
        break;
    case 4: //resource owner password flow
        token = _passwordFlow.getToken(_latestScope.join(" "));
        if(token.isValid()){
            _latestInput.headers.insert("Authorization", "Bearer " + token.getToken());
            _latestWorker->execute(&_latestInput);
        }else{
            _credentialFlow.removeToken(_latestScope.join(" "));    
            qDebug() << "Could not retreive a valid token";
        }
        break;
    default:
        qDebug() << "No Oauth method set!";
        break;
    }
}
} // namespace test_namespace
