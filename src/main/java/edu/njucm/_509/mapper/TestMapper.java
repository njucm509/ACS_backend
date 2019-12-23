package edu.njucm._509.mapper;

import edu.njucm._509.pojo.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface TestMapper extends Mapper<User> {
}
