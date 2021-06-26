package com.faikturan.annualleavemanagement.service;


import com.faikturan.annualleavemanagement.dto.LeaveReportDTO;

import java.util.List;

public interface ReportService {

    List<LeaveReportDTO> retrieveLeaveReports();
}
