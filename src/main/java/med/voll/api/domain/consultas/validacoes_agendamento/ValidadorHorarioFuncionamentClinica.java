package med.voll.api.domain.consultas.validacoes_agendamento;

import java.time.DayOfWeek;

import med.voll.api.domain.consultas.records.DadosAgendamentoConsulta;
import med.voll.api.infra.exception.ValidacaoException;

public class ValidadorHorarioFuncionamentClinica {

    public void validar(DadosAgendamentoConsulta dados){
        var dataConsulta = dados.data();

        var domigo = dataConsulta.getDayOfWeek().equals(DayOfWeek.SUNDAY);
        var antesDaAberturaClinica = dataConsulta.getHour() < 7;
        var depoisDoFechamentoClinica = dataConsulta.getHour() > 18;

        if (domigo || antesDaAberturaClinica || depoisDoFechamentoClinica){
            throw new ValidacaoException("Consulta fora do horário de funcionamento da clínica!");
        }


    }
}
