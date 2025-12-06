package tech.yure;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

public class ConversorJsonParser {
    private Gson gson;

    public ConversorJsonParser() {
        this.gson = new Gson();
    }

    public TaxaDeConversaoResponse parseTaxaDeConversao(String json){
        try{
            return gson.fromJson(json, TaxaDeConversaoResponse.class);
        } catch (JsonSyntaxException e) {
            throw new RuntimeException("Erro ao converter json: "+ e);
        }
    }
}
