package com.docencia.hotel.model;


import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "room")
public class Room {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "number")
    private int numHabitacion;

    @Column(name = "type")
    private String tipoHabitacion;

    @Column(name = "price_per_night")
    private float precioNoche;

    @ManyToOne
    @JoinColumn(name="hotel_id",nullable=false)
    private String hotelId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(int numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public Float getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(Float precioNoche) {
        this.precioNoche = precioNoche;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }


    public Room() {
    }

    public Room(String id, int numHabitacion, String tipoHabitacion, Float precioNoche, String hotelId,
            Set<Booking> bookings) {
        this.id = id;
        this.numHabitacion = numHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.precioNoche = precioNoche;
        this.hotelId = hotelId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Room other = (Room) obj;
        return Objects.equals(id, other.id);
    }

    
}
