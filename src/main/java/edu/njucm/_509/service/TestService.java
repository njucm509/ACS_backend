package edu.njucm._509.service;

import edu.njucm._509.mapper.TestMapper;
import edu.njucm._509.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class TestService {

    @Autowired
    private TestMapper testMapper;

    public List<User> test() {
        List<User> list = testMapper.selectAll();
        log.info("user list: {}", list);
        return list;
    }
}
