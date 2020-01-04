package edu.njucm._509.mapper;

import edu.njucm._509.pojo.UserRole;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author : timo
 * @date :  2020/1/4 15:48
 */
@Repository
public interface UserRoleMapper extends Mapper<UserRole> {
}
