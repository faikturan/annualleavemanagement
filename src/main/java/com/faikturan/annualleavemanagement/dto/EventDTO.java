package com.faikturan.annualleavemanagement.dto;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class EventDTO {

    private long eventId;

    private String title;

    private LocalDate startDate;

    private LocalDate endDate;

    private String eventType;

    private LocalDateTime createdAt;

}
