package com.learning.ravinder.repository;

import com.learning.ravinder.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
