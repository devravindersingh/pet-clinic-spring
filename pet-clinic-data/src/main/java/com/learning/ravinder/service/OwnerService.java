package com.learning.ravinder.service;

import com.learning.ravinder.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
