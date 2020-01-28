package com.cc.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class CreditCard {

	@Id
	@NotNull(message="Card Number Cannot be Null")
	private Long cardNumber;
	
	@NotNull(message="Card Holder Name Cannot be Null")
	@NotEmpty(message="Card Holder Name Cannot be Empty")
	@NotBlank(message="Card Holder Name Cannot be Blank")
  	private String cardHolderName;
  	
	@NotNull(message="CVV Cannot be Null")
	@NotEmpty(message="CVV Cannot be Empty")
	@NotBlank(message="CVV Cannot be blank")
  	private String cvv;
  	
  	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
  	private LocalDate expiryDate;
  	
  	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
  	private LocalDate issueDate;
  	
	public Long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(Long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	public LocalDate getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}
  	
}
