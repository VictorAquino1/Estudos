package sptech.projetojpa04.entidade;

import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;
import java.time.LocalDate;

@Entity // do pacote javax.persistence
public class AnimalEstimacao {

    @Id // do pacote javax.persistence
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @NotNull // do pacote javax.persistence
    // @NotEmpty
    @NotBlank // apenas para texto (String)
    @Size(min = 2, max = 15)
    private String nome;

    // @Past
    @PastOrPresent
    private LocalDate dataNascimento;

    // @DecimalMin("0.1")
    // @PositiveOrZero
    @Positive
    @DecimalMax("70")
    private Double peso;

    @NotNull
    private boolean castrado;

    @Email
    private String emailDono;

    @CPF
    @Size(max = 11, message = "Informe somente os números")
    private String cpfDono;

    // validação usando expressão regular (regex)
    @Pattern(regexp = "(\\(?\\d{2}\\)?\\s)?(\\d{4,5}\\-\\d{4})", message = "Informe um telefone válido com ou sem DDD")
    private String telefoneDono; // (XX)XXXX-XXXXX // REGEX
    // https://medium.com/@igorrozani/criando-uma-express%C3%A3o-regular-para-telefone-fef7a8f98828
    /*
(99) 99999-9999
(99) 9999-9999
99 99999-9999
99 9999-9999
99999-9999
9999-9999
     */

    public String getTelefoneDono() {
        return telefoneDono;
    }

    public void setTelefoneDono(String telefoneDono) {
        this.telefoneDono = telefoneDono;
    }

    public String getEmailDono() {
        return emailDono;
    }

    public String getCpfDono() {
        return cpfDono;
    }

    public void setCpfDono(String cpfDono) {
        this.cpfDono = cpfDono;
    }

    public void setEmailDono(String emailDono) {
        this.emailDono = emailDono;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public boolean isCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }
}
