package edu.njucm._509.pojo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.persistence.*;

@ApiModel
@Data
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private String roleId;
    @Column(name = "role_name")
    private String roleName;
}
