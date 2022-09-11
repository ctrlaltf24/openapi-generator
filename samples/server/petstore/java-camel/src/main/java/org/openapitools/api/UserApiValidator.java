/**
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.1.0).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.api;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
import org.apache.camel.LoggingLevel;

@Component
public class UserApiValidator extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        onException(Exception.class)
            .log(LoggingLevel.ERROR, "${exception.message}: ${exception.stacktrace}")
            .handled(true)
            .process("validationErrorProcessor");
        
        from("direct:validate-createUser")
            .id("validate-createUser")
            .to("bean-validator://validate-request")
            .to("direct:createUser");
        
        from("direct:validate-createUsersWithArrayInput")
            .id("validate-createUsersWithArrayInput")
            .to("bean-validator://validate-request")
            .to("direct:createUsersWithArrayInput");
        
        from("direct:validate-createUsersWithListInput")
            .id("validate-createUsersWithListInput")
            .to("bean-validator://validate-request")
            .to("direct:createUsersWithListInput");
        
        from("direct:validate-deleteUser")
            .id("validate-deleteUser")
            .to("direct:deleteUser");
        
        from("direct:validate-getUserByName")
            .id("validate-getUserByName")
            .to("direct:getUserByName")
            .to("bean-validator://validate-response");
        
        from("direct:validate-loginUser")
            .id("validate-loginUser")
            .to("direct:loginUser")
            .to("bean-validator://validate-response");
        
        from("direct:validate-logoutUser")
            .id("validate-logoutUser")
            .to("direct:logoutUser");
        
        from("direct:validate-updateUser")
            .id("validate-updateUser")
            .to("bean-validator://validate-request")
            .to("direct:updateUser");
        
    }
}
