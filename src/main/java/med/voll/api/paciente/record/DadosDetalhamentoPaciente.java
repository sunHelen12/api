package med.voll.api.paciente.record;

import med.voll.api.endereco.Endereco;
import med.voll.api.paciente.Paciente;

public record DadosDetalhamentoPaciente(Long id,
                                        String nome,
                                        String email,
                                        String telefone,
                                        String cpf,
                                        Endereco endereco) {

    public DadosDetalhamentoPaciente(Paciente paciente){
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(),paciente.getTelefone(), paciente.getCpf(), paciente.getEndereco());
    }
}
