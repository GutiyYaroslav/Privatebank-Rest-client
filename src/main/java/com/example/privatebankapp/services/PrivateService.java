package com.example.privatebankapp.services;


import com.example.privatebankapp.clients.PrivateClient;
import com.example.privatebankapp.models.BankExchangeRate;
import com.example.privatebankapp.models.Currency;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class PrivateService {

    private final PrivateClient privateClient;

    private final static Set<String> currencySet = Set.of("EUR","USD","GBP");


    public List<Currency> getAllCurrency(){


         List<Currency> currencies = privateClient.getAllCurrency().getExchangeRate();

         List<Currency> sortedCurrencies = currencies.stream()
                 .filter(item -> currencySet.contains(item.getCurrency()))
                 .collect(Collectors.toList());
         return sortedCurrencies;
    }
}
