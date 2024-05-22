package nich.mihai.msscbrewery.services;

import nich.mihai.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Shiner Bock")
                .beerStyle("Lager")
                .build();
    }

}
