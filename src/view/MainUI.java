package view;

import java.util.HashMap;
import java.util.Map;
import repositorio.Consulta;
import repositorio.Medicamento;
import repositorio.Paciente;
import util.Console;

/**
 *
 * @author Igor Nascimento <igornascimento@gmail.com>
 */
public class MainUI {
    
    Map<String, Paciente> pacientesMap = new HashMap<>();
    Map<Integer, Medicamento> medicamentosMap = new HashMap<>();
    Map<Integer, Consulta> consultasMap = new HashMap<>();
    
    public void executar() {
        int opcao = 0;
        
        do {
            System.out.println("##### MENU #####");
            System.out.println("1- Pacientes;");
            System.out.println("2- Medicamentos;");
            System.out.println("3- Consultas;");
            System.out.println("0- Sair;");
            
            opcao = Console.scanInt("Informe sua opcao para prosseguir: ");
            
            switch (opcao) {
                case 1:
                    new PacienteUI().showMenu(pacientesMap);
                    break;
                    
                case 2:
                    new MedicamentoUI().showMenu(medicamentosMap);
                    break;
                
                case 3:
                    new ConsultaUI().showMenu(consultasMap);
                    break;
                    
                default:
                    System.out.println("Opção incorreta.");
                    break;
            }
            
        } while (opcao != 0);
    }
    
}
