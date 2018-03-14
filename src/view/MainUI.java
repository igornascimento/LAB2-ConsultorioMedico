package view;

import util.Console;

/**
 *
 * @author 180503743
 */
public class MainUI {
    
    public void executar() {
        int opcao = 0;
        
        do {
            System.out.println("#---- MENU ----#");
            System.out.println("1- Pacientes;");
            System.out.println("2- Medicamentos;");
            System.out.println("0- Sair;");
            
            opcao = Console.scanInt("Informe sua opcao para prosseguir: ");
            
            switch (opcao) {
                case 1:
                    new PacienteUI().showMenu();
                    break;
                    
                case 2:
                    new MedicamentoUI().showMenu();
                    break;
                
                case 3:
                    new ConsultaUI().showMenu();
                    break;
                    
                default:
                    System.out.println("Opção incorreta.");
                    break;
            }
            
        } while (opcao != 0);
    }
    
}
