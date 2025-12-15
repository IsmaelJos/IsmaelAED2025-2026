package com.docencia.tareas.model;
import java.util.Objects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

<<<<<<< HEAD
/**
 * @author nexphernandez
 * @version 1.0.0
 */
=======
>>>>>>> a2f869cb6a9fb532c7c471e4a91b93055d80e409
@XmlRootElement(name = "tarea")
@XmlAccessorType(XmlAccessType.FIELD)
public class Tarea {

    private Long id;
    private String titulo;
    private String descripcion;
    private boolean completada;
<<<<<<< HEAD

    /**
     * Constructor vacio
=======
    
    /**
     * coment
>>>>>>> a2f869cb6a9fb532c7c471e4a91b93055d80e409
     */
    public Tarea() {
    }

    /**
<<<<<<< HEAD
     * Constructor con el identificadro de la clase
     * @param id identificador de la tarea
=======
     * coment
     * @param id
>>>>>>> a2f869cb6a9fb532c7c471e4a91b93055d80e409
     */
    public Tarea(Long id) {
        this.id = id;
    }

    /**
<<<<<<< HEAD
     * Constructor con los atributos de la clase
     * @param id identificador de la tarea
     * @param titulo titulo de la tarea
     * @param descripcion descripcion de la tarea
     * @param completada si la tarea esta completado o no
=======
     * coment
     * @param id
     * @param titulo
     * @param descripcion
     * @param completada
>>>>>>> a2f869cb6a9fb532c7c471e4a91b93055d80e409
     */
    public Tarea(Long id, String titulo, String descripcion, boolean completada) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.completada = completada;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isCompletada() {
        return this.completada;
    }

    public boolean getCompletada() {
        return this.completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Tarea)) {
            return false;
        }
        Tarea tarea = (Tarea) o;
<<<<<<< HEAD
        return Objects.equals(id, tarea.id) ;
=======
        return Objects.equals(id, tarea.id);
>>>>>>> a2f869cb6a9fb532c7c471e4a91b93055d80e409
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", titulo='" + getTitulo() + "'" +
            ", descripcion='" + getDescripcion() + "'" +
            ", completada='" + isCompletada() + "'" +
            "}";
    }
    
<<<<<<< HEAD
=======
    
>>>>>>> a2f869cb6a9fb532c7c471e4a91b93055d80e409
}
