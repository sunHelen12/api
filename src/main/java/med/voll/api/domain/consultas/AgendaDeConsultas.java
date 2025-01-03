package med.voll.api.domain.consultas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import med.voll.api.domain.consultas.records.DadosAgendamentoConsulta;
import med.voll.api.domain.consultas.repository.ConsultaRepository;
import med.voll.api.domain.medico.Medico;
import med.voll.api.domain.medico.repository.MedicoRepository;
import med.voll.api.domain.paciente.repository.PacienteRepository;
import med.voll.api.infra.exception.ValidacaoException;

@Service
public class AgendaDeConsultas {

    @Autowired
    private ConsultaRepository consultaRepository;
    @Autowired
    private MedicoRepository medicoRepository;
    @Autowired
    private PacienteRepository pacienteRepository;
    

    public void agendar(DadosAgendamentoConsulta dados){
        
        if(!medicoRepository.existsById(dados.idMedico())){
            throw new ValidacaoException("ID do médico informado não existe!");
        }
        
        if (dados.idMedico() != null && !pacienteRepository.existsById(dados.idMedico())) {
            throw new ValidacaoException("ID do paciente informado não existe!");
        }        

        var medico =  escolherMedico(dados);
        var paciente = pacienteRepository.findById(dados.idPaciente()).get();
        var consulta = new Consulta(null, medico, paciente, dados.data());
        consultaRepository.save(consulta);
    }

    private Medico escolherMedico(DadosAgendamentoConsulta dados) {
        
    }
}
