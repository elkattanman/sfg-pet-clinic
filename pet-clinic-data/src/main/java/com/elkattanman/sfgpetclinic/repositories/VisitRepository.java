package com.elkattanman.sfgpetclinic.repositories;

import com.elkattanman.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
