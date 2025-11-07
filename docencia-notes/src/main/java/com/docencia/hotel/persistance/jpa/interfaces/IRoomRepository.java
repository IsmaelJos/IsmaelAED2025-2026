package com.docencia.hotel.persistance.jpa.interfaces;

import java.util.Set;

import com.docencia.hotel.domain.model.Room;


public interface IRoomRepository {
    
    boolean existsById(String id);

    Room findById(String id);

    Set<Room> findAll();

    Room save(Room room);

    boolean deleteById(String id);

    Set<Room> findByHotelId(String hotelId);
}