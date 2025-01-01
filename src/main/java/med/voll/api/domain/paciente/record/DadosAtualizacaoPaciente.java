package med.voll.api.domain.paciente.record;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
                                        @NotNull
                                        Long id,
                                        String nome,
                                        String telefone,
                                        DadosEndereco endereco) {
}