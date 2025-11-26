package tech.yure;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConnectionHttp {
    private HttpClient client;

    public ConnectionHttp() {
        this.client = HttpClient.newHttpClient();
    }

    public String responseApi(String baseUrl){
        HttpResponse<String> response = null;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(baseUrl))
                .GET()
                .build();

        try{
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            System.out.println("Erro ao consultar dados... Verifique a conexão da API!" + e.getMessage());
        }
        return response.body();
    }

}
