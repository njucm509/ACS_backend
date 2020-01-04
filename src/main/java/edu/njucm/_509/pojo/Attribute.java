package edu.njucm._509.pojo;

import lombok.Data;

import javax.persistence.Table;

@Data
@Table(name = "attribute")
public class Attribute {
    private String attributeId;
    private String attrbuteName;
}
