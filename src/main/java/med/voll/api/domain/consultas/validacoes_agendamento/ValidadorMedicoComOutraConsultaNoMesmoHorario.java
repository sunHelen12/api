package med.voll.api.domain.consultas.validacoes_agendamento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import med.voll.api.domain.consultas.records.DadosAgendamentoConsulta;
import med.voll.api.domain.consultas.repository.ConsultaRepository;
import med.voll.api.infra.exception.ValidacaoException;


@Component
public class ValidadorMedicoComOutraConsultaNoMesmoHorario implements ValidadorAgendamentoConsulta {
    @Autowired
    private ConsultaRepository repository;

    public void validar (DadosAgendamentoConsulta dados){
        var medicoPossuiOutraConsulta = repository.existsByMedicoIdAndDataAndMotivoCancelamentoIsNull(dados.idMedico(), dados.data());
        if (medicoPossuiOutraConsulta) {
            throw new ValidacaoException("Médico já possui outra consulta agendada nesse mesmo horário!");
        }
    }

}
