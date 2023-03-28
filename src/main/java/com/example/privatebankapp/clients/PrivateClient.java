package com.example.privatebankapp.clients;


import com.example.privatebankapp.models.BankExchangeRate;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Component
@RequiredArgsConstructor
public class PrivateClient {

    // https://api.privatbank.ua/p24api/exchange_rates?date=01.12.2014

    private static final String URL = "https://api.privatbank.ua";

    private LocalDateTime now = LocalDateTime.now();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    private String formattedDate = now.format(formatter);

    private final RestTemplate restTemplate;

    public BankExchangeRate getAllCurrency(){
        return restTemplate.exchange(URL + "/p24api/exchange_rates?date="+formattedDate,
                HttpMethod.GET, null, BankExchangeRate.class).getBody();
    }
}
