package com.elkattanman.sfgpetclinic.services;

import com.elkattanman.sfgpetclinic.model.Owner;

import java.util.List;


public interface OwnerService extends CrudService<Owner , Long> {
    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);

}
