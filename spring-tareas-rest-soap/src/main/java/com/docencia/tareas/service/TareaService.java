package com.docencia.tareas.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.docencia.tareas.model.Tarea;
<<<<<<< HEAD
import com.docencia.tareas.repository.ITareaRepository;

/**
 * @author nexphernandez
 * @version 1.0.0
 */
@Service
public class TareaService implements ITareaService {
    private ITareaRepository tareaRepository;
=======
import com.docencia.tareas.repositories.ITareaRepository;

@Service
public class TareaService implements ITareaService{

    ITareaRepository tareaRepository;
>>>>>>> a2f869cb6a9fb532c7c471e4a91b93055d80e409

    public TareaService(ITareaRepository tareaRepository) {
        this.tareaRepository = tareaRepository;
    }

    @Override
    public List<Tarea> listarTodas() {
        return tareaRepository.all();
    }

    @Override
    public Tarea buscarPorId(Long id) {
        if (id == null) {
            return null;
        }
<<<<<<< HEAD
        Tarea tarea = new Tarea(id);
        return tareaRepository.findBy(tarea);
=======
        Tarea tarea = new Tarea();
        return tareaRepository.findById(tarea);
>>>>>>> a2f869cb6a9fb532c7c471e4a91b93055d80e409
    }

    @Override
    public Tarea crearTarea(String titulo, String descripcion) {
        Long id = UUID.randomUUID().getLeastSignificantBits();
<<<<<<< HEAD
        Tarea tarea = new Tarea(id, titulo, descripcion, false);
=======
        Tarea tarea = new Tarea(id,titulo,descripcion,false);
>>>>>>> a2f869cb6a9fb532c7c471e4a91b93055d80e409
        return tareaRepository.add(tarea);
    }

    @Override
    public Tarea actualizarTarea(Long id, String titulo, String descripcion, Boolean completada) {
        if (id == null) {
            return null;
        }
        Tarea tarea = new Tarea(id, titulo, descripcion, completada);
        return tareaRepository.update(tarea);
    }

    @Override
    public boolean eliminarTarea(Long id) {
        if (id == null) {
            return false;
        }
        Tarea tarea = new Tarea(id);
        return tareaRepository.delete(tarea);
    }

<<<<<<< HEAD
=======
    

>>>>>>> a2f869cb6a9fb532c7c471e4a91b93055d80e409
}
