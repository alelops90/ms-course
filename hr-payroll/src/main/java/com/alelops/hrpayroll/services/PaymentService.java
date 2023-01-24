package com.alelops.hrpayroll.services;

import com.alelops.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(Long id, int days){
        return new Payment("Jose", 200.0, days);
    }
}
