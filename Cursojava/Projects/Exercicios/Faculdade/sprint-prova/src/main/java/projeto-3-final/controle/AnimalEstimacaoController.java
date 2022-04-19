package sptech.projetojpa03.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sptech.projetojpa03.entidade.AnimalEstimacao;
import sptech.projetojpa03.repositorio.AnimalEstimacaoRepository;

import javax.validation.Valid;

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
}
