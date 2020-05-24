package com.elkattanman.sfgpetclinic.services;

import com.elkattanman.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findByid(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
