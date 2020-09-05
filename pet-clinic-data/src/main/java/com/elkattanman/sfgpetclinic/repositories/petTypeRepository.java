package com.elkattanman.sfgpetclinic.repositories;

import com.elkattanman.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface petTypeRepository extends CrudRepository<PetType, Long> {
}
