package com.example.privatebankapp.controllers;


import com.example.privatebankapp.models.BankExchangeRate;
import com.example.privatebankapp.models.Currency;
import com.example.privatebankapp.services.PrivateService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/private")
@RequiredArgsConstructor
public class PrivateController {

    private final PrivateService privateService;

    @GetMapping
    public ResponseEntity<List<Currency>> getCurrencyRate(){

        return new ResponseEntity<>(privateService.getAllCurrency(), HttpStatus.OK);
    }
}
