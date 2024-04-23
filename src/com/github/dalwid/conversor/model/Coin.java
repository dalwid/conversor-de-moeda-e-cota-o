package com.github.dalwid.conversor.model;

import java.util.ArrayList;
import java.util.List;

public class Coin {
    private String baseCode;
    private String targetCode;
    private String conversionRate;
    private String conversionResult;
    private double value;

    public Coin() {
    }

    public Coin(String baseCode, String targetCode, String conversionRate, String conversionResult, double value) {
        this.baseCode = baseCode;
        this.targetCode = targetCode;
        this.conversionRate = conversionRate;
        this.conversionResult = conversionResult;
        this.value = value;
    }

    public void setTargetCode(String targetCode) {
        this.targetCode = targetCode;
    }

    public double getValue() {
        return value;
    }

    public String getBaseCode() {
        return baseCode;
    }

    public String getTargetCode() {
        return targetCode;
    }

    public String getConversionRate() {
        return conversionRate;
    }
    public String getConversionResult() {
        return conversionResult;
    }
}
