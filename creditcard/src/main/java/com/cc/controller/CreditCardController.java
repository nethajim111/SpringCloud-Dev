package com.cc.controller;

import javax.validation.Valid;

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

/**
 * Rest Controller for Credit Card Endpoints
 * @author Nitin Raut
 *
 */
@RestController
public class CreditCardController {

	@Autowired
	private CreditCardService creditCardService;
	
	@RequestMapping(value="/credit-card/{cardNumber}",method=RequestMethod.GET,produces="application/json")
	public ResponseEntity<?> getCreditCardDetails(@PathVariable("cardNumber") Long cardNumber) throws InterruptedException{
		Thread.sleep(1500);
		return new ResponseEntity<>(creditCardService.getCreditCardDetails(cardNumber),HttpStatus.OK);
	}
	
	@RequestMapping(value="/credit-card",method=RequestMethod.POST,produces="application/json",consumes="application/json")
	public ResponseEntity<?> addCreditCardDetails(@RequestBody @Valid CreditCard creditCard){
		
		creditCardService.addCreditCardDetails(creditCard);
		return new ResponseEntity<>(creditCard,HttpStatus.OK);
	}
	
	@RequestMapping(value="/credit-card",method=RequestMethod.PUT,produces="application/json",consumes="application/json")
	public ResponseEntity<?> UpdateCreditCardDetails(@RequestBody CreditCard creditCard){
		return new ResponseEntity<>(creditCardService.updateCreditCardDetails(creditCard),HttpStatus.OK);
	}
	
	@RequestMapping(value="/credit-card/{cardNumber}",method=RequestMethod.DELETE,produces="application/json")
	public ResponseEntity<?> DeleteCreditCardDetails(@PathVariable("cardNumber") Long cardNumber){
		creditCardService.deleteCreditCardDetails(cardNumber);
		return new ResponseEntity<>("CreditCard Details Deleted Successfully",HttpStatus.OK);
	}
	
}
