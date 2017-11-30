package joseph.util

/**
 * 定义Redis连接池
 *
 * Created by Joseph on 27/11/2017
 */
import redis.clients.jedis.Jedis
import redis.clients.jedis.JedisPool
import redis.clients.jedis.JedisPoolConfig

object RedisPool {

    val config = JedisPoolConfig()

    var HOST: String = "127.0.0.1"
    val PORT: Int = 6379
    val TIMEOUT: Int = 10000


    var jedisPool = JedisPool(config, HOST, PORT, TIMEOUT)
    var jedis = jedisPool.getResource()


    fun get(key: String): String {
        return jedis.get(key)
    }

    fun set(key: String, value: String) : String {
        return jedis.set(key, value)
    }


}