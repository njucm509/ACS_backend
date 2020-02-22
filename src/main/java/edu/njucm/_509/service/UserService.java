package edu.njucm._509.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.njucm._509.mapper.UserMapper;
import edu.njucm._509.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> selectUserAll() {
        List<User> list = userMapper.selectAll();
        log.info("user list: {}", list);
        return list;
    }
    public int addUser(User user){
        return userMapper.insert(user);
    }
    public int deleteUser(User user){
        return userMapper.delete(user);
    }
    public int updateUser(User user) { return userMapper.updateByPrimaryKey(user);}
    public User login(User user){
        return userMapper.selectOne(user);
    }

//    分页查询
    public List<User> getUserPage(int page,int pageSize){
        PageHelper.startPage(page,pageSize);
        return userMapper.selectAll();
    }

}
