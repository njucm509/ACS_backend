package edu.njucm._509.controller;

import edu.njucm._509.pojo.DataSet;
import edu.njucm._509.service.DataSetService;
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
@Api("数据集管理相关api")
@RequestMapping("/api/dataset")
public class DataSetController {

    @Autowired
    DataSetService dataSetService;

    @ApiOperation("获取数据项列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<DataSet>> findDataSetList() {
        List<DataSet> dataSets = null;
        try {
            dataSets = dataSetService.selectDataSetAll();
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        log.info("获取 dataSet list ---{} ...", dataSets);
        if (CollectionUtils.isEmpty(dataSets)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(dataSets);
    }

    @ApiOperation("添加数据项信息")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<Integer> addDataSet(DataSet dataSet) {
        Integer res = 0;
        res = dataSetService.addDataSet(dataSet);
        if (res <= 0) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(res);
    }

    @ApiOperation("修改数据项信息")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ResponseEntity<Integer> updateDataSet(DataSet dataSet) {
        Integer res = 0;
        res = dataSetService.updateDataSet(dataSet);
        if (res <= 0) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(res);
    }

    @ApiOperation("删除数据项信息")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public ResponseEntity<Integer> deleteDataSet(DataSet dataSet) {
        Integer res = 0;
        res = dataSetService.deleteDataSet(dataSet);
        if (res <= 0) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(res);
    }
}
