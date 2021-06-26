package com.faikturan.annualleavemanagement.entity;



import com.faikturan.annualleavemanagement.util.enums.LeaveTypeStatus;
import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity
@Table(name="leave_type")
public class LeaveType {

    @Id
    @Column(name = "leave_type_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long leaveTypeId;

    @Column(name = "type_name", unique = true, nullable = false)
    private String typeName;

    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.STRING)
    private LeaveTypeStatus status;

}
