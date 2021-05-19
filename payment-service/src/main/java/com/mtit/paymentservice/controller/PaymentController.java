package com.mtit.paymentservice.controller;

import com.mtit.paymentservice.dto.PaymentRequest;
import com.mtit.paymentservice.dto.PaymentResponse;
import com.mtit.paymentservice.service.PaymentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentServiceImpl paymentService;

    @PostMapping(value = "/create", consumes = "application/json", produces = "application/json")
    public @ResponseBody
    PaymentResponse createUser(@RequestBody PaymentRequest paymentRequest) {
        return paymentService.createPayment(paymentRequest);
    }

}
