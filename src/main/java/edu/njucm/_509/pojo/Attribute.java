package edu.njucm._509.pojo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;


@ApiModel
@Data
@Table(name = "attribute")
public class Attribute {
    @Column(name = "attribute_id")
    private String attributeId;
    @Column(name = "attribute_name")
    private String attributeName;
}
