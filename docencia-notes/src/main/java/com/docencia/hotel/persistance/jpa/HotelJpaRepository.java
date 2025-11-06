package com.docencia.hotel.persistance.jpa;

import java.util.List;
import java.util.UUID;

import org.springframework.transaction.annotation.Transactional;

import com.docencia.hotel.domain.repository.IHotelJpaRepository;
import com.docencia.hotel.model.Hotel;
import com.docencia.hotel.persistance.jpa.interfaces.IHotelRepository;

public class HotelJpaRepository implements IHotelRepository{

    private final IHotelJpaRepository repository;

    public HotelJpaRepository(IHotelJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public boolean exists(String id) {
        return repository.existsById(id);
    }

    @Override
    public Hotel findById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Hotel find(Hotel hotel) {
        return repository.findFirstByTitle(hotel.getNombre()).orElse(null);
    }

    @Override
    public List<Hotel> findAll() {
        return repository.findAll();
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
    public boolean delete(String id) {
        if (!repository.existsById(id)) {
            return false;
        }
        repository.deleteById(id);
        return true;
    }
}
