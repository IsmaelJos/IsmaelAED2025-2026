package com.docencia.rest.domain;

import java.math.BigDecimal;
import java.util.Objects;

public class Producto {

    // Parte relacional
    private int id;
    private String nombre;
    private BigDecimal precio;
    private int stock;

    // private Categoria categoria;

    // Parte NoSQL (documento)
    private DetalleProducto detalle;

    public Producto() {
    }
    
    public Producto(int id, String nombre, BigDecimal precio, int stock, DetalleProducto detalle) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.detalle = detalle;
    }

    public Producto(int id) {
        this.id = id;
    }
   
    // getters y setters...
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public BigDecimal getPrecio() {
        return precio;
    }
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public DetalleProducto getDetalle() {
        return detalle;
    }
    public void setDetalle(DetalleProducto detalle) {
        this.detalle = detalle;
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
        Producto other = (Producto) obj;
        return Objects.equals(id, other.id);
    }
    

    
}