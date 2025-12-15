package com.docencia.tareas.soap;

import java.util.List;

import com.docencia.tareas.model.Tarea;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

<<<<<<< HEAD
@WebService(targetNamespace = "http://ies.puerto.es/ws/tarea", name = "TareaPortType")
public interface ITareaSoapEndpoint {
    
    /**
     * Funcion que busca todas las tareas existentes
     * @return lista de tareas
     */
    @WebMethod(operationName = "listarAll")
    List<Tarea> listar();

    /**
     * Funcion que busca una tarea
     * @param tarea tarea a buscar 
     * @return tarea buscada
     */
    @WebMethod(operationName = "buscar")
    Tarea buscar(@WebParam(name = "identificador") Long id);

    /**
     * Funcion que agrega una tarea
     * @param titulo titulo de tarea a agregar
     * @param descripcion descripcion de tarea a agregar
     * @return tarea agragada
     */
    @WebMethod(operationName = "crear")
    Tarea crear(String titulo, String descripcion);

    /**
     * Funcion que actualiza una tarea
     * @param id id a tarea a actualizar
     * @param titulo titulo de tarea a actualizar
     * @param descripcion descripcion de tarea a actualizar
     * @param completada si la tarea a actualizar esta completada o no
     * @return tarea actualizada
     */
    @WebMethod(operationName = "actualizar")
    Tarea actualizar(Long id, String titulo, String descripcion, Boolean completada);

    /**
     * Funcion que borra una tarea por su id
     * @param id identificador de la tarea a borrar
     * @return true/false
     */
    @WebMethod(operationName = "eliminar")
=======
@WebService(
    targetNamespace = "http://tareas.ies.puerto.es/",
    name = "TareaPortType"
)
public interface ITareaSoapEndpoint {

    @WebMethod(operationName = "ListAll")
    List<Tarea> listar();

    @WebMethod 
    Tarea buscar( @WebParam(name = "id") Long id);

    @WebMethod
    Tarea crear(String titulo, String descripcion);

    @WebMethod
    Tarea actualizar(Long id, String titulo, String descripcion, Boolean completada);

    @WebMethod
>>>>>>> a2f869cb6a9fb532c7c471e4a91b93055d80e409
    boolean eliminar(Long id);
}
