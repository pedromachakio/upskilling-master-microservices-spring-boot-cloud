package pedromachakio.com.github.master.microservices.udemy.course;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    private String sayHello() {
        return "Hello";
    }
}
