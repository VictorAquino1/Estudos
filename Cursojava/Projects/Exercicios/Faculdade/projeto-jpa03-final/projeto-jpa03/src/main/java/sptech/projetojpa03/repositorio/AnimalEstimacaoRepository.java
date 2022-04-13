package sptech.projetojpa03.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import sptech.projetojpa03.entidade.AnimalEstimacao;

import java.util.List;

public interface AnimalEstimacaoRepository
                        extends JpaRepository<AnimalEstimacao, Long> {
       // @Query("select a from AnimalEstimacao a where a.nome =?1")
       // List<AnimalEstimacao> findByNome(String nome);
       // @Query("select a from AnimalEstimacao a where a.nome =?1 and a.castrado = ?2")
       // List<AnimalEstimacao> findByNomeAndCastrado(String nome, boolean castrado);
        
        List<AnimalEstimacao> findByNome(String nome);
        List<AnimalEstimacao> findByNomeAndCastrado(String nome, boolean castrado);
}
