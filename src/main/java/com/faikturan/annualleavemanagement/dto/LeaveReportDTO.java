package com.faikturan.annualleavemanagement.dto;

import lombok.Data;

@Data
public class LeaveReportDTO {

    private int count;

    private String leaveType;

    private int month;

    private String status;

}
