package med.voll.api.domain.consultas.validacoes_agendamento;


import org.springframework.beans.factory.annotation.Autowired;

import med.voll.api.domain.consultas.records.DadosAgendamentoConsulta;
import med.voll.api.domain.consultas.repository.ConsultaRepository;
import med.voll.api.infra.exception.ValidacaoException;

public class ValidacaoPacienteSemOutraConsulta {
    
    @Autowired
    private ConsultaRepository repository;

    public void validar(DadosAgendamentoConsulta dados){
        var primeiroHorario = dados.data().withHour(7);
        var ultimoHorario = dados.data().withHour(18);
        var pacienteComOutraConsulta = repository.existsByPacienteIdAndDataBetween(dados.idPaciente(),
                                         primeiroHorario,  ultimoHorario);  

        if (pacienteComOutraConsulta){
            throw new ValidacaoException("Paciente já possui uma consulta agendada nesse dia!");
        }
    }
}
