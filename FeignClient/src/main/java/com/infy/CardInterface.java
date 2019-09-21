package com.infy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("CARDDETAILS")
public interface CardInterface {

	@RequestMapping(method = RequestMethod.GET, value = "/get-card-details/{cardNo}", consumes = "application/json")
    CardDetails getCardDetails(@PathVariable("cardNo") String cardNo);
	}
