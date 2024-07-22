package com.ltdat.abchotel.repository;

import com.ltdat.abchotel.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Long> {
    @Query("select distinct  r.roomType from  Room r")
    List<String> findDistinctRoomTypes();
}
