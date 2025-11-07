package com.docencia.hotel.persistance.jpa.interfaces;

import java.util.Set;

import com.docencia.hotel.model.Guest;


public interface IGuestRepository {

    boolean existsById(String id);

    Guest findById(String id);

    Set<Guest> findAll();

    Guest save(Guest guest);

    boolean deleteById(String id);
}