package com.faikturan.annualleavemanagement.service;

import com.faikturan.annualleavemanagement.dto.EventDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.access.prepost.PreAuthorize;

import java.util.List;

@PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_USER')")
public interface EventService {

    Page<EventDTO> getAllEvents(Pageable pageable);

    EventDTO getEventsById(Long id);

    EventDTO createEvent(EventDTO eventDTO);

    EventDTO updateEvent(EventDTO eventDTO);

    List<EventDTO> retrieveLeaveAndEventsByDate(String dateFrom, String dateTo);
}
