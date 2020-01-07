package edu.njucm._509.service;

import edu.njucm._509.mapper.RoleMapper;
import edu.njucm._509.pojo.Role;
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
public class RoleService {
    @Autowired
    private RoleMapper roleMapper;

    public List<Role> selectRoleAll(){
        List<Role> roles = roleMapper.selectAll();
        log.info("roles list:{}",roles);
        return roles;
    }
    public int addRole(Role role){
        return roleMapper.insert(role);
    }
    public int deleteRole(Role role){
        return roleMapper.delete(role);
    }
    public int updateRole(Role role){
        return roleMapper.updateByExample(role,new Example(role.getClass()));
    }
}
