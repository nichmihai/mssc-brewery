package nich.mihai.msscbrewery.web.controller;

import nich.mihai.msscbrewery.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    @GetMapping("/{beerid}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId) {
        return new ResponseEntity<>(BeerDto.builder()
                .id(UUID.randomUUID())
                .upc(123456L)
                .beerName("Scheinerbock")
                .build(), HttpStatus.OK);
    }
    public ResponseEntity<BeerDto> getBeerList() {

    }

}
