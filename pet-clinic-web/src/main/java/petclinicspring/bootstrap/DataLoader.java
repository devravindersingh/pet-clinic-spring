package petclinicspring.bootstrap;

import com.learning.ravinder.model.Owner;
import com.learning.ravinder.model.Vet;
import com.learning.ravinder.service.OwnerService;
import com.learning.ravinder.service.VetService;
import com.learning.ravinder.service.map.OwnerServiceMap;
import com.learning.ravinder.service.map.VetMapService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        this.ownerService = new OwnerServiceMap();
        this.vetService = new VetMapService();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fieona");
        owner2.setLastName("Gliedman");

        ownerService.save(owner2);

        System.out.println("Owners Loaded ! -------------------");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Vets Loaded ! ------------------");
    }
}
