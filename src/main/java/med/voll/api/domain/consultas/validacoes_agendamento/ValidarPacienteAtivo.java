package med.voll.api.domain.consultas.validacoes_agendamento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import med.voll.api.domain.consultas.records.DadosAgendamentoConsulta;
import med.voll.api.domain.paciente.repository.PacienteRepository;
import med.voll.api.infra.exception.ValidacaoException;

@Component
public class ValidarPacienteAtivo implements ValidadorAgendamentoConsulta{
    @Autowired
    private PacienteRepository repository;

    public void validar(DadosAgendamentoConsulta dados){
        var pacienteEstaAtivo = repository.findAtivoById(dados.idPaciente());
        
        if(!pacienteEstaAtivo){
            throw new ValidacaoException("Consulta não pode ser agendada com paciente inativo!");
        }
    }
}
