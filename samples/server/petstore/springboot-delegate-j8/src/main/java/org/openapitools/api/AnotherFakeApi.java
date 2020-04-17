/**
<<<<<<< HEAD
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.0.0-SNAPSHOT).
=======
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1-SNAPSHOT).
>>>>>>> origin/master
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Client;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@Validated
@Api(value = "another-fake", description = "the another-fake API")
public interface AnotherFakeApi {

    default AnotherFakeApiDelegate getDelegate() {
        return new AnotherFakeApiDelegate() {};
    }

    /**
     * PATCH /another-fake/dummy : To test special tags
     * To test special tags and operation ID starting with number
     *
     * @param body client model (required)
     * @return successful operation (status code 200)
     */
    @ApiOperation(value = "To test special tags", nickname = "call123testSpecialTags", notes = "To test special tags and operation ID starting with number", response = Client.class, tags={ "$another-fake?", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Client.class) })
    @RequestMapping(value = "/another-fake/dummy",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    default ResponseEntity<Client> call123testSpecialTags(@ApiParam(value = "client model" ,required=true )  @Valid @RequestBody Client body) {
        return getDelegate().call123testSpecialTags(body);
    }

}
