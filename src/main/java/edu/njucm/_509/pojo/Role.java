package edu.njucm._509.pojo;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String role_id;
    private String role_name;
    private String auth_upload;
    private String auth_download;
    private String auth_add;
    private String auth_delete;
    private String auth_update;
    private String auth_select_self;
    private String auth_select_department;
    private String auth_select_company;
    private String auth_select_district;
    private String auth_select_city;
    private String auth_select_province;
    private String auth_select_country;
    private String audit_authority;
    private String attribute_permission;
}
