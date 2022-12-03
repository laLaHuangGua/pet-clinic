package laLaHuangGua.spring.petclinic.services;

import java.util.Set;
import laLaHuangGua.spring.petclinic.model.Vet;

public interface VetService {
  Vet findById(Long id);
  Vet save(Vet vet);
  Set<Vet> findAll();

}
