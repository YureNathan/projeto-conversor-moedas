package tech.yure;

public class ConversorApiServico {
    private String apiKey = System.getenv("API_KEY");
    private ConnectionHttp conexao;
    private ConversorJsonParser parser;

    public ConversorApiServico(){
        this.conexao = new ConnectionHttp();
        this.parser = new ConversorJsonParser();
    }

    public TaxaDeConversaoResponse taxaCambio(String moedaOrigem, String moedaDestino){
        String urlBase = "https://v6.exchangerate-api.com/v6/"+apiKey+"/pair/"+moedaOrigem+
                "/"+moedaDestino;
        TaxaDeConversaoResponse taxa = parser.parseTaxaDeConversao(conexao.responseApi(urlBase));
        return taxa;
    }

    public double converter(double valor, String moedaOrigem, String moedaDestino) {
        TaxaDeConversaoResponse taxa = taxaCambio(moedaOrigem, moedaDestino);
        try {
            double resultado = taxa.taxaDeConversao() * valor;
            return resultado;
        } catch (RuntimeException e ) {
            throw new RuntimeException("Erro ao conveter valores.");
        }
    }


}
