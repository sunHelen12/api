package med.voll.api.domain.consultas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import med.voll.api.domain.consultas.Consulta;

public interface ConsultaRepository extends JpaRepository <Consulta, Long> {

}
