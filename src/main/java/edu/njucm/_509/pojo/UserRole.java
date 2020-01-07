package edu.njucm._509.pojo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@ApiModel
@Data
@Table(name = "user_name")
public class UserRole {
    @Column(name = "user_id")
    private String userId;
    @Column(name = "role_id")
    private String roleId;
}
