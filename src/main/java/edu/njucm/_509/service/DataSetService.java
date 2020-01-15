package edu.njucm._509.service;

import com.github.pagehelper.PageHelper;
import edu.njucm._509.mapper.DataSetMapper;
import edu.njucm._509.pojo.DataSet;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author : timo
 * @date :  2020/1/4 15:52
 */
@Slf4j
@Service
public class DataSetService {
    @Autowired
    private DataSetMapper dataSetMapper;

    public List<DataSet> selectDataSetAll(){
        List<DataSet> dataSets = dataSetMapper.selectAll();
        log.info("dataSet list:{}",dataSets);
        return dataSets;
    }

    public int addDataSet(DataSet dataSet){
        return dataSetMapper.insert(dataSet);
    }
    public int deleteDataSet(DataSet dataSet){
        return dataSetMapper.delete(dataSet);
    }
    public int updateDataSet(DataSet dataSet){
        return dataSetMapper.updateByPrimaryKey(dataSet);
    }

    public List<DataSet> getDataSetPage(int page,int pageSize){
        PageHelper.startPage(page,pageSize);
        return dataSetMapper.selectAll();
    }
}
