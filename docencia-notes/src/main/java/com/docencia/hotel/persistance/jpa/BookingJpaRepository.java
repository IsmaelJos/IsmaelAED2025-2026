package com.docencia.hotel.persistance.jpa;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.docencia.hotel.domain.model.Booking;
import com.docencia.hotel.domain.model.Guest;
import com.docencia.hotel.domain.model.Room;
import com.docencia.hotel.persistance.jpa.interfaces.IBookingRepository;
import com.docencia.hotel.repository.IBookingJpaRepository;

@Repository
public class BookingJpaRepository implements IBookingRepository{

    private final IBookingJpaRepository repository;

    public BookingJpaRepository(IBookingJpaRepository repository){
        this.repository = repository;
    }

    @Override
    public boolean existsById(String id) {
        return repository.existsById(id);
    }

    @Override
    public Booking findById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Set<Booking> findAll() {
        return new HashSet<>(repository.findAll());
    }

    @Override
    public Booking save(Booking booking) {
        if (booking.getId() == null || booking.getId().isBlank()) {
            booking.setId(UUID.randomUUID().toString());
        }
        return repository.save(booking);
    }

    @Override
    public boolean deleteById(String id) {
        if (!repository.existsById(id)) {
            return false;
        }
        repository.deleteById(id);
        return true;
    }

    @Override
    public Set<Booking> findByRoomIdAndDateRange(String roomId, Date startDate, Date endDate) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByRoomIdAndDateRange'");
    }

    @Override
    public Guest buscarPorHabitacion(Room room) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorHabitacion'");
    }

    @Override
    public Guest buscarPorRango(Date fechaEntrada, Date fechaSalida) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorRango'");
    }
    
}