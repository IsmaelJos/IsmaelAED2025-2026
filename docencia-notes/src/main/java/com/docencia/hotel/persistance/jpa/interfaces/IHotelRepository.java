package com.docencia.hotel.persistance.jpa.interfaces;

import java.util.Set;

import com.docencia.hotel.model.Hotel;


public interface IHotelRepository {

    /**
     * Indica si existe una hotel con el id dado.
     *
     * @param id identificador unico de la hotel
     * @return true si existe una hotel con ese id, false en caso contrario
     */
    boolean exists(String id);

    /**
     * Busca una hotel por su id.
     *
     * @param id identificador unico de la hotel
     * @return la hotel encontrada, o null si no existe
     */
    Hotel findById(String id);

    /**
     * Busca una hotel que coincida con los campos relevantes del ejemplo dado.
     * La estrategia concreta depende de la implementacion (por ejemplo,
     * comparar por titulo o contenido).
     *
     * @param example objeto Hotel usado como ejemplo de busqueda
     * @return una hotel que cumpla con el criterio, o null si no hay coincidencia
     */
    Hotel find(Hotel example);

    /**
     * Devuelve todas las hotels almacenadas.
     *
     * @return lista con todas las hotels
     */
    Set<Hotel> findAll();

    /**
     * Inserta o actualiza una hotel.
     * - Si la hotel no tiene id, la implementacion debe generarlo.
     * - Si la hotel ya existe, se actualiza.
     *
     * @param hotel entidad Hotel a guardar
     * @return la hotel guardada, incluida la informacion final (por ejemplo el id asignado)
     */
    Hotel save(Hotel hotel);

    /**
     * Elimina la hotel con el id indicado.
     *
     * @param id identificador unico de la hotel
     * @return true si se borro una hotel, false si no existia
     */
    boolean delete(String id);
}
