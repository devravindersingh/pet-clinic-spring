package com.learning.ravinder.service.map;

import com.learning.ravinder.model.Owner;
import com.learning.ravinder.service.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.deleteByObject(object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}
