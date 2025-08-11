package com.wipro.uber.service;

import com.wipro.uber.dto.BookingDTO;

public interface UberService {
    void processBooking(BookingDTO booking);
}
