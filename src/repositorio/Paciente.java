package repositorio;

/**
 *
 * @author Igor Nascimento <igornascimento@gmail.com>
 */
public class Paciente {
    
    String nome;
    String endereco;
    String documento;
    String dataNascimento;

    public Paciente(String nome, 
                    String endereco, 
                    String documento, 
                    String dataNascimento) {
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    
    
}
