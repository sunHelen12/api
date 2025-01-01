package med.voll.api.medico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import med.voll.api.medico.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long>{
    
}
