/*
 * ApiException.h
 * 
 * This is the exception being thrown in case the api call was not successful
 */

#ifndef ApiException_H_
#define ApiException_H_



#include <memory> 
#include <map>

#include <cpprest/details/basic_types.h>
#include <cpprest/http_msg.h>


namespace io {
namespace swagger {
namespace client {
namespace api {

class  ApiException
    : public web::http::http_exception
{
public:
    ApiException( int errorCode
        , const utility::string_t& message
        , std::shared_ptr<std::istream> content = nullptr );
    ApiException( int errorCode
        , const utility::string_t& message
        , std::map<utility::string_t, utility::string_t>& headers
        , std::shared_ptr<std::istream> content = nullptr );
    virtual ~ApiException();
    
    std::map<utility::string_t, utility::string_t>& getHeaders();
    std::shared_ptr<std::istream> getContent() const;
        
protected:
    std::shared_ptr<std::istream> m_Content;    
    std::map<utility::string_t, utility::string_t> m_Headers;
};

}
}
}
}

#endif /* ApiBase_H_ */