package sptech.projetojpa01.resposta;

/*
Esta classe é uma classe do tipo DTO
Data Transfer Object
É um DTO usado na resposta de chamadas
 */
public class SalgadinhoSimplesResposta {

    private Integer codigo;
    private String nome;

    public SalgadinhoSimplesResposta(Integer codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    // somente getters
    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }
}
