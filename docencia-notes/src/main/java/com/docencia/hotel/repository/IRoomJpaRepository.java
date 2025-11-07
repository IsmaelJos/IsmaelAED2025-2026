package com.docencia.hotel.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.docencia.hotel.domain.model.Room;

public interface IRoomJpaRepository extends JpaRepository<Room, String>{
    Optional<Room> findFirstBynNumHabitacion(int numHabitacion);
}
