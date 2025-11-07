package com.docencia.hotel.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.docencia.hotel.domain.model.Guest;

public interface IGuestJpaRepository extends JpaRepository<Guest, String>{
    Optional<Guest> findFirstByName(String name);
}
