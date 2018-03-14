package view;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import repositorio.Medicamento;
import util.Console;

/**
 *
 * @author igor
 */
public class MedicamentoUI {
    
    int id = 0;
    Map<Integer, Medicamento> medicamentosMap = new HashMap<Integer, Medicamento>();
    
    public void showMenu() {
        int opcao = 0;
        
        do {
            System.out.println("#---- MEDICAMENTOS ----#");
            System.out.println("1- Cadastrar;");
            System.out.println("2- Listar;");
            System.out.println("3- Deletar;");
            System.out.println("0- Sair;");
            
            opcao = Console.scanInt("Informe sua opcao para prosseguir:");
            
            switch (opcao) {
                case 1:
                    cadastrarMedicamento();
                    break;
                
                case 2:
                    listarMedicamentos();
                    break;
                
                case 3:
                    deletarMedicamento();
                    break;
                
                default:
                    System.out.println("Opção invaĺida.");
                    break;
            }
            
        } while (opcao != 0);
    }
    
    public void cadastrarMedicamento() {
        id++;
        Medicamento medicamento = new Medicamento(
                id,
                Console.scanString("Nome:"),
                Console.scanString("Fabricante:"),
                Console.scanString("Dosagem:"),
                Console.scanString("Validade:"),
                Console.scanString("Quantidade:")
        );
        medicamentosMap.put(id, medicamento);
    }
    
    public void listarMedicamentos() {
        Iterator it = medicamentosMap.entrySet().iterator();
        
        System.out.println(
                String.format("%-20s", "|ID") + "\t" +
                String.format("%-20s", "|Nome") + "\t" +
                String.format("%-20s", "|Fabricante") + "\t" +
                String.format("%-20s", "|Dosagem") + "\t" +
                String.format("%-20s", "|Validade") + "\t" +
                String.format("%-20s", "|Quantidade")
        );
        
        while (it.hasNext()) {
            medicamentosMap.forEach((id, medicamento) -> {
                System.out.println(
                    String.format("%-20s", "|" + medicamento.getId()) + "\t" +
                    String.format("%-20s", "|" + medicamento.getNome()) + "\t" +
                    String.format("%-20s", "|" + medicamento.getFabricante()) + "\t" +
                    String.format("%-20s", "|" + medicamento.getDosagem()) + "\t" +
                    String.format("%-20s", "|" + medicamento.getValidade()) + "\t" +
                    String.format("%-20s", "|" + medicamento.getQuantidade())
                );
            });
        }
    }
    
    public void deletarMedicamento() {
        String id = Console.scanString("Informe e ID do registro:");
        medicamentosMap.remove(id);
    }
    
}
