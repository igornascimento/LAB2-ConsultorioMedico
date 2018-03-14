package repositorio;

/**
 *
 * @author igor
 */
public class Medicamento {

    int id;
    String nome;
    String fabricante;
    String dosagem;
    String validade;
    String quantidade;
    
    public Medicamento(int id,
                       String nome,
                       String fabricante,
                       String dosagem,
                       String validade,
                       String quantidade) {
        this.id = id;
        this.nome = nome;
        this.fabricante = fabricante;
        this.dosagem = dosagem;
        this.validade = validade;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getDosagem() {
        return dosagem;
    }

    public String getValidade() {
        return validade;
    }
    
    public String getQuantidade() {
        return quantidade;
    }
    
}
