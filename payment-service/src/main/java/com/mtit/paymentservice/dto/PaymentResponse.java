package com.mtit.paymentservice.dto;

public class PaymentResponse {

    private String paymentId;
    private String paymentOptionId;
    private String message;
    private int status;

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) { this.paymentId = paymentId; }

    public String getPaymentOptionId() { return paymentOptionId; }

    public void setPaymentOptionId(String paymentOptionId) { this.paymentOptionId = paymentOptionId; }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) { this.message = message; }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) { this.status = status; }

}
