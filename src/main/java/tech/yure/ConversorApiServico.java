package tech.yure;

public class ConversorApiServico {
    private final String apiKey = System.getenv("API_KEY");
    private final ConnectionHttp conexao;
    private final ConversorJsonParser parser;


    public ConversorApiServico() {
        this.conexao = new ConnectionHttp();
        this.parser = new ConversorJsonParser();
    }

    public TaxaDeConversaoResponse taxaCambio(String moedaOrigem, String moedaDestino) {
        String urlBase = "https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + moedaOrigem +
                "/" + moedaDestino;
        return parser.parseTaxaDeConversao(conexao.responseApi(urlBase));
    }

    public double converter(double valor, String moedaOrigem, String moedaDestino) {
        TaxaDeConversaoResponse taxa = taxaCambio(moedaOrigem, moedaDestino);
        try {
            return taxa.taxaDeConversao() * valor;
        } catch (RuntimeException e) {
            throw new RuntimeException("Erro ao conveter valores.");
        }
    }
}
