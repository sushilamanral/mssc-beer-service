package sushilamanral.msscbeerservice.web.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import sushilamanral.msscbeerservice.web.model.BeerDto;

@WebMvcTest(BeerController.class)
class BeerControllerTest {

	@Autowired
	MockMvc mockMvc;
	
	@Autowired
	ObjectMapper objectMapper;
	
	@Test
	void testGetBeerById() throws Exception {
		
			mockMvc.perform(get( "/api/v1/beer/" + UUID.randomUUID().toString()).accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
		
	}

	@Test
	void testSaveNewBeer() throws Exception {
		BeerDto beerDto = BeerDto.builder().build();
			String beerDtoJson = objectMapper.writeValueAsString(beerDto);
			mockMvc.perform(post("/api/v1/beer/").content(beerDtoJson).contentType(MediaType.APPLICATION_JSON)).andExpect(status().isCreated());
		
	}

	@Test
	void testUpdateBeerById() throws Exception {
		BeerDto beerDto = BeerDto.builder().build();
		String beerDtoJson = objectMapper.writeValueAsString(beerDto);
		mockMvc.perform(put("/api/v1/beer/" + UUID.randomUUID().toString()).content(beerDtoJson).contentType(MediaType.APPLICATION_JSON)).andExpect(status().isNoContent());
	}

}
