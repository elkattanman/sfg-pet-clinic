package com.elkattanman.sfgpetclinic.services;

import com.elkattanman.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String lastName);

    Owner findByid(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
