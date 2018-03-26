package repositorio;

import java.time.LocalDate;

/**
 *
 * @author Igor Nascimento <igornascimento@gmail.com>
 */
public class Paciente {
    
    String nome;
    String endereco;
    String documento;
    LocalDate dataNascimento;

    public Paciente(String nome, 
                    String endereco, 
                    String documento, 
                    LocalDate dataNascimento) {
        this.nome = nome;
        this.endereco = endereco;
        this.documento = documento;
        this.dataNascimento = dataNascimento;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    
    
}
