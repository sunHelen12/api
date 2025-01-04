package med.voll.api.domain.consultas.records;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.consultas.MotivoCancelamento;

public record DadosCancelamentoConsulta(
        @NotNull
        Long idConsulta,

        @NotNull
        MotivoCancelamento motivo) {
}