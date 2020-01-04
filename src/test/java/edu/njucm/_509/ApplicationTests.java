package edu.njucm._509;

import edu.njucm._509.pojo.User;
import edu.njucm._509.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ApplicationTests {
    @Autowired
    UserService userService;
    @Test
    void test(){
        List<User> users = userService.selectUserAll();
        for (User user:users){
            System.out.println(user.getUserId()+user.getUserName());
        }
    }

    @Test
    void contextLoads() {
    }

}
