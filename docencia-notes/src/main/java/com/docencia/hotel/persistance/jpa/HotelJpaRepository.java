package com.docencia.hotel.persistance.jpa;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.docencia.hotel.domain.repository.IHotelJpaRepository;
import com.docencia.hotel.model.Hotel;
import com.docencia.hotel.persistance.jpa.interfaces.IHotelRepository;

@Repository
public class HotelJpaRepository implements IHotelRepository{

    private final IHotelJpaRepository repository;

    public HotelJpaRepository(IHotelJpaRepository repository){
        this.repository = repository;
    }

    @Override
    public boolean existsById(String id) {
        return repository.existsById(id);
    }

    @Override
    public Hotel findById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Set<Hotel> findAll() {
        return new HashSet<>(repository.findAll());
    }

    @Override
    @Transactional
    public Hotel save(Hotel hotel) {
        if (hotel.getId() == null || hotel.getId().isBlank()) {
            hotel.setId(UUID.randomUUID().toString());
        }
        return repository.save(hotel);
    }

    @Override
    @Transactional
    public boolean deleteById(String id) {
        if (!repository.existsById(id)) {
            return false;
        }
        repository.deleteById(id);
        return true;
    }



}