package cl.hiperactivo.demoracle.Repository;

import cl.hiperactivo.demoracle.Repository.Model.TG_Efectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EfectoDAO {

    List<TG_Efectos> findAll();

}
