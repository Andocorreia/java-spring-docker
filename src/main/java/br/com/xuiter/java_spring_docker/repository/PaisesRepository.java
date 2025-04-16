package br.com.xuiter.java_spring_docker.repository;

import br.com.xuiter.java_spring_docker.model.Paises;

import java.util.List;

public interface PaisesRepository {

    List<Paises> getPaises();
}
