package com.faikturan.annualleavemanagement.dto;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class LeaveDTO {

    private Long leaveId;

    private EmployeeDTO employeeDTO;

    private LeaveTypeDTO leaveTypeDTO;

    private String leaveReason;

    private LocalDate fromDate;

    private LocalDate toDate;

    private String deniedReason;

    private String status;

    private LocalDateTime createdAt;

    private EmployeeDTO reviewedBy;

}
