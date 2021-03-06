package view;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import repositorio.Paciente;
import util.Console;

/**
 *
 * @author Igor Nascimento <igornascimento@gmail.com>
 */
public class PacienteUI {

    private Map<String, Paciente> pacientesMap;
    
    public void showMenu(Map<String, Paciente> pacientesMap) {
        this.pacientesMap = pacientesMap;
        int opcao = 0;        
        
        do {
            System.out.println("##### PACIENTES #####");
            System.out.println("1- Cadastrar;");
            System.out.println("2- Listar;");
            System.out.println("3- Deletar;");
            System.out.println("0- Sair;");
            
            opcao = Console.scanInt("Informe sua opcao para prosseguir:");
            
            switch (opcao) {
                case 1:
                    cadastrarPaciente();
                    break;
                
                case 2:
                    listarPacientes();
                    break;
                
                case 3:
                    deletarPaciente();
                    break;
                
                default:
                    System.out.println("Opção invaĺida.");
                    break;
            }
            
        } while (opcao != 0);
        
    }
    
    public void cadastrarPaciente() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String doc = Console.scanString("RG:");
        Paciente paciente = new Paciente(
                Console.scanString("Nome:"),
                Console.scanString("Endereco:"),
                doc,
                LocalDate.parse(Console.scanString("Data de nascimento:"), formatter)
        );
        pacientesMap.put(doc, paciente);
    }
    
    public void listarPacientes() {
        Iterator it = pacientesMap.entrySet().iterator();
        
        System.out.println(
                String.format("%-20s", "|RG") + "\t" +
                String.format("%-20s", "|Nome") + "\t" +
                String.format("%-20s", "|Data nascimento") + "\t" +
                String.format("%-20s", "|Endereco")
        );
        
        pacientesMap.forEach((doc, paciente) -> {
            System.out.println(
                String.format("%-20s", "|" + paciente.getDocumento()) + "\t" +
                String.format("%-20s", "|" + paciente.getNome()) + "\t" +
                String.format("%-20s", "|" + paciente.getDataNascimento()) + "\t" +
                String.format("%-20s", "|" + paciente.getEndereco())
            );
        });
    }
    
    public void deletarPaciente() {
        String doc = Console.scanString("Informe e RG do registro:");
        pacientesMap.remove(doc);
    }
    
}
