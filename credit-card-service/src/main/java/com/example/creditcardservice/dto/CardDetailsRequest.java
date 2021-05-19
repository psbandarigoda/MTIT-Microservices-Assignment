package com.example.creditcardservice.dto;

public class CardDetailsRequest {

    private String user;
    private String cardType;
    private String cardNumber;
    private String expireDate;
    private String cvv;

    public String getCardType() { return cardType; }

    public void setCardType(String cardType) { this.cardType = cardType; }

    public String getCardNumber() { return cardNumber; }

    public void setCardNumber(String cardNumber) { this.cardNumber = cardNumber; }

    public String getExpireDate() { return expireDate; }

    public void setExpireDate(String expireDate) { this.expireDate = expireDate; }

    public String getCvv() { return cvv; }

    public void setCvv(String cvv) { this.cvv = cvv; }

    public String getUser() { return user; }

    public void setUser(String user) { this.user = user; }

}
