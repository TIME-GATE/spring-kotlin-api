### kotlin服务器初体验

  kotlin突然火了起来，大致看下语言特性并体验了下，于是写了这个服务器API DEMO，并与Java/Scala做一些对比

### 运行测试
```text
git clone https://github.com/TIME-GATE/spring-kotlin-api.git
cd spring-kotlin-api
gradle bootRun
curl 127.0.0.1:8080/v1/api/getHelloWorld
```

### 对比Java、Scala

### 优势

* 顶级IDE厂商Jetbrains及Google的大力支持，社区和生态会越来越好 
* 更具现代特性，函数式编程，开发速度快，比Java简洁，又100%兼容Java，没有Scala的浓重的学院派风格，注重工程实践
* 更安全，虽然没有Scala的强大的安全类型系统，比较脚本语言显然提升了一个数量级

### 劣势

* 与java一样使用JVM，编译慢
* 没有命名空间，但应该可以像Js一样通过闭包特性实现命名空间、属性私有等
* 并没有本质上的创新，更像是java的语法糖，未来发展可能会依赖或跟风java

### 参考

* http://www.kotlindoc.cn/GettingStarted/Idioms.html
* http://projects.spring.io/spring-boot/