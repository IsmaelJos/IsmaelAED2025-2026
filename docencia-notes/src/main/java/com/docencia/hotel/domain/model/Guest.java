package com.docencia.hotel.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Guest")
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
}
