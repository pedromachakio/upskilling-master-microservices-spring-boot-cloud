package pedromachakio.com.github.master.microservices.udemy.course.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        User specificUser = userService.findSpecificUser(id);
        if (Objects.nonNull(specificUser)) {
            return specificUser;
        }
        return null;
    }

    @PostMapping("/users")
    public void saveUser(@RequestBody User user) {
        User savedUser = userService.save(user);
    }
}
