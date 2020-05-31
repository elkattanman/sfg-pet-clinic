package com.elkattanman.sfgpetclinic.bootstrap;

import com.elkattanman.sfgpetclinic.model.Owner;
import com.elkattanman.sfgpetclinic.model.Vet;
import com.elkattanman.sfgpetclinic.services.OwnerService;
import com.elkattanman.sfgpetclinic.services.VetService;
import com.elkattanman.sfgpetclinic.services.map.OwnerServiceMap;
import com.elkattanman.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1=new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Mustafa");
        owner1.setLastName("Khaled");

        ownerService.save(owner1);

        Owner owner2=new Owner();
        owner2.setId(1L);
        owner2.setFirstName("Shimaa");
        owner2.setLastName("Khallaf");

        ownerService.save(owner2);

        System.out.println("Loading Owners... ");

        Vet vet1 = new Vet();
        vet1.setId(1l);
        vet1.setFirstName("sam");
        vet1.setFirstName("Axe");

        vetService.save(vet1);

        Vet vet2=new Vet();
        vet2.setId(2l);
        vet2.setFirstName("Jon");
        vet2.setFirstName("micheal");

        vetService.save(vet2);

        System.out.println("Loading Vets...");




    }
}
