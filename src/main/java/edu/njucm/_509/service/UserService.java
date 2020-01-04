package edu.njucm._509.service;

import edu.njucm._509.mapper.UserMapper;
import edu.njucm._509.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Slf4j
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> selectUserAll() {
        List<User> list = userMapper.selectAll();
        log.info("user list: {}", list);
//        if (CollectionUtils.isEmpty(list)) {
            // 可以尝试自定义异常
//            throw new Exception("user list not found");
//        }
        return list;
    }
}
