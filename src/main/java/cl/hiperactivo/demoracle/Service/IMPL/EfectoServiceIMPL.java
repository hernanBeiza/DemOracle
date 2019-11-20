package cl.hiperactivo.demoracle.Service.IMPL;

import cl.hiperactivo.demoracle.Repository.EfectoDAO;
import cl.hiperactivo.demoracle.Repository.Model.TG_Efectos;
import cl.hiperactivo.demoracle.Service.EfectoService;
import cl.hiperactivo.demoracle.VO.EfectoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EfectoServiceIMPL implements EfectoService {

    @Autowired
    private EfectoDAO efectoDAO;

    @Override
    public List<EfectoVO> findAll() {
        List<TG_Efectos> encontrados = this.efectoDAO.findAll();
        return encontrados.stream().map(c -> new EfectoVO.Builder().codEfecto(c.getCodEfecto())
                    .glsEfecto(c.getGlsEfecto())
                    .build())
                .collect(Collectors.toList());
    }
}
