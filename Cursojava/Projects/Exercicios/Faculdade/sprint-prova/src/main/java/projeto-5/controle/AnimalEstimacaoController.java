package sptech.projetojpa04.controle;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sptech.projetojpa04.Resposta.AnimalSimplesResposta;
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
    public ResponseEntity<List<AnimalEstimacao>> getPets() {
        return ResponseEntity.status(200).body(repository.findAll());
    }

    @ApiResponses({
        @ApiResponse(responseCode = "200",
                     content = @Content(mediaType = "text/csv"))
    })
    @GetMapping("/relatorio")
    public ResponseEntity getRelatorio() {
        List<AnimalEstimacao> lista = repository.findAll();
        String relatorio = "";
        for (AnimalEstimacao pet : lista) {
            relatorio += pet.getCodigo()+","+pet.getNome()+"\n";
        }
        return ResponseEntity.status(200)
                    .header("content-type", "text/csv")
                    .header("content-disposition", "filename=\"relatorio-de-pets.csv\"")
                    .body(relatorio);
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<AnimalEstimacao> getPet(@PathVariable long codigo) {
        return ResponseEntity.of(repository.findById(codigo));
    }

    @DeleteMapping("/{codigo}")
    public ResponseEntity<Void> deletePet(@PathVariable long codigo) {
        repository.deleteById(codigo);
        return ResponseEntity.status(200).build();
    }

    @GetMapping("/filtro/{nome}")
    public ResponseEntity<List<AnimalEstimacao>> filtro(
            @PathVariable String nome
    ) {
        return ResponseEntity.status(200).body(repository.findByNome(nome));
    }

    @GetMapping("/filtro/{nome}/{castrado}")
    public ResponseEntity<List<AnimalEstimacao>> filtro(
            @PathVariable String nome,
            @PathVariable boolean castrado
    ) {
        return ResponseEntity.status(200)
                .body(repository.findByNomeAndCastrado(nome, castrado));
    }

    @GetMapping("/tipo/{codigo}")
    public ResponseEntity<List<AnimalEstimacao>> getTipo(@PathVariable Integer codigo){
        List<AnimalEstimacao> lista = repository.findByTipoCodigo(codigo);
        if(lista.isEmpty()){
            ResponseEntity.status(204)
                    .build();
        }
        return ResponseEntity.status(200)
                .body(lista);
    }

    @GetMapping("/tipoDescricao/{descricao}")
    public ResponseEntity<List<AnimalEstimacao>> getDesc(@PathVariable String descricao){
        List<AnimalEstimacao> lista = repository.findByTipoDescricaoContains(descricao);
        if(lista.isEmpty()){
            ResponseEntity.status(204)
                    .build();
        }
        return ResponseEntity.status(200)
                .body(lista);
    }

    @GetMapping("/simples/{nome}")
    public ResponseEntity<List<AnimalSimplesResposta>> getPorNome(@PathVariable String nome){
        List<AnimalSimplesResposta> lista = repository.consultaSimplesPorNome("%"+nome+"%");
        if(lista.isEmpty()){
            ResponseEntity.status(204)
                    .build();
        }
        return ResponseEntity.status(200)
                .body(lista);
    }

}
