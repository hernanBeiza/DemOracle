package cl.hiperactivo.demoracle.Repository.IMPL;

import cl.hiperactivo.demoracle.Repository.EfectoDAO;
import cl.hiperactivo.demoracle.Repository.Model.TG_Efectos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.*;

@Repository
public class EfectoDAOIMPL implements EfectoDAO {

    @PersistenceContext
    EntityManager em;

    @Override
    public List<TG_Efectos> findAll() {
        System.out.println("EfectoDAOIMPL: findAll();");
        TypedQuery<TG_Efectos> query  = em.createQuery("SELECT efecto FROM TG_Efectos efecto", TG_Efectos.class);
        List<TG_Efectos> efectosEncontrados= query.getResultList();
        if (efectosEncontrados.size() > 0) {
            System.out.println("Total de efectos efectos encontrados " + efectosEncontrados.size());
            return efectosEncontrados;
        } else {
            return null;
        }
    }

}
