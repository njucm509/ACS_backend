package edu.njucm._509;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("edu.njucm._509")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
