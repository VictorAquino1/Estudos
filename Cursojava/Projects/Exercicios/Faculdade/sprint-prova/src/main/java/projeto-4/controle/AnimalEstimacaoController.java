package sptech.projetojpa04.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sptech.projetojpa04.entidade.AnimalEstimacao;
import sptech.projetojpa04.repositorio.AnimalEstimacaoRepository;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/pets")
public class AnimalEstimacaoController {

    @Autowired
    private AnimalEstimacaoRepository repository;

    @PostMapping
    public ResponseEntity postPet(
            @RequestBody @Valid AnimalEstimacao novoPet) {
        repository.save(novoPet);
        return ResponseEntity.status(201).build();
    }

    @GetMapping
    public ResponseEntity getPets() {
        return ResponseEntity.status(200).body(repository.findAll());
    }


    @GetMapping("/relatorio")
    public ResponseEntity getRelatorio() {
        String relatorio = "";

        List<AnimalEstimacao> lista = repository.findAll();
        for(var pet : lista) {
            relatorio += pet.getCodigo()+","+pet.getNome()+"\r\n";
        }

        return ResponseEntity
                        .status(200)
                        .header("content-type", "text/csv")
                        //.header("content-length", "9999999999")
                        .header("content-disposition", "filename=\"relatorio.csv\"")
                        .body(relatorio);
    }

    @GetMapping("/filtro/{nome}")
    public ResponseEntity getPorNome(@PathVariable String nome) {
        List<AnimalEstimacao> lista = repository.findByNome(nome);
        return ResponseEntity.status(200).body(lista);
    }

    @GetMapping("/filtro/{nome}/{castrado}")
    public ResponseEntity getPorNome(
            @PathVariable String nome, @PathVariable boolean castrado) {

        List<AnimalEstimacao> lista =
                    repository.findByNomeAndCastrado(nome, castrado);
        return ResponseEntity.status(200).body(lista);
    }


}
