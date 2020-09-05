package com.elkattanman.sfgpetclinic.repositories;

import com.elkattanman.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
