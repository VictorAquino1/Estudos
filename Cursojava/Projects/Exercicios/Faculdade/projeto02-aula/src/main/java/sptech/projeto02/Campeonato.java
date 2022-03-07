package sptech.projeto02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Campeonato {
    private Integer pontos = 0;
    private Integer numVitorias = 0;
    private Integer jogos = 0;

    @GetMapping("/registrar-vitoria")
    public String registrarVitoria() {
        pontos = pontos+3;
        jogos = jogos + 1;
        numVitorias = numVitorias +1;
        return "Parabens, você ganhou!";
    }

    @GetMapping("/registrar-empate")
    public String registraEmpate() {
        pontos = pontos+1;
        jogos = jogos + 1;
        return "você empatou!";
    }

    @GetMapping("/registrar-derrota")
    public String registrarDerrota() {
        jogos = jogos + 1;
        return "Que pena, você perdeu!";
    }

///*
//    public Integer calcular(Integer pontos, Integer jogos){
//        Integer conta = (jogos*pontos*100)/(jogos*(pontos*3));
//
//        return conta;
//    }
//*/

    @GetMapping("/pontuacao")
    public String pontuacao() {
        String resposta;
        if (jogos >=1){
            resposta = String.format
                    ("Olá você tem %d pontos e %d partidas, aproveitamento de %d", pontos, jogos, teste);
        }else{
            resposta = "Cadastre ao menos 1 partida";
        }
        return resposta;
    }


}
