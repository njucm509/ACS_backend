package edu.njucm._509.service;

import edu.njucm._509.mapper.AuthorityMapper;
import edu.njucm._509.pojo.Authority;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class AuthorityService {
    @Autowired
    private AuthorityMapper authorityMapper;

    public List<Authority> selectAuthorityAll(){
        List<Authority> authorities = authorityMapper.selectAll();
        return authorities;
    }

    public int addAuthority(Authority authority){
        return authorityMapper.insert(authority);
    }

    public int updateAuthority(Authority authority){
        return authorityMapper.updateByPrimaryKey(authority);
    }

    public int deleteAuthority(Authority authority){
        return authorityMapper.delete(authority);
    }
}
