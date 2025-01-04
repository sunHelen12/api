package med.voll.api.domain.consultas.validacoes_agendamento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import med.voll.api.domain.consultas.records.DadosAgendamentoConsulta;
import med.voll.api.domain.medico.repository.MedicoRepository;
import med.voll.api.infra.exception.ValidacaoException;

@Component()
public class ValidacaoMedicoAtivo implements ValidadorAgendamentoConsulta {
    @Autowired 
    private MedicoRepository repository;

    public void validar(DadosAgendamentoConsulta dados){
        if(dados.idMedico() == null){
            return;
        }

        var medicoEstaAtivo = repository.findAtivoById(dados.idMedico());

        if (!medicoEstaAtivo) {
            throw new ValidacaoException ("Consulta não pode ser agendada com médico excluído!");
        }
    }
}
