package edu.njucm._509.pojo;

import lombok.Data;

import javax.persistence.Table;

@Data
@Table(name = "user_name")
public class UserRole {
    private String userId;
    private String roleId;
}
