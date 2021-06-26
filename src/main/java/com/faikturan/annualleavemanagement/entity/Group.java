package com.faikturan.annualleavemanagement.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity
@Table(name = "employee_group")
public class Group {

    @Id
    @Column(name = "groupId", unique = false, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "group_name")
    private String groupName;

}
