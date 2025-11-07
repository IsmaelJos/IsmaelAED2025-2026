package com.docencia.hotel.model;

import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "guest")
public class Guest {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "full_name")
    private String nombre;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Guest() {
    }

    public Guest(String id, String nombre, String email, String phone, Set<Booking> bookings) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.phone = phone;
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
        Guest other = (Guest) obj;
        return Objects.equals(id, other.id);
    }

    
}
