package com.cc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cc.model.CreditCard;
import com.cc.repositories.CreditCardRepository;

@Service
public class CreditCardServiceImpl implements CreditCardService{

	@Autowired
	private CreditCardRepository creditCardRepository;
	@Override
	public Optional<CreditCard> getCreditCardDetails(Long cardNumber) {
		return creditCardRepository.findById(cardNumber);
	}

	@Override
	public CreditCard addCreditCardDetails(CreditCard creditCard) {
		
		return creditCardRepository.saveAndFlush(creditCard);
	}

}
