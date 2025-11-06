package com.docencia.hotel.persistance.jpa;

public abstract class AbstractJpaRepository<T,ID>{
    /*
    private T repository;

     
    public boolean exists(String id) {
        return repository.existsById(id);
    }

    public Object findById(String id) {
        return repository.findById(id).orElse(null);
    }

    public Object find(Object example) {
        return repository.findFirstByTitle(example.getTitle()).orElse(null);
    }

    public List<Object> findAll() {
        return repository.findAll();
    }

    @Transactional
    public Object save(Object objeto) {
        if (objeto.getId() == null || objeto.getId().isBlank()) {
            objeto.setId(UUID.randomUUID().toString());
        }
        return repository.save(objeto);
    }

    @Transactional
    public boolean delete(String id) {
        if (!repository.existsById(id)) {
            return false;
        }
        repository.deleteById(id);
        return true;
    }
    */
}