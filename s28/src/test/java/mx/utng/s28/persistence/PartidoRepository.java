package mx.utng.s28.persistence;

import org.springframework.data.repository.CroudRepository;

import mx.utng.s28.model.Equipo;

public interface PartidoRepository extends CrudRepository <Partido, Long> {
    
}
