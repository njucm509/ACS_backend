package edu.njucm._509;

import edu.njucm._509.pojo.User;
import edu.njucm._509.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

import java.util.List;

@SpringBootApplication
@MapperScan("edu.njucm._509")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
