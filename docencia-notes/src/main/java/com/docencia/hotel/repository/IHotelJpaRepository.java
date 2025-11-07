package com.docencia.hotel.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.docencia.hotel.domain.model.Hotel;

public interface IHotelJpaRepository extends JpaRepository<Hotel, String>{
    Optional<Hotel> findFirstByName(String name);

}
