package sptech.projetojpa04.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import sptech.projetojpa04.entidade.TipoAnimal;

public interface TipoAnimalRepository extends JpaRepository<TipoAnimal, Integer> {
}