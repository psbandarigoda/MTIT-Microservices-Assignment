package com.mtit.paymentservice.service;

import com.mtit.paymentservice.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class PaymentServiceImpl {


    @Autowired
    private RestTemplate restTemplate;

    public PaymentResponse createPayment(PaymentRequest paymentRequest) {

        var userCreateRequest = new UserCreateRequest();
        userCreateRequest.setFirstName(paymentRequest.getFirstName());
        userCreateRequest.setLastName(paymentRequest.getFirstName());
        userCreateRequest.setEmail(paymentRequest.getEmail());
        userCreateRequest.setAddress(paymentRequest.getAddress());
        userCreateRequest.setMobile(paymentRequest.getMobile());
        userCreateRequest.setPassword(paymentRequest.getPassword());
        ResponseEntity<UserCreateResponse> userCreateResponse = restTemplate.postForEntity("http://localhost:8880/users/create", userCreateRequest, UserCreateResponse.class);

        var cardDetailsRequest = new CardDetailsRequest();
        cardDetailsRequest.setUser(paymentRequest.getBuyer());
        cardDetailsRequest.setCardType(paymentRequest.getCardType());
        cardDetailsRequest.setCardNumber(paymentRequest.getCardNumber());
        cardDetailsRequest.setExpireDate(paymentRequest.getExpireDate());
        cardDetailsRequest.setCvv(paymentRequest.getCvv());
        ResponseEntity<CardDetailsResponse> cardDetailsResponse = restTemplate.postForEntity("http://localhost:8882/card/add", cardDetailsRequest, CardDetailsResponse.class);


        var paymentResponse = new PaymentResponse();
        paymentResponse.setPaymentId(UUID.randomUUID().toString());
        paymentResponse.setUserId(userCreateResponse.getBody().getUserId());
        paymentResponse.setPaymentOptionId(cardDetailsResponse.getBody().getPaymentOptionId());
        paymentResponse.setMessage("Paid Successfully");
        paymentResponse.setStatus(200);

        return paymentResponse;
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }
}
