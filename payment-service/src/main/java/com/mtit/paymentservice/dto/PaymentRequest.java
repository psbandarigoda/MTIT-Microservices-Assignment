package com.mtit.paymentservice.dto;

public class PaymentRequest {

    private String buyer;
    private String order;
    private String paymentType;
    private String barcode;
    private Double amount;
    private String cardType;
    private String cardNumber;
    private String expireDate;
    private String cvv;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String mobile;
    private String password;

    public String getBuyer() { return buyer; }

    public void setBuyer(String buyer) { this.buyer = buyer; }

    public String getOrder() { return order; }

    public void setOrder(String order) { this.order = order; }

    public String getPaymentType() { return paymentType; }

    public void setPaymentType(String paymentType) { this.paymentType = paymentType; }

    public String getBarcode() { return barcode; }

    public void setBarcode(String barcode) { this.barcode = barcode; }

    public Double getAmount() { return amount; }

    public void setAmount(Double amount) { this.amount = amount; }

    public String getCardType() { return cardType; }

    public void setCardType(String cardType) { this.cardType = cardType; }

    public String getCardNumber() { return cardNumber; }

    public void setCardNumber(String cardNumber) { this.cardNumber = cardNumber; }

    public String getExpireDate() { return expireDate; }

    public void setExpireDate(String expireDate) { this.expireDate = expireDate; }

    public String getCvv() { return cvv; }

    public void setCvv(String cvv) { this.cvv = cvv; }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
