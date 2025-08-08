package com.wipro.paymentms.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.wipro.paymentms.entity.Payment;
import com.wipro.paymentms.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @PostMapping
    public ResponseEntity<String> save(@RequestBody Payment payment) {
        paymentService.save(payment);

        HttpHeaders headers = new HttpHeaders();
        headers.add("created-at", LocalDate.now().toString());

        return ResponseEntity
                .status(201)
                .headers(headers)
                .body("Data Saved Successfully");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> update(@PathVariable int id, @RequestBody Payment payment) {
        Payment existing = paymentService.findById(id);
        HttpStatusCode status;

        if (existing == null) {
            status = HttpStatusCode.valueOf(404);
            return ResponseEntity.status(status).body("Payment not found");
        }

        payment.setId(id);
        paymentService.save(payment);

        status = HttpStatusCode.valueOf(200);
        return ResponseEntity.status(status).body("Data Modified Successfully");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        Payment existing = paymentService.findById(id);
        HttpStatusCode status;

        if (existing == null) {
            status = HttpStatusCode.valueOf(404);
            return ResponseEntity.status(status).body("Payment not found");
        }

        paymentService.delete(id);
        status = HttpStatusCode.valueOf(200);
        return ResponseEntity.status(status).body("Data Deleted Successfully");
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable int id) {
        Payment payment = paymentService.findById(id);
        HttpHeaders headers = new HttpHeaders();
        headers.add("serah-time", LocalDateTime.now().toString());

        HttpStatusCode status;
        if (payment == null) {
            status = HttpStatusCode.valueOf(404);
            return ResponseEntity.status(status).headers(headers).body("No Data Found");
        }

        status = HttpStatusCode.valueOf(200);
        return ResponseEntity.status(status).headers(headers).body(payment);
    }

    @GetMapping
    public ResponseEntity<?> findAll() {
        List<Payment> list = paymentService.findAll();
        HttpHeaders headers = new HttpHeaders();
        headers.add("serah-time", LocalDateTime.now().toString());

        HttpStatusCode status;
        if (list.isEmpty()) {
            status = HttpStatusCode.valueOf(404);
            return ResponseEntity.status(status).headers(headers).body("No Data Found");
        }

        status = HttpStatusCode.valueOf(200);
        return ResponseEntity.status(status).headers(headers).body(list);
    }
}
