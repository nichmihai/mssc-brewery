package nich.mihai.msscbrewery.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import nich.mihai.msscbrewery.services.BeerService;
import nich.mihai.msscbrewery.web.model.BeerDto;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.UUID;

import static org.awaitility.Awaitility.given;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

@WebMvcTest(BeerController.class)
class BeerControllerTest {
    @MockBean
    BeerService beerService;

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    BeerDto validBeer;

    @Before
    public void Setup () {
        validBeer = BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Michelob")
                .upc(567322147L)
                .beerStyle("Light Lager")
                .build();
    }

    @Test
    public void getBeer() throws Exception {
//        given(beerService.getBeerById(any(UUID.class))).willReturn(validBeer);
    }

    @Test
    void handlePost() {
    }

    @Test
    void handleUpdate() {
    }
}