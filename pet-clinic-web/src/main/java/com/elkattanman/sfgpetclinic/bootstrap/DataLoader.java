package com.elkattanman.sfgpetclinic.bootstrap;

import com.elkattanman.sfgpetclinic.model.Owner;
import com.elkattanman.sfgpetclinic.model.Pet;
import com.elkattanman.sfgpetclinic.model.PetType;
import com.elkattanman.sfgpetclinic.model.Vet;
import com.elkattanman.sfgpetclinic.services.OwnerService;
import com.elkattanman.sfgpetclinic.services.PetTypeService;
import com.elkattanman.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;


    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1=new Owner();
        owner1.setFirstName("Mustafa");
        owner1.setLastName("Khaled");
        owner1.setAddress("123 Ashmoon");
        owner1.setCity("Miami");
        owner1.setTelephone("0123456789");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2=new Owner();
        owner2.setFirstName("Shimaa");
        owner2.setLastName("Khallaf");
        owner2.setAddress("123 menuf");
        owner2.setCity("Miami");
        owner2.setTelephone("0121212321");

        Pet fionasCat = new Pet();
        fionasCat.setName("Just Cat");
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setPetType(savedCatPetType);
        owner2.getPets().add(fionasCat);


        ownerService.save(owner2);

        System.out.println("Loading Owners... ");

        Vet vet1 = new Vet();
        vet1.setFirstName("sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2=new Vet();
        vet2.setFirstName("Jon");
        vet2.setLastName("micheal");

        vetService.save(vet2);
        System.out.println("Loading Vets...");




    }
}
