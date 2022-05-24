package sptech.projetojpa04.Resposta;

public class AnimalSimplesResposta {

    private Long codigo;
    private String nome;
    private String tipo;

    public AnimalSimplesResposta(Long codigo, String nome, String tipo) {
        this.codigo = codigo;
        this.nome = nome;
        this.tipo = tipo;
    }

    public Long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }
}
