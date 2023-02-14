package com.alelops.hrpayroll.services;

import com.alelops.hrpayroll.entities.Payment;
import com.alelops.hrpayroll.entities.Worker;
import com.alelops.hrpayroll.feingclient.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(Long id, int days) {
        Worker worker = workerFeignClient.findById(id).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
