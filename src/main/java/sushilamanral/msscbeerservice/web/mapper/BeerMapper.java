package sushilamanral.msscbeerservice.web.mapper;

import org.mapstruct.Mapper;

import sushilamanral.msscbeerservice.domain.Beer;
import sushilamanral.msscbeerservice.web.model.BeerDto;

@Mapper(uses = DateMapper.class)
public interface BeerMapper {

	BeerDto beerToBeerDto (Beer beer);
	Beer beerDtoToBeer (BeerDto beerDto);
}
