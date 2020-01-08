package edu.njucm._509.controller;

import edu.njucm._509.pojo.UserRole;
import edu.njucm._509.service.UserRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@Api("角色赋权管理相关api")
@RequestMapping("/api/userRole")
public class UserRoleController {
    @Autowired
    UserRoleService userRoleService;

    @ApiOperation("获取赋权列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<UserRole>> findUserRoleList() {
        List<UserRole> userRoles = null;
        try {
            userRoles = userRoleService.selectUserRoleAll();
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        log.info("获取 userRole list ---{} ...", userRoles);
        if (CollectionUtils.isEmpty(userRoles)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(userRoles);
    }

    @ApiOperation("添加赋权信息")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<Integer> addUserRole(UserRole userRole) {
        Integer res = 0;
        res = userRoleService.addUserRole(userRole);
        if (res <= 0) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(res);
    }

    @ApiOperation("修改赋权信息")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ResponseEntity<Integer> updateUserRole(UserRole userRole) {
        Integer res = 0;
        res = userRoleService.updateUserRole(userRole);
        if (res <= 0) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(res);
    }

    @ApiOperation("删除赋权信息")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public ResponseEntity<Integer> deleteUserRole(UserRole userRole) {
        Integer res = 0;
        res = userRoleService.deleteUserRole(userRole);
        if (res <= 0) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(res);
    }
}
