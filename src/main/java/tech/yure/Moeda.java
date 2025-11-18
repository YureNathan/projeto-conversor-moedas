package tech.yure;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public record Moeda(@SerializedName("base_code") String baseCode, @SerializedName("target_code") String targetCode, @SerializedName("conversion_rate") BigDecimal conversionRate ) {}
