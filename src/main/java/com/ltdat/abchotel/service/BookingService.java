package com.ltdat.abchotel.service;

import com.ltdat.abchotel.model.BookedRoom;
import com.ltdat.abchotel.repository.BookingRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookingService implements IBookingService {
    private final BookingRepository bookingRepository;
    private final IBookingService roomService;


    @Override
    public List<BookedRoom> getAllBookingsByRoomId(Long id) {
        return bookingRepository.findByRoomId(id);
    }
}
