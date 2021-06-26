package com.faikturan.annualleavemanagement.mapper;


import com.faikturan.annualleavemanagement.dto.LeaveTypeDTO;
import com.faikturan.annualleavemanagement.entity.LeaveType;

public class LeaveTypeMapper {

    public static LeaveTypeDTO mapToDto(LeaveType leaveType) {
        LeaveTypeDTO leaveTypeDTO = new LeaveTypeDTO();
        leaveTypeDTO.setLeaveTypeId(leaveType.getLeaveTypeId());
        leaveTypeDTO.setTypeName(leaveType.getTypeName());
        leaveTypeDTO.setStatus(String.valueOf(leaveType.getStatus()));
        return leaveTypeDTO;
    }

    public static LeaveType mapToEntity(LeaveTypeDTO leaveTypeDTO) {
        LeaveType leaveType = new LeaveType();
        leaveType.setLeaveTypeId(leaveTypeDTO.getLeaveTypeId());
        leaveType.setTypeName(leaveTypeDTO.getTypeName());
        leaveType.setStatus(StatusMapper.mapLeaveTypeStatus(leaveTypeDTO.getStatus()));
        return leaveType;
    }
}
