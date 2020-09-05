package com.elkattanman.sfgpetclinic.repositories;

import com.elkattanman.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
