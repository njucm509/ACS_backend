package edu.njucm._509.controller;

import com.sun.org.apache.regexp.internal.RE;
import edu.njucm._509.pojo.Role;
import edu.njucm._509.service.RoleService;
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
@Api("权限角色管理相关api")
@RequestMapping("/api/role")
public class RoleController {
    @Autowired
    RoleService roleService;

    @ApiOperation("获取角色列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<Role>> findRoleList() {
        List<Role> roles = null;
        try {
            roles = roleService.selectRoleAll();
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        log.info("获取 role list ---{} ...", roles);
        if (CollectionUtils.isEmpty(roles)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(roles);
    }

    @ApiOperation("添加角色信息")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<Integer> addRole(Role role) {
        Integer res = roleService.addRole(role);
        if (res <= 0) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(res);
    }

    @ApiOperation("修改角色信息")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ResponseEntity<Integer> updateRole(Role role) {
        Integer res = roleService.updateRole(role);
        if (res <= 0) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(res);
    }

    @ApiOperation("删除角色信息")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public ResponseEntity<Integer> deleteRole(Role role) {
        Integer  res = roleService.deleteRole(role);
        if (res <= 0) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(res);
    }

    @ApiOperation("角色分页")
    @RequestMapping(value = "/getPage", method = RequestMethod.POST)
    public ResponseEntity<List<Role>> getRolePage(int page, int pageSize) {
        List<Role> roles = null;
        try {
            roles = roleService.getRolePage(page, pageSize);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        if (CollectionUtils.isEmpty(roles)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(roles);
    }
}
