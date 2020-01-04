package edu.njucm._509.pojo;

import lombok.Data;

import javax.persistence.Table;

/**
 * @author : timo
 * @date :  2020/1/4 14:56
 */
@Data
@Table(name = "attribute")
public class Attribute {
    private String attributeId;
    private String attrbuteName;
}
