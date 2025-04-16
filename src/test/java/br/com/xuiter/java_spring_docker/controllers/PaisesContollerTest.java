package br.com.xuiter.java_spring_docker.controllers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest
@AutoConfigureMockMvc
public class PaisesContollerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("Should return a list of countries")
    void countriesList() throws Exception {
        mockMvc.perform(get("/countries"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(content().json(this.mockCountries()));
    }

    private String mockCountries() {
        return """
               [
                     {
                       "id": 1,
                       "nome": "Brasil",
                       "capital": "Brasília",
                       "regiao": "América do Sul",
                       "populacao": 213993437
                     },
                     {
                       "id": 2,
                       "nome": "Estados Unidos",
                       "capital": "Washington, D.C.",
                       "regiao": "América do Norte",
                       "populacao": 331002651
                     },
                     {
                       "id": 3,
                       "nome": "Alemanha",
                       "capital": "Berlim",
                       "regiao": "Europa",
                       "populacao": 83783942
                     },
                     {
                       "id": 4,
                       "nome": "Japão",
                       "capital": "Tóquio",
                       "regiao": "Ásia",
                       "populacao": 126476461
                     },
                     {
                       "id": 5,
                       "nome": "França",
                       "capital": "Paris",
                       "regiao": "Europa",
                       "populacao": 65273511
                     },
                     {
                       "id": 6,
                       "nome": "Canadá",
                       "capital": "Ottawa",
                       "regiao": "América do Norte",
                       "populacao": 37742154
                     },
                     {
                       "id": 7,
                       "nome": "Austrália",
                       "capital": "Canberra",
                       "regiao": "Oceania",
                       "populacao": 25499884
                     },
                     {
                       "id": 8,
                       "nome": "Índia",
                       "capital": "Nova Délhi",
                       "regiao": "Ásia",
                       "populacao": 1380004385
                     },
                     {
                       "id": 9,
                       "nome": "Reino Unido",
                       "capital": "Londres",
                       "regiao": "Europa",
                       "populacao": 67886011
                     },
                     {
                       "id": 10,
                       "nome": "México",
                       "capital": "Cidade do México",
                       "regiao": "América do Norte",
                       "populacao": 128932753
                     }
               ]
        """;
    }

}
