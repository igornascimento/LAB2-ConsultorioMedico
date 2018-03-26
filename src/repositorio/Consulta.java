package repositorio;

import java.time.LocalDateTime;

/**
 *
 * @author Igor Nascimento <igornascimento@gmail.com>
 */
public class Consulta {
    
    private LocalDateTime dataHora;
    private Paciente paciente;

    public Consulta(LocalDateTime dataHora, Paciente paciente) {
        this.dataHora = dataHora;
        this.paciente = paciente;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public Paciente getPaciente() {
        return paciente;
    }
    
}
