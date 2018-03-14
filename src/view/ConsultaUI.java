package view;

import util.Console;

/**
 *
 * @author igor
 */
public class ConsultaUI {
    
    public void showMenu() {
        int opcao = 0;        
        
        do {
            System.out.println("##### CONSULTAS #####");
            System.out.println("1- Cadastrar;");
            System.out.println("2- Listar;");
            System.out.println("3- Deletar;");
            System.out.println("0- Sair;");
            
            opcao = Console.scanInt("Informe sua opcao para prosseguir:");
            
            switch (opcao) {
                case 1:
                    //cadastrarConsulta();
                    break;
                
                default:
                    System.out.println("Opção invaĺida.");
                    break;
            }
            
        } while (opcao != 0);
        
    }
    
}
