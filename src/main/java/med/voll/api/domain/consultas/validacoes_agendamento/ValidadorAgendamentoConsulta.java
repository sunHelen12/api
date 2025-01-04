package med.voll.api.domain.consultas.validacoes_agendamento;

import med.voll.api.domain.consultas.records.DadosAgendamentoConsulta;

public interface ValidadorAgendamentoConsulta {
    void validar(DadosAgendamentoConsulta dados);
}
