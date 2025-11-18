package tech.yure;

public class ConsultaMoedaServices {

    public String consulta(String moedaOrigem, String moedaDestino) {
        UrlbaseApi urlbaseApi = new UrlbaseApi(moedaOrigem, moedaDestino);
        ConexaoHttp conexaoHttp = new ConexaoHttp();
        return conexaoHttp.responseApi(urlbaseApi.urlCompleta());
    }
}
