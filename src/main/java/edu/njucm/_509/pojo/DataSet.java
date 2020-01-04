package edu.njucm._509.pojo;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author : timo
 * @date :  2020/1/4 14:55
 */
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
    private String attendingDoctor;
    private String medicalInsurance;
    private Date dataOfConsultation;
    private String visitingStatus;
    private String complaints;
    private String seriousness;
    private String medicalHistory;
    private String treatmentEffect;
    private String specialityCheckUp;
    private String drugUse;
    private Date releaseTime;

}
