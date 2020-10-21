package com.learning.ravinder.bootstrap;

import com.learning.ravinder.model.Owner;
import com.learning.ravinder.model.Pet;
import com.learning.ravinder.model.PetType;
import com.learning.ravinder.model.Vet;
import com.learning.ravinder.service.OwnerService;
import com.learning.ravinder.service.PetTypeService;
import com.learning.ravinder.service.VetService;
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
        PetType savedDog = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCat = petTypeService.save(cat);


        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Brickerei");
        owner1.setCity("Miami");
        owner1.setTelephone("123123123124");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDog);
        mikesPet.setBirthday(LocalDate.now());
        mikesPet.setOwner(owner1);
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fieona");
        owner2.setLastName("Gliedman");
        owner2.setAddress("124 Brickerei");
        owner2.setCity("Miamis");
        owner2.setTelephone("123123123124");

        Pet fionasPet = new Pet();
        fionasPet.setPetType(savedCat);
        fionasPet.setBirthday(LocalDate.now());
        fionasPet.setOwner(owner2);
        fionasPet.setName("Just cat");
        owner2.getPets().add(fionasPet);

        ownerService.save(owner2);

        System.out.println("Owners Loaded ! -------------------");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Vets Loaded ! ------------------");
    }
}
