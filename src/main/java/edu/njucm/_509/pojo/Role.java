package edu.njucm._509.pojo;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author : timo
 * @date :  2020/1/4 14:56
 */
@Data
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String roleId;
    private String roleName;
    private String authUpload;
    private String authDownload;
    private String authAdd;
    private String authDelete;
    private String authUpdate;
    private String authSelectSelf;
    private String authSelectDepartment;
    private String authSelectCompany;
    private String authSelectDistrict;
    private String authSelectCity;
    private String authSelectProvince;
    private String authSelectCountry;
    private String auditAuthority;
    private String attributePermission;
}
