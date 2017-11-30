package joseph.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

import joseph.service.CacheService
import joseph.util.Entity

/**
 * Api
 *
 * Created by Joseph on 08/11/2017.
 */
@RestController
class CacheController {

    @Autowired
    val cacheService = CacheService()

    @RequestMapping("/v1/api/getCache", method = arrayOf(RequestMethod.GET))
    fun getCache(@RequestParam request: Map<String, String>): Entity {
        return Entity(cacheService.getCache(request))
    }

    @RequestMapping("/v1/api/setCache", method = arrayOf(RequestMethod.POST))
    fun setCache(@RequestParam request: Map<String, String>): Entity {
        return Entity(cacheService.setCache(request))
    }

}
