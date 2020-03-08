package edu.njucm._509.controller;

import edu.njucm._509.pojo.User;
import edu.njucm._509.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

@Slf4j
@RestController
@Api("用户信息管理相关Api")
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation("判断用户是否合法")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<User> userLogin(@RequestBody User user) {

        log.info("user: {}", user);
        User res = userService.login(user);
        log.info("res:{}",res);
//        log.info("res.getStatus:{}",res.getUserStatus());
        if (res == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else if ("停用".equals(res.getUserStatus())){
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }else{
            return ResponseEntity.ok(res);
        }
    }

    @ApiOperation("获取用户列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<User>> findUserList() {
        List<User> users = null;
        try {
            users = userService.selectUserAll();
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        log.info("获取 user list ---{} ...", users);
        if (CollectionUtils.isEmpty(users)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(users);
    }

    @ApiOperation("添加用户信息")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<User> addUser(@RequestBody User user) {
        //用当前时间的毫秒数作为id
        String id = Calendar.getInstance().getTimeInMillis()+"";
        user.setUserId(id);
        //状态默认是正常
        user.setUserStatus("正常");
        Integer res = userService.addUser(user);
        if (res <= 0) {
            return new ResponseEntity<>(HttpStatus.SERVICE_UNAVAILABLE);
        }
        return ResponseEntity.ok(user);
    }

    @ApiOperation("修改用户信息")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ResponseEntity<Integer> updateUser(@RequestBody User user) {
        log.info("updateUser:{}",user);
        Integer res = userService.updateUser(user);
        if (res <= 0) {
            //返回500
            return new ResponseEntity<>(HttpStatus.SERVICE_UNAVAILABLE);
        }
        return ResponseEntity.ok(res);
    }

    @ApiOperation("删除用户信息")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public ResponseEntity<User> deleteUser(@RequestBody User user) {
        log.info("deleteUser:{}",user);
        Integer res = userService.deleteUser(user);
        if (res <= 0) {
            return new ResponseEntity<>(HttpStatus.SERVICE_UNAVAILABLE);
        }
        return ResponseEntity.ok(user);
    }

    @ApiOperation("分页查询用户")
    @RequestMapping(value = "/getPage", method = RequestMethod.POST)
    public ResponseEntity<List<User>> getUserPage(@RequestParam(value = "page") int page, @RequestParam(value = "pageSize") int pageSize) {
        List<User> users = null;
        try {
            users = userService.getUserPage(page, pageSize);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        if (CollectionUtils.isEmpty(users)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(users);
    }
}
