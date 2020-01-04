package edu.njucm._509.pojo;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "dataset")
public class DataSet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String sex;
    private Date birthday;
    private String hospital;
    private String department;
    private String attending_doctor;
    private String medical_insurance;
    private Date data_of_consultation;
    private String visiting_status;
    private String complaints;
    private String seriousness;
    private String medical_history;
    private String treatment_effect;
    private String speciality_check_up;
    private String drug_use;
    private Date release_time;

}
