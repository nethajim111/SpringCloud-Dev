package com.cc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cc.model.CreditCard;
import com.cc.services.CreditCardService;

@RestController
public class CreditCardController {

	@Autowired
	private CreditCardService creditCardService;
	
	@RequestMapping(value="/credit-card/{cardNumber}",method=RequestMethod.GET,produces="application/json")
	public ResponseEntity<?> getCreditCardDetails(@PathVariable("cardNumber") Long cardNumber){
		
		return new ResponseEntity<>(creditCardService.getCreditCardDetails(cardNumber),HttpStatus.OK);
	}
	
	@RequestMapping(value="/credit-card",method=RequestMethod.POST,produces="application/json",consumes="application/json")
	public ResponseEntity<?> addCreditCardDetails(@RequestBody CreditCard creditCard){
		
		creditCardService.addCreditCardDetails(creditCard);
		return new ResponseEntity<>(creditCard,HttpStatus.OK);
	}
}
