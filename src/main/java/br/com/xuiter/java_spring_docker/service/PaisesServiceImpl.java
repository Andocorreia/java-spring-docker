package br.com.xuiter.java_spring_docker.service;

import br.com.xuiter.java_spring_docker.model.Paises;
import br.com.xuiter.java_spring_docker.repository.PaisesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisesServiceImpl  implements PaisesService{

    @Autowired
    PaisesRepository paisesRepository;

    @Override
    public List<Paises> getPaises() {
        return paisesRepository.getPaises();
    }
}
