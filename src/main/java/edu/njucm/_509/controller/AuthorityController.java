package edu.njucm._509.controller;

import edu.njucm._509.mapper.AuthorityMapper;
import edu.njucm._509.pojo.Authority;
import edu.njucm._509.service.AuthorityService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Slf4j
@RestController
@Api("权限管理")
@RequestMapping("/api/authority")
public class AuthorityController {
    @Autowired
    private AuthorityService authorityService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public ResponseEntity<List<Authority>> findAuthorityList(){
        List<Authority> authorities = null;
        try {
            authorities = authorityService.selectAuthorityAll();
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        if (CollectionUtils.isEmpty(authorities)){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(authorities);
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ResponseEntity<Authority> addAuthority(@RequestBody Authority authority){
        Integer res = authorityService.addAuthority(authority);
        if (res<=0){
            return new ResponseEntity<>(HttpStatus.SERVICE_UNAVAILABLE);
        }
        return ResponseEntity.ok(authority);
    }
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public ResponseEntity<Authority> updateAuthority(@RequestBody Authority authority){
        Integer res = authorityService.addAuthority(authority);
        if (res<=0){
            return new ResponseEntity<>(HttpStatus.SERVICE_UNAVAILABLE);
        }
        return ResponseEntity.ok(authority);
    }
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public ResponseEntity<Authority> deleteAuthority(Authority authority){
        Integer res = authorityService.deleteAuthority(authority);
        if (res<=0){
            return new ResponseEntity<>(HttpStatus.SERVICE_UNAVAILABLE);
        }
        return ResponseEntity.ok(authority);
    }
}
