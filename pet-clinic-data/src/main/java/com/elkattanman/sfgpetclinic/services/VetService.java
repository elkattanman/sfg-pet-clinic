package com.elkattanman.sfgpetclinic.services;

import com.elkattanman.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findByid(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
