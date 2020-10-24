package com.learning.ravinder.repository;

import com.learning.ravinder.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
