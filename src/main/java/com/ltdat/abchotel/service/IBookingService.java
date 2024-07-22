package com.ltdat.abchotel.service;

import com.ltdat.abchotel.model.BookedRoom;

import java.util.List;

public interface IBookingService {
    List<BookedRoom> getAllBookingsByRoomId(Long id);
}
