package com.docencia.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.docencia.rest.modelo.ProductoEntity;
import com.docencia.rest.repository.interfaces.DetalleProductoRepository;
import com.docencia.rest.repository.interfaces.ProductoRepository;
import com.docencia.rest.service.interfaces.ProductoServiceInterface;

@Component
public class ProductoService implements ProductoServiceInterface{

    private ProductoRepository productoRepository;

    private DetalleProductoRepository detalleProductoRepository ;

    public void setDetalleProductoRepository(DetalleProductoRepository detalleProductoRepository) {
        this.detalleProductoRepository = detalleProductoRepository;
    }

    @Autowired
    public void setProductoRepository(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }
    
    @Override
    public Optional<ProductoEntity> find(ProductoEntity producto) {
        return findById(producto.getId());
    }

    @Override
    public Optional<ProductoEntity> findById(int id) {
        return productoRepository.findById(id);
    }

    @Override
    public List<ProductoEntity> findAll() {
        return productoRepository.findAll();
    }

    @Override
    public ProductoEntity save(ProductoEntity producto) {
        return productoRepository.save(producto);
    }

    @Override
    public boolean delete(ProductoEntity producto) {
        productoRepository.delete(producto);
        return true;
    }

    @Override
    public boolean deleteById(int id) {
        ProductoEntity productoDelete = new ProductoEntity(id);
        return delete(productoDelete);
    }



}
