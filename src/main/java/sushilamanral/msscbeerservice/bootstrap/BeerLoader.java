package sushilamanral.msscbeerservice.bootstrap;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import sushilamanral.msscbeerservice.domain.Beer;
import sushilamanral.msscbeerservice.repositories.BeerRepository;

@Component
public class BeerLoader implements CommandLineRunner{
	private final BeerRepository beerRepository;

	public BeerLoader(BeerRepository beerRepository) {
		this.beerRepository = beerRepository;
	}
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		if(beerRepository.count()==0) {
		beerRepository.save(Beer.builder().beerName("Beer One").beerStyle("Style One").minOnHand(10).price(new BigDecimal(12.43)).upc(37864529L).build());
		beerRepository.save(Beer.builder().beerName("Beer Two").beerStyle("Style Two").minOnHand(10).price(new BigDecimal(12.43)).upc(37864539L).build());
		}
	}

}
