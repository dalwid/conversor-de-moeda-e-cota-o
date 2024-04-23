package com.github.dalwid.conversor.model;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public record Coins(@SerializedName("base_code") String baseCode, @SerializedName("target_code") String targetCode,
                    @SerializedName("conversion_rate") String conversionRate,
                    @SerializedName("conversion_result") String conversionResult) {
}
