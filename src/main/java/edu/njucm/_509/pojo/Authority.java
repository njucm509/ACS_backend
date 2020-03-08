package edu.njucm._509.pojo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.persistence.*;

@Table(name = "authority")
@Data
@ApiModel
public class Authority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;
    @Column(name = "content")
    private String content;
}
