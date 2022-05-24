package sptech.projetojpa04.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import sptech.projetojpa04.PetResponse;
import sptech.projetojpa04.Resposta.AnimalSimplesResposta;
import sptech.projetojpa04.entidade.AnimalEstimacao;

import java.util.List;

public interface AnimalEstimacaoRepository
                        extends JpaRepository<AnimalEstimacao, Long> {

    List<AnimalEstimacao> findByTipoCodigo(Integer codigo);
    List<AnimalEstimacao> findByTipoDescricaoContains(String descricao);

    /*
Aqui usamos um DYNAMIC FINDER
findBy -> indica uma consulta
Nome -> Qual campo estará no "where" da consulta
Mais detalhes e exemplos na Apostila que está no Moodle
     */
    List<AnimalEstimacao> findByNome(String nome);

    List<AnimalEstimacao> findByNomeAndCastrado(
                                String str, boolean bool);
    @Query(
    "select a from AnimalEstimacao a where a.nome = ?1 and a.castrado = ?2")
    List<AnimalEstimacao> pesquisaPorNomeCastrado(
                                    String nome, boolean castrado);

    @Query("select new sptech.projetojpa04.Resposta.AnimalSimplesResposta(a.codigo, a.nome, a.tipo.descricao) from AnimalEstimacao a where a.nome like ?1")
    List<AnimalSimplesResposta> consultaSimplesPorNome(String nome);

    @Query("select a from AnimalEstimacao a where a.nome = ?1")
    List<AnimalEstimacao> pesquisaPorNome(String nome);


}
