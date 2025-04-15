package br.com.xuiter.java_spring_docker;

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
                .andExpect(content().string(this.mockCountries()));
    }

    private String mockCountries() {
        return """
               [
                     {
                       "id": 1,
                       "name": "Brasil",
                       "capital": "Brasília",
                       "region": "América do Sul",
                       "population": 213993437
                     },
                     {
                       "id": 2,
                       "name": "Estados Unidos",
                       "capital": "Washington, D.C.",
                       "region": "América do Norte",
                       "population": 331002651
                     },
                     {
                       "id": 3,
                       "name": "Alemanha",
                       "capital": "Berlim",
                       "region": "Europa",
                       "population": 83783942
                     },
                     {
                       "id": 4,
                       "name": "Japão",
                       "capital": "Tóquio",
                       "region": "Ásia",
                       "population": 126476461
                     },
                     {
                       "id": 5,
                       "name": "França",
                       "capital": "Paris",
                       "region": "Europa",
                       "population": 65273511
                     },
                     {
                       "id": 6,
                       "name": "Canadá",
                       "capital": "Ottawa",
                       "region": "América do Norte",
                       "population": 37742154
                     },
                     {
                       "id": 7,
                       "name": "Austrália",
                       "capital": "Canberra",
                       "region": "Oceania",
                       "population": 25499884
                     },
                     {
                       "id": 8,
                       "name": "Índia",
                       "capital": "Nova Délhi",
                       "region": "Ásia",
                       "population": 1380004385
                     },
                     {
                       "id": 9,
                       "name": "Reino Unido",
                       "capital": "Londres",
                       "region": "Europa",
                       "population": 67886011
                     },
                     {
                       "id": 10,
                       "name": "México",
                       "capital": "Cidade do México",
                       "region": "América do Norte",
                       "population": 128932753
                     }
               ]
        """;
    }

}
