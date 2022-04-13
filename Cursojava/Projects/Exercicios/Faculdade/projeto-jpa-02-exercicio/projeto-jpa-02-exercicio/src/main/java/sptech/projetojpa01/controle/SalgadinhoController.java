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

    @GetMapping("/apimentados")
    public ResponseEntity getApimentados(){
        List<Salgadinho> lista = repository.findByApimentadoTrue();
        return ResponseEntity.status(200).body(lista);
    }

    @GetMapping("/nao-apimentados")
    public ResponseEntity getNaoApimentados(){
        List<Salgadinho> lista = repository.findByApimentadoFalse();
        return ResponseEntity.status(200).body(lista);
    }

    @GetMapping("/pouco-sal")
    public ResponseEntity getPoucoSal(){
        List<Salgadinho> lista = repository.findByNivelSalLessThan(4);
        return ResponseEntity.status(200).body(lista);
    }

    @GetMapping("/caros")
    public ResponseEntity getcaros(){
        List<Salgadinho> lista = repository.findByCarosGreaterThan(0);
        return ResponseEntity.status(200).body(lista);
    }


}
