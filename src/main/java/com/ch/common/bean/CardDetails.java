package com.ch.common.bean;


public class CardDetails {
	
	String cardType = "";
	
	String cardName = "";

	String cardNum = "";

	String cardStartDate = "";
	
	String cardExpDate = "";

	String cardCVV = "";
	

	public CardDetails(String[] data) {
		cardType = data[0];
		cardName = data[1];
		cardNum = data[2];
		cardStartDate = data[3];
		cardExpDate = data[4];
		cardCVV = data[5];
	}


	public String getCardType() {
		return cardType;
	}


	public void setCardType(String cardType) {
		this.cardType = cardType;
	}


	public String getCardName() {
		return cardName;
	}


	public void setCardName(String cardName) {
		this.cardName = cardName;
	}


	public String getCardNum() {
		return cardNum;
	}


	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}


	public String getCardStartDate() {
		return cardStartDate;
	}


	public void setCardStartDate(String cardStartDate) {
		this.cardStartDate = cardStartDate;
	}


	public String getCardExpDate() {
		return cardExpDate;
	}


	public void setCardExpDate(String cardExpDate) {
		this.cardExpDate = cardExpDate;
	}


	public String getCardCVV() {
		return cardCVV;
	}


	public void setCardCVV(String cardCVV) {
		this.cardCVV = cardCVV;
	}

	

	
}
