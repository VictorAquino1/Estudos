package sptech.projetojpa01.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sptech.projetojpa01.entidade.Salgadinho;
import sptech.projetojpa01.repositorio.SalgadinhoRepository;
import sptech.projetojpa01.resposta.SalgadinhoSimplesResposta;

import java.util.List;

@RestController
@RequestMapping("/salgadinhos")
public class SalgadinhoController {

    @Autowired
    private SalgadinhoRepository repository;

    @GetMapping("/apimentados")
    public ResponseEntity getApimentados(){
        List<Salgadinho> apimentados = repository.findByApimentadoTrue();
        if(apimentados.isEmpty()){
            return ResponseEntity.status(404).build();
        }
        return ResponseEntity.status(200).body(apimentados);
    }

    @GetMapping("/contagem-nao-apimentados")
    public ResponseEntity getNaoApimentados(){
        Long contagem = repository.countByApimentadoFalse();
        return ResponseEntity.status(200).body(contagem);
    }

    @GetMapping("/pouco-sal")
    public ResponseEntity getPoucoSal(){
        List<Salgadinho> poucoSal = repository.findByNivelSalLessThan(4);
        if(poucoSal.isEmpty()){
            return ResponseEntity.status(404).build();
        }
        return ResponseEntity.status(200).body(poucoSal);
    }

    @GetMapping("/caros")
    public ResponseEntity getCaro(){
        List<Salgadinho> caros = repository.findByPrecoGreaterThanEqual(20.00);
        if(caros.isEmpty()){
            return ResponseEntity.status(404).build();
        }
        return ResponseEntity.status(200).body(caros);
    }

    @GetMapping("/filtro-preco/{preco1}/{preco2}")
    public ResponseEntity getEntrePrecos(@PathVariable Double preco1, @PathVariable Double preco2){
        List<Salgadinho> precos = repository.findByPrecoBetween(preco1, preco2);
        if(precos.isEmpty()){
            return ResponseEntity.status(404).build();
        }
        return ResponseEntity.status(200).body(precos);
    }

    @GetMapping("/filtro-nome/{nome}")
    public ResponseEntity getLetras(@PathVariable String nome){
        List<Salgadinho> nomes = repository.findByNomeContains(nome);
        if(nomes.isEmpty()){
            return ResponseEntity.status(404).build();
        }
        return ResponseEntity.status(200).body(nomes);
    }

    @GetMapping("/relatorio-geral")
    public ResponseEntity getRelatorio() {
        String relatorio = "";

        List<Salgadinho> lista = repository.findAll();
        for(var salgado : lista) {
            relatorio += salgado.getCodigo()+";"+salgado.getNome()+";"+salgado.getNivelSal()+";"+
                    salgado.getPreco()+"\r\n";
        }

        return ResponseEntity
                .status(200)
                .header("content-type", "text/csv")
                .header("content-disposition", "filename=\"salgadinho.csv\"")
                .body(relatorio);
    }

    @GetMapping("/teste")
    public ResponseEntity getTeste(){
        List<Salgadinho> precos = repository.findByPrecoBetweenAndApimentadoOrderByPrecoDesc(0.0,20.0, false);
        return ResponseEntity.status(200).body(precos);
    }

    @PostMapping
    public ResponseEntity postSalgadinho(
            @RequestBody Salgadinho novoSalgadinho) {
        repository.save(novoSalgadinho);
        return ResponseEntity.status(201).build();
    }

    @GetMapping
    public ResponseEntity getSalgadinhos() {

        new SalgadinhoSimplesResposta(1, "cheetos");

        List<Salgadinho> lista = repository.findAll();

        return ResponseEntity.status(200).body(lista);
    }

    @GetMapping("/simples")
    public ResponseEntity getSimples() {
        List<SalgadinhoSimplesResposta> lista =
                repository.listaSimples();

        return ResponseEntity.status(200).body(lista);
    }

    @GetMapping("/contagem")
    public ResponseEntity getContagem() {
// .count() faz um "select count(*)" p/ saber quantos registros tem na tabela
        long contagem = repository.count();
        return ResponseEntity.status(200).body(contagem);
    }
}
