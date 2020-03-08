package edu.njucm._509.controller;

import edu.njucm._509.pojo.Attribute;
import edu.njucm._509.service.AttributeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@Api("基于属性管理api")
@RequestMapping("/api/attribute")
public class AttributeController {

    @Autowired
    AttributeService attributeService;

    @ApiOperation("获取属性列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<Attribute>> findAttributeList() {
        List<Attribute> attributes = null;
        try {
            attributes = attributeService.selectAttributeAll();
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        log.info("获取 attribute list ---{} ...", attributes);
        if (CollectionUtils.isEmpty(attributes)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(attributes);
    }

    @ApiOperation("添加属性信息")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<Integer> addAttribute(@RequestBody Attribute attribute) {
        Integer res = attributeService.addAttribute(attribute);
        if (res <= 0) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(res);
    }

    @ApiOperation("修改属性信息")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ResponseEntity<Integer> updateAttribute(@RequestBody Attribute attribute) {
        Integer res = attributeService.updateAttribute(attribute);
        if (res <= 0) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(res);
    }

    @ApiOperation("删除属性信息")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public ResponseEntity<Integer> deleteAttribute(@RequestBody Attribute attribute) {
        Integer res = attributeService.deleteAttribute(attribute);
        if (res <= 0) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(res);
    }

    @ApiOperation("属性分页")
    @RequestMapping(value = "/getPage", method = RequestMethod.POST)
    public ResponseEntity<List<Attribute>> getAttributePage(int page, int pageSize) {
        List<Attribute> attributes = null;
        try {
            attributes = attributeService.getAttributePage(page, pageSize);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        if (CollectionUtils.isEmpty(attributes)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(attributes);
    }
}
