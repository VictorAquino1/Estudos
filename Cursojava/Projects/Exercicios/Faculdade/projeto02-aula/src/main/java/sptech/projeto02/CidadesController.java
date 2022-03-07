package sptech.projeto02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cidades")
public class CidadesController {

    @GetMapping("/listar")
    public String listar(){
        return "Todas as cidades";
    }

    @GetMapping("/listar/top5")
    public String listarTop5(){
        return "1 - São Paulo \n 2 - Barueri \n 3 - Americana \n 4 - São Caetano \n 5 - Osasco";
    }
    @GetMapping
    public String home(){
        return "teste";
    }

}
