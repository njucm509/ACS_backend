package edu.njucm._509.service;

import edu.njucm._509.mapper.AttributeMapper;
import edu.njucm._509.pojo.Attribute;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author : timo
 * @date :  2020/1/4 15:51
 */
@Slf4j
@Service
public class AttributeService {
    @Autowired
    private AttributeMapper attributeMapper;

    public List<Attribute> selectAttributeAll(){
        List<Attribute> attributes = attributeMapper.selectAll();
        log.info("attribute list:{}",attributes);
        return attributes;
    }
    public int addAttribute(Attribute attribute){
        return attributeMapper.insert(attribute);
    }
    public int deleteAttribute(Attribute attribute){
        return attributeMapper.delete(attribute);
    }
    public int updateAttribute(Attribute attribute){
        return attributeMapper.updateByExample(attribute,new Example(attribute.getClass()));
    }
}
