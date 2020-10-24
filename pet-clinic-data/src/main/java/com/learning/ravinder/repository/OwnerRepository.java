package com.learning.ravinder.repository;

import com.learning.ravinder.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
