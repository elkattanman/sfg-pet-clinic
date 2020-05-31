package com.elkattanman.sfgpetclinic.services;

import com.elkattanman.sfgpetclinic.model.Owner;



public interface OwnerService extends CrudService<Owner , Long> {
    Owner findByLastName(String lastName);
}
