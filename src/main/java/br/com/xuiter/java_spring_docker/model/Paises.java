package br.com.xuiter.java_spring_docker.model;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Paises {
    private Long id;
    private String nome;
    private String capital;
    private String regiao;
    private Long populacao;

    public List<Paises> fromJson(String json) {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Paises> paises = null;
        try {
            paises = objectMapper.readValue(json, new TypeReference<List<Paises>>() {});
        } catch (Exception e) {
            e.printStackTrace();
        }
        return paises;
    }
}
