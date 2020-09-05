package com.elkattanman.sfgpetclinic.repositories;

import com.elkattanman.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
