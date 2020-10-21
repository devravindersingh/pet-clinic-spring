package com.learning.ravinder.service.map;

import com.learning.ravinder.model.Specialty;
import com.learning.ravinder.model.Vet;
import com.learning.ravinder.service.SpecialtyService;
import com.learning.ravinder.service.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {
    private final SpecialtyService specialtyService;

    public VetMapService(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Vet save(Vet object) {
        if(object.getSpecialties().size() > 0){
            object.getSpecialties().forEach(specialty -> {
                if(specialty.getId() == null){
                    Specialty savedSpecialty = specialtyService.save(specialty);
                    specialty.setId(savedSpecialty.getId());
                }
            });
        }
        return super.save(object);
    }

    @Override
    public void delete(Vet object) {
        super.deleteByObject(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
