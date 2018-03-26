package view;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import util.Console;
import java.util.HashMap;
import java.util.Map;
import repositorio.Consulta;

/**
 *
 * @author Igor Nascimento <igornascimento@gmail.com>
 */
public class ConsultaUI {
    
    Map<Integer, Consulta> consultasMap = new HashMap<>();
    
    public void showMenu(Map<Integer, Consulta> consultasMap) {
        this.consultasMap = consultasMap;
        int opcao = 0;
        
        do {
            System.out.println("##### CONSULTAS #####");
            System.out.println("1- Agendar;");
            System.out.println("2- Listar;");
            System.out.println("3- Deletar;");
            System.out.println("0- Sair;");
            
            opcao = Console.scanInt("Informe sua opcao para prosseguir:");
            
            switch (opcao) {
                case 1:
                    agendarConsulta();
                    break;
                
                default:
                    System.out.println("Opção invaĺida.");
                    break;
            }
            
        } while (opcao != 0);
        
    }
    
    public void agendarConsulta() {
        
        LocalDateTime horario = validaHorarioDisponivel();
    }
    
    
    public LocalDateTime validaHorarioDisponivel() {
        //define o padrao de data a ser utilizado
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy kk:mm");
        boolean disponivel = false;
        LocalDateTime horarioDesejado = LocalDateTime.now();
        
        do {
            String data = Console.scanString("Informe a DATA para a consulta (dd-mm-yyyyy) ou zero para cancelar:");
            if (data == "0") break;
            String hora = Console.scanString("Informe a HORA para a consulta (hh:mm) ou zero para cancelar:");
            if (data == "0") break;
            
            horarioDesejado = LocalDateTime.parse(data +" "+ hora, formatter);
            
            for (int i=0; i<consultasMap.size(); i++) {
                LocalDateTime horarioConsulta = consultasMap.get(i).getDataHora();
                if (horarioDesejado.isBefore(horarioConsulta.minusMinutes(60)) ||
                    horarioDesejado.isAfter(horarioConsulta.plusMinutes(60))) {
                        disponivel = true;
                }
            }
        } while (!disponivel);
        
        if (disponivel) {
            return horarioDesejado;
        }
        return null;
    }
    
}
