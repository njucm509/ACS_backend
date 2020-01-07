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
    @Column(name = "auth_upload")
    private String authUpload;
    @Column(name = "auth_download")
    private String authDownload;
    @Column(name = "auth_add")
    private String authAdd;
    @Column(name = "auth_delete")
    private String authDelete;
    @Column(name = "auth_update")
    private String authUpdate;
    @Column(name = "auth_select_self")
    private String authSelectSelf;
    @Column(name = "auth_select_department")
    private String authSelectDepartment;
    @Column(name = "auth_select_company")
    private String authSelectCompany;
    @Column(name = "auth_select_district")
    private String authSelectDistrict;
    @Column(name = "auth_select_city")
    private String authSelectCity;
    @Column(name = "auth_select_province")
    private String authSelectProvince;
    @Column(name = "auth_select_country")
    private String authSelectCountry;
    @Column(name = "audit_authority")
    private String auditAuthority;
    @Column(name = "attribute_permission")
    private String attributePermission;
}
