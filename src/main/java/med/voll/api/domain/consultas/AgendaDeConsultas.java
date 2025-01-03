package med.voll.api.domain.consultas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import med.voll.api.domain.consultas.records.DadosAgendamentoConsulta;
import med.voll.api.domain.consultas.repository.ConsultaRepository;
import med.voll.api.domain.medico.repository.MedicoRepository;
import med.voll.api.domain.paciente.repository.PacienteRepository;

@Service
public class AgendaDeConsultas {

    @Autowired
    private ConsultaRepository consultaRepository;
    @Autowired
    private MedicoRepository medicoRepository;
    @Autowired
    private PacienteRepository pacienteRepository;
    

    public void agendar(DadosAgendamentoConsulta dados){
        

        var medico = medicoRepository.findById(dados.idMedico()).get();
        var paciente = pacienteRepository.findById(dados.idPaciente()).get();
        var consulta = new Consulta(null, medico, paciente, dados.data());
        consultaRepository.save(consulta);
    }
}
