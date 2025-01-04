package med.voll.api.domain.consultas.records;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.consultas.MotivoCancelamento;

public record DadosCancelamentoConsulta(@NotNull
                                        Long id_consulta,
                                        @NotNull
                                        MotivoCancelamento motivo) {

}
