package joseph.service

import org.springframework.stereotype.Service
import joseph.util.RedisPool

/**
 * 逻辑实现
 *
 * Created by Joseph on 27/11/2017.
 */
@Service
class CacheService {

    fun getCache(request: Map<String, String>): String {
        return RedisPool.get(request.getOrDefault("key", "请传入参数"))
    }

    fun setCache(request: Map<String, String>): String {
        return RedisPool.set(request.getOrDefault("key", "请传入参数"), request.getOrDefault("value", "请传入参数"))
    }

}