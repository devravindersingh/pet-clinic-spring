package com.learning.ravinder.repository;

import com.learning.ravinder.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
