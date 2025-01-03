package med.voll.api.domain.consultas.records;

import java.time.LocalDateTime;

public record DadosDetalhamentoConsulta(Long id, String idMedico, String idPaciente, LocalDateTime data){

}
