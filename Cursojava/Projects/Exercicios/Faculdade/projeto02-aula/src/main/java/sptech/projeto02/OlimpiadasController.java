package sptech.projeto02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/paises")
public class OlimpiadasController {

    List<Pais> paises = new ArrayList<>();

    @GetMapping
    public Pais teste(){
        Pais pais = new Pais("Brasil", 12, 10, 6);

        return pais;
    }

    @GetMapping("/listar")
    public List<Pais> listarPaises(){
        paises.add(new Pais("Brazil", 9,5,2));
        paises.add(new Pais("Canada", 20,15,10));
        paises.add(new Pais("Japao", 50,35,22));
        return paises;
    }

    @GetMapping("/cadastrar/{nome}/{ouro}/{prata}/{bronze}")
    public String cadastrarPais(
            @PathVariable String nome,
            @PathVariable int ouro,
            @PathVariable int prata,
            @PathVariable int bronze
    ){
        paises.add((new Pais(nome, ouro, prata, bronze)));
                return "Pais cadastrado com sucesso!";
    }

    @GetMapping("/buscar/{indice}")
    public Pais buscarPais(@PathVariable int indice){
        return paises.get(indice);
    }

}
