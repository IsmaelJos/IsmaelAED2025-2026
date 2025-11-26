package com.docencia.rest.repository.interfaces;

import java.util.Optional;

import com.docencia.rest.modelo.DetalleProducto;

public interface ProductoRelationalRepository {
    Optional<DetalleProducto> findByProductoId(int productoId);
    DetalleProducto save(int productoId, DetalleProducto detalle);
    boolean deleteById(int productoId);
}