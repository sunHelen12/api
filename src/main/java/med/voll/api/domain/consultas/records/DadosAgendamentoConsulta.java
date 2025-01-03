package med.voll.api.domain.consultas.records;

import java.time.LocalDateTime;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;

public record DadosAgendamentoConsulta(Long id, 
                                       @NotNull
                                       Long idMedico,
                                       @NotNull
                                       Long idPaciente,
                                       @NotNull
                                       @Future
                                       LocalDateTime data){

}
