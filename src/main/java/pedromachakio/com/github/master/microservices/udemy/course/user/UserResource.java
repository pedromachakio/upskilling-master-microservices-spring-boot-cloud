package pedromachakio.com.github.master.microservices.udemy.course.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
public class UserResource {

    @Autowired
    UserDaoService userService;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.findall();
    }

    @GetMapping("/users/{id}")
    public User getSpecificUser(@PathVariable int id) {
        if (Objects.nonNull(userService.findSpecificUser(id))){
            return userService.findSpecificUser(id);
        }
        return null;
    }
}
