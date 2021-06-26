package com.faikturan.annualleavemanagement.repository;

import com.faikturan.annualleavemanagement.dto.LeaveReportDTO;
import com.faikturan.annualleavemanagement.entity.Leave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface LeaveRepository extends JpaRepository<Leave, Long> {

    List<Leave> findLeaveByDate(LocalDate date1, LocalDate date2);

    @Query(nativeQuery = true)
    List<LeaveReportDTO> generateLeaveReport();
}
