package edu.njucm._509;

import edu.njucm._509.pojo.User;
import edu.njucm._509.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

import java.util.List;

@Slf4j
@SpringBootApplication
@MapperScan("edu.njucm._509")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        log.info("Swagger-UI: http://127.0.0.1:8888/swagger-ui.html");
    }

}
