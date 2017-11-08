package joseph.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import java.io.IOException

/**
 * Api
 *
 * Created by Joseph on 08/11/2017.
 */
@RestController
class HelloWorldController {
	
    @RequestMapping("/v1/api/getPersonas", method = arrayOf(RequestMethod.GET))
    open fun getPersonas(): String { return "Hello World" }

}
