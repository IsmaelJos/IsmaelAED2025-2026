package com.docencia.rest.modelo;

import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Objects;


@Document(collection = "producto_detalle")
public class DetalleProductoDocument {
    @Id
    private int id;
    private int productoId;
    private String descripcionLarga;
    private Map<String, String> especificacionesTecnicas;
    private List<String> tags;


    public DetalleProductoDocument() {
    }

    public DetalleProductoDocument(int id, int productoId, String descripcionLarga, Map<String,String> especificacionesTecnicas, List<String> tags) {
        this.id = id;
        this.productoId = productoId;
        this.descripcionLarga = descripcionLarga;
        this.especificacionesTecnicas = especificacionesTecnicas;
        this.tags = tags;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductoId() {
        return this.productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    public String getDescripcionLarga() {
        return this.descripcionLarga;
    }

    public void setDescripcionLarga(String descripcionLarga) {
        this.descripcionLarga = descripcionLarga;
    }

    public Map<String,String> getEspecificacionesTecnicas() {
        return this.especificacionesTecnicas;
    }

    public void setEspecificacionesTecnicas(Map<String,String> especificacionesTecnicas) {
        this.especificacionesTecnicas = especificacionesTecnicas;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public DetalleProductoDocument id(int id) {
        setId(id);
        return this;
    }

    public DetalleProductoDocument productoId(int productoId) {
        setProductoId(productoId);
        return this;
    }

    public DetalleProductoDocument tags(List<String> tags) {
        setTags(tags);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof DetalleProductoDocument)) {
            return false;
        }
        DetalleProductoDocument detalleProductoDocument = (DetalleProductoDocument) o;
        return id == detalleProductoDocument.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}