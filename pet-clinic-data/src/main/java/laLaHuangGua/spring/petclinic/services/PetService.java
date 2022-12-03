package laLaHuangGua.spring.petclinic.services;

import java.util.Set;
import laLaHuangGua.spring.petclinic.model.Pet;

public interface PetService {
  Pet findById(Long id);
  Pet save(Pet pet);
  Set<Pet> findAll();

}
