package com.docencia.hotel.persistance.jpa.interfaces;

import java.util.List;

import com.docencia.hotel.model.Guest;


public interface IGuestRepository {

    /**
     * Indica si existe una nota con el id dado.
     *
     * @param id identificador unico de la nota
     * @return true si existe una nota con ese id, false en caso contrario
     */
    boolean exists(String id);

    /**
     * Busca una nota por su id.
     *
     * @param id identificador unico de la nota
     * @return la nota encontrada, o null si no existe
     */
    Guest findById(String id);

    /**
     * Busca una nota que coincida con los campos relevantes del ejemplo dado.
     * La estrategia concreta depende de la implementacion (por ejemplo,
     * comparar por titulo o contenido).
     *
     * @param example objeto Guest usado como ejemplo de busqueda
     * @return una nota que cumpla con el criterio, o null si no hay coincidencia
     */
    Guest find(Guest example);

    /**
     * Devuelve todas las notas almacenadas.
     *
     * @return lista con todas las notas
     */
    List<Guest> findAll();

    /**
     * Inserta o actualiza una nota.
     * - Si la nota no tiene id, la implementacion debe generarlo.
     * - Si la nota ya existe, se actualiza.
     *
     * @param guest entidad Guest a guardar
     * @return la nota guardada, incluida la informacion final (por ejemplo el id asignado)
     */
    Guest save(Guest guest);

    /**
     * Elimina la nota con el id indicado.
     *
     * @param id identificador unico de la nota
     * @return true si se borro una nota, false si no existia
     */
    boolean delete(String id);
}
