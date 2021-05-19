package com.mtit.paymentservice.dto;

public class CardDetailsResponse {

    private String message;
    private String PaymentOptionId;
    private int status;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) { this.message = message; }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) { this.status = status; }

    public String getPaymentOptionId() { return PaymentOptionId; }

    public void setPaymentOptionId(String paymentOptionId) { PaymentOptionId = paymentOptionId; }

}
