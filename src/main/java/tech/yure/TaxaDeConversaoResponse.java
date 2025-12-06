package tech.yure;

import com.google.gson.annotations.SerializedName;

public record TaxaDeConversaoResponse(@SerializedName("base_code") String moedaOrigem,
                                      @SerializedName("target_code") String moedaDestino,
                                      @SerializedName("conversion_rate") double taxaDeConversao) {
}
