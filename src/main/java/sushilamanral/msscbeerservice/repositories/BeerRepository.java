package sushilamanral.msscbeerservice.repositories;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;

import sushilamanral.msscbeerservice.domain.Beer;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID>{

}
