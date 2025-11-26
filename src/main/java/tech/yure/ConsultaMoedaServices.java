package tech.yure;

import com.google.gson.Gson;

import java.math.BigDecimal;

public class ConsultaMoedaServices {
    private String respostaApi;
    private Moeda moedaTaxa;

    public String consulta(String moedaOrigem, String moedaDestino) {
        UrlbaseApi urlbaseApi = new UrlbaseApi(moedaOrigem, moedaDestino);
        ConexaoHttp conexaoHttp = new ConexaoHttp();
        respostaApi = conexaoHttp.responseApi(urlbaseApi.urlCompleta());
        return respostaApi;
    }
    public Moeda moedaFiltrada(){
        Gson gson = new Gson();
        moedaTaxa = gson.fromJson(getRespostaApi(), Moeda.class);
        return moedaTaxa;
    }

    public BigDecimal converterMoedas(BigDecimal valor){
       return valor.multiply(moedaTaxa.conversionRate());
    }

    public String getRespostaApi() {
        return respostaApi;
    }

}
