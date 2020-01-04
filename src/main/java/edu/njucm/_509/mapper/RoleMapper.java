package edu.njucm._509.mapper;

import edu.njucm._509.pojo.Role;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author : timo
 * @date :  2020/1/4 15:47
 */
@Repository
public interface RoleMapper extends Mapper<Role> {
}
