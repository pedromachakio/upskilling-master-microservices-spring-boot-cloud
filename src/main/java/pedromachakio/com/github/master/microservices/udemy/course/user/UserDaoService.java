package pedromachakio.com.github.master.microservices.udemy.course.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Component
public class UserDaoService {

    //using a static list of users for now, before moving to JPA
    private static List<User> userList = new ArrayList<>();

    private static int usersCount = 5;

    static {
        userList.add(new User(1, "Gizmo", new Date()));
        userList.add(new User(2, "Zawekao", new Date()));
        userList.add(new User(3, "Evandro", new Date()));
        userList.add(new User(4, "Rundrigo", new Date()));
        userList.add(new User(5, "Mancerlo", new Date()));
    }

    public List<User> findall() {
        return userList;
    }

    public User save(User user) {
        if (Objects.isNull(user.getId())) {
            user.setId(++usersCount);
        }
        userList.add(user);
        return user;
    }

    public User findSpecificUser(int targetId) {
        for (User user : userList) {
            if (user.getId() == targetId) {
                return user;
            }
        }
        return null;
    }
}
