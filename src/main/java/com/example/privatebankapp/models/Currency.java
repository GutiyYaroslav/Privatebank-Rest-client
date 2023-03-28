package com.example.privatebankapp.models;

import lombok.Data;

@Data
public class Currency {

    private String baseCurrency;
    private String currency;
    private Double saleRateNB;
    private Double purchaseRateNB;
    private Double saleRate;
    private Double purchaseRate;
}
