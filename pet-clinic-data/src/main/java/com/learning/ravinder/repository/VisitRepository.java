package com.learning.ravinder.repository;

import com.learning.ravinder.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
