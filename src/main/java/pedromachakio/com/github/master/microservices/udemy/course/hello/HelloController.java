package pedromachakio.com.github.master.microservices.udemy.course.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    private String sayHello() {
        return "Hello";
    }

    @GetMapping(value = "/hello-bean")
    private HelloBean sayHelloBean() {
        return new HelloBean("Hello world, but through a bean");
    }

    @GetMapping(value = "/hello/path-variable/{username}")
    private HelloBean sayHelloUsername(@PathVariable String username) {
        return new HelloBean(String.format("Hello, %s", username));
    }
}
