package edu.njucm._509.service;

import edu.njucm._509.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : timo
 * @date :  2020/1/4 15:52
 */
@Slf4j
@Service
public class UserRoleService {
    @Autowired
    private UserMapper userMapper;
}
