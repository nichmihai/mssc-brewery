package nich.mihai.msscbrewery.services.v2;

import lombok.extern.slf4j.Slf4j;
import nich.mihai.msscbrewery.web.model.BeerDto;
import nich.mihai.msscbrewery.web.model.v2.BeerDtoV2;
import nich.mihai.msscbrewery.web.model.v2.BeerStyleEnum;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .beerName("Shiner Bock")
                .beerStyle(BeerStyleEnum.LAGER)
                .build();
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .beerName("Miller Lite")
                .upc(124567521L)
                .beerStyle(BeerStyleEnum.LAGER)
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {
        //todo impl - would add
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleteing a beer...");
    }
}
