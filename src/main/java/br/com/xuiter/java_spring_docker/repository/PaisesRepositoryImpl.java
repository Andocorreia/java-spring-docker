package br.com.xuiter.java_spring_docker.repository;

import br.com.xuiter.java_spring_docker.model.Paises;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PaisesRepositoryImpl implements PaisesRepository {

    @Override
    public List<Paises> getPaises() {
        String json ="""
           [
               {"id": 1, "nome": "Brasil", "capital": "Brasília", "regiao": "América do Sul", "populacao": 213993437},
               {"id": 2, "nome": "Estados Unidos", "capital": "Washington, D.C.", "regiao": "América do Norte", "populacao": 331002651},
               {"id": 3, "nome": "Alemanha", "capital": "Berlim", "regiao": "Europa", "populacao": 83783942},
               {"id": 4, "nome": "Japão", "capital": "Tóquio", "regiao": "Ásia", "populacao": 126476461},
               {"id": 5, "nome": "França", "capital": "Paris", "regiao": "Europa", "populacao": 65273511},
               {"id": 6, "nome": "Canadá", "capital": "Ottawa", "regiao": "América do Norte", "populacao": 37742154},
               {"id": 7, "nome": "Austrália", "capital": "Canberra", "regiao": "Oceania", "populacao": 25499884},
               {"id": 8, "nome": "Índia", "capital": "Nova Délhi", "regiao": "Ásia", "populacao": 1380004385},
               {"id": 9, "nome": "Reino Unido", "capital": "Londres", "regiao": "Europa", "populacao": 67886011},
               {"id": 10, "nome": "México", "capital": "Cidade do México", "regiao": "América do Norte", "populacao": 128932753}
           ]
       """;
       return new Paises().fromJson(json);

    }
}
