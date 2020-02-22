package edu.njucm._509.pojo;

import io.swagger.annotations.ApiModel;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;


@Data
@ApiModel
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private String userId;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "user_password")
    private String userPassword;
    @Column(name = "user_ip")
    private String userIP;
    @Column(name = "user_department")
    private String userDepartment;
    @Column(name = "user_company")
    private String userCompany;
    @Column(name = "user_status")
    private String userStatus;
}
