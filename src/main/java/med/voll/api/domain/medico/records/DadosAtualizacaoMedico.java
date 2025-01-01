package med.voll.api.domain.medico.records;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(@NotNull
                                     Long id,
                                     String telefone,
                                     String nome,
                                     DadosEndereco endereco) {

}
