package nich.mihai.msscbrewery.services;

import lombok.extern.slf4j.Slf4j;
import nich.mihai.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
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

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Miller Lite")
                .upc(124567521L)
                .beerStyle("American Lager")
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        //todo impl - would add
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleteing a beer...");
    }

}
