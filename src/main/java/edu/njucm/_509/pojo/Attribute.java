package edu.njucm._509.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "attribute")
public class Attribute {
    @Column(name = "attribute_id")
    private String attributeId;
    @Column(name = "attribute_name")
    private String attributeName;
}
