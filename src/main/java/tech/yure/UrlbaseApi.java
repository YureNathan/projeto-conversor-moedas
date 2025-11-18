package tech.yure;

public class UrlbaseApi {
    private String apiKey;
    private String urlBase;
    private String moedaOrigem;
    private String moedaDestino;

    public UrlbaseApi(String moedaOrigem, String moedaDestino) {
        this.moedaOrigem = moedaOrigem;
        this.moedaDestino = moedaDestino;
    }

    public String urlCompleta(){
        apiKey = System.getenv("API_KEY");
        urlBase = "https://v6.exchangerate-api.com/v6/"+apiKey+"pair/"+moedaOrigem+"/"+moedaDestino;
        return urlBase;
    }

}
