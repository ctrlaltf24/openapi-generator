/*
 * Tag.h
 * 
 * 
 */

#ifndef Tag_H_
#define Tag_H_


#include "ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  Tag
	: public ModelBase
{
public:
    Tag();
    virtual ~Tag();

	/////////////////////////////////////////////
	/// ModelBase overrides
	
    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;
    
 	/////////////////////////////////////////////
	/// Tag members
	   
    /// <summary>
    /// 
    /// </summary>
    int64_t getId() const;
    void setId(int64_t value);
    bool idIsSet() const;
    void unsetId();
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getName() const;
    void setName(utility::string_t value);
    bool nameIsSet() const;
    void unsetName();
    
protected:
    int64_t m_Id;
    bool m_IdIsSet;
utility::string_t m_Name;
    bool m_NameIsSet;
};

}
}
}
}

#endif /* Tag_H_ */
