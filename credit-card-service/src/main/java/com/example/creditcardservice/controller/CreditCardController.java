package com.example.creditcardservice.controller;


import com.example.creditcardservice.dto.CardDetailsRequest;
import com.example.creditcardservice.dto.CardDetailsResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/card")
public class CreditCardController {

    @PostMapping(value = "/add", consumes = "application/json", produces = "application/json")
    public @ResponseBody
    CardDetailsResponse createUserCard(@RequestBody CardDetailsRequest cardDetailsRequest) {

        var cardDetailsResponse = new CardDetailsResponse();
        cardDetailsResponse.setPaymentOptionId(UUID.randomUUID().toString());
        cardDetailsResponse.setMessage("Successfully Added Credit Card Details");
        cardDetailsResponse.setStatus(200);
        return cardDetailsResponse;
    }

}
