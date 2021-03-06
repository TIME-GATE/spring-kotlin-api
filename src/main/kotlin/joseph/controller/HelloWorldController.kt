package joseph.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

import joseph.service.HelloWorldService
import joseph.util.Entity

/**
 * Api
 *
 * Created by Joseph on 08/11/2017.
 */
@RestController
class HelloWorldController {

    @Autowired
    val helloWorldService = HelloWorldService()

    @RequestMapping("/v1/api/getHelloWorld", method = arrayOf(RequestMethod.GET))
    fun getHelloWorld(@RequestParam request: Map<String, String>): Entity { 
        return Entity(helloWorldService.getHelloWorld(request))
    }

    @RequestMapping("/v1/api/postHelloWorld", method = arrayOf(RequestMethod.POST))
    fun postHelloWorld(@RequestParam request: Map<String, String>): Entity { 
        return Entity(helloWorldService.getHelloWorld(request))
    }

}
