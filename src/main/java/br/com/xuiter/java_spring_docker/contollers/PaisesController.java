package br.com.xuiter.java_spring_docker.contollers;

import br.com.xuiter.java_spring_docker.model.Paises;
import br.com.xuiter.java_spring_docker.service.PaisesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaisesController {

    @Autowired
    PaisesService paisesService;

    @GetMapping("/countries")
    @ResponseStatus(HttpStatus.OK)
    public List<Paises> paises() {
        return this.paisesService.getPaises();
    }
}
