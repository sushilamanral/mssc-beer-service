package sushilamanral.msscbeerservice.web.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
	
	@Null
	private UUID beerId;
	
	@NotBlank
	private String beerName;
	
	@Null
	private Integer version;
	
	@Null
	private OffsetDateTime createdDate;
	
	@Null
	private OffsetDateTime lastModifiedDate;
	
	@NotNull
	private BeerStyleEnum beerStyle;
	
	@Positive
	@NotNull
	private Long upc;
	
	@Positive
	@NotNull
	private BigDecimal price;
	private Integer quantityOnHand;
}