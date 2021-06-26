package com.faikturan.annualleavemanagement.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EmployeeDTO {

    private Long employeeId;

    private String firstName;

    private String middleName;

    private String lastName;

    private String email;

    private String username;

    private String password;

    private String role;

    private String phoneNumber;

    private LocalDateTime createdAt;

    private String status;

    private EmployeeDTO supervisor;

}
