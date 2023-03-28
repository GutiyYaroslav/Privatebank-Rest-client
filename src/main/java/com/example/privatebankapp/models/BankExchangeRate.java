package com.example.privatebankapp.models;

import lombok.Data;



import java.util.List;

@Data
public class BankExchangeRate {

    private String date;
    private String bank;
    private Integer baseCurrency;
    private String baseCurrencyLit;
    private List<Currency> exchangeRate;
}
