package med.voll.api.domain.consultas.validacoes_cancelamento;

import med.voll.api.domain.consultas.records.DadosCancelamentoConsulta;

public interface ValidadorCancelamentoConsulta {
    void validar(DadosCancelamentoConsulta dados);
}
