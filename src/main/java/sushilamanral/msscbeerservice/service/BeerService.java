package sushilamanral.msscbeerservice.service;

import java.util.UUID;

import sushilamanral.msscbeerservice.web.model.BeerDto;

public interface BeerService {

	BeerDto getBeerById(UUID beerId);


}
