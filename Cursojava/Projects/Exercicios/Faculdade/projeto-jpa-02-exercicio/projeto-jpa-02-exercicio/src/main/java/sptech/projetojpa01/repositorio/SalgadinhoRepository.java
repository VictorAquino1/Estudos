package sptech.projetojpa01.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import sptech.projetojpa01.entidade.Salgadinho;
import sptech.projetojpa01.resposta.SalgadinhoSimplesResposta;

import java.util.List;

public interface SalgadinhoRepository
            extends JpaRepository<Salgadinho, Integer> {
/*
A @Query aceita instruções na linguagem JPQL (Java Persistence Query Language)
A diferença é que nela devemos usar os nomes das Entidades e não tabelas
 */
   @Query("select new sptech.projetojpa01.resposta.SalgadinhoSimplesResposta(s.codigo, s.nome) from Salgadinho s")
   List<SalgadinhoSimplesResposta> listaSimples();

   List<Salgadinho> findByApimentadoTrue();
   List<Salgadinho> findByApimentadoFalse();
   List<Salgadinho> findByNivelSalLessThan(int num);
   List<Salgadinho> findByCarosGreaterThan(int num);

   //List<Salgadinho> findByApimentado();

}
