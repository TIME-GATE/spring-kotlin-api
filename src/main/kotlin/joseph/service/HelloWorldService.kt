package joseph.service

import org.springframework.stereotype.Service;

/**
 * 逻辑实现
 *
 * Created by Joseph on 09/11/2017.
 */
@Service
class HelloWorldService {

    fun getHelloWorld(request: Map<String, String>): String {
        return request.getOrDefault("hi", "请传入参数")
    }
}