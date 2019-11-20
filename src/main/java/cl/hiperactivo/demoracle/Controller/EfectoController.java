package cl.hiperactivo.demoracle.Controller;

import cl.hiperactivo.demoracle.Service.EfectoService;
import cl.hiperactivo.demoracle.VO.EfectoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("efecto")
public class EfectoController {

    @Autowired
    private EfectoService efectoService;

    @GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public List<EfectoVO> findAll() {
        System.out.println("EfectoController: findAll();");
        return efectoService.findAll();
    }
}
