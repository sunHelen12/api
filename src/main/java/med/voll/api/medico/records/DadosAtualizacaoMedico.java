package med.voll.api.medico.records;

import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(@NotNull
                                     Long id,
                                     String telefone,
                                     String nome,
                                     DadosEndereco endereco) {

}
