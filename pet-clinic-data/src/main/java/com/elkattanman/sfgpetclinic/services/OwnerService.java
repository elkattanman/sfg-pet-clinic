package com.elkattanman.sfgpetclinic.services;

import com.elkattanman.sfgpetclinic.model.Owner;
import sun.rmi.runtime.Log;

import java.util.Set;

public interface OwnerService extends CrudService<Owner , Long> {
    Owner findByLastName(String lastName);
}
