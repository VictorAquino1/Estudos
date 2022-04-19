package sptech.projetojpa01.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import sptech.projetojpa01.entidade.Salgadinho;

public interface SalgadinhoRepository
        extends JpaRepository<Salgadinho, Integer> {
}
