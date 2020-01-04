package edu.njucm._509.pojo;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Table(name = "dataset")
public class DataSet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "sex")
    private String sex;
    @Column(name = "birthday")
    private Date birthday;
    @Column(name = "hospital")
    private String hospital;
    @Column(name = "department")
    private String department;
    @Column(name = "attending_doctor")
    private String attendingDoctor;
    @Column(name = "medical_insurance")
    private String medicalInsurance;
    @Column(name = "data_of_consultation")
    private Date dataOfConsultation;
    @Column(name = "visiting_status")
    private String visitingStatus;
    @Column(name = "complaints")
    private String complaints;
    @Column(name = "seriousness")
    private String seriousness;
    @Column(name = "medical_history")
    private String medicalHistory;
    @Column(name = "treatment_effect")
    private String treatmentEffect;
    @Column(name = "special_check_up")
    private String specialityCheckUp;
    @Column(name = "drug_user")
    private String drugUse;
    @Column(name = "release_time")
    private Date releaseTime;

}
