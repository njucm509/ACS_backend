package edu.njucm._509.service;

import com.github.pagehelper.PageHelper;
import edu.njucm._509.mapper.UserMapper;
import edu.njucm._509.mapper.UserRoleMapper;
import edu.njucm._509.pojo.User;
import edu.njucm._509.pojo.UserRole;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author : timo
 * @date :  2020/1/4 15:52
 */
@Slf4j
@Service
public class UserRoleService {
    @Autowired
    private UserRoleMapper userRoleMapper;

    public List<UserRole> selectUserRoleAll(){
        List<UserRole> userRoles = userRoleMapper.selectAll();
        log.info("userRoles list:{}",userRoles);
        return userRoles;
    }
    public int addUserRole(UserRole userRole){
        return userRoleMapper.insert(userRole);
    }
    public int deleteUserRole(UserRole userRole){
        return userRoleMapper.delete(userRole);
    }
    public int updateUserRole(UserRole userRole){
        return userRoleMapper.updateByPrimaryKey(userRole);
    }

//    f分页
    public List<UserRole> getUserRolePage(int page,int pageSize){
        PageHelper.startPage(page,pageSize);
        return userRoleMapper.selectAll();
    }
}
