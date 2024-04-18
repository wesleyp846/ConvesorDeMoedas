package consultaApi;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaApi {
    private String address = "https://v6.exchangerate-api.com/v6/";
    private String apiKay = "a8727190333dd9ba847ac1e6";
    private String apiKayComplement = "/latest/";

    public ConsultaApi(String coinBase) {
        this.coinBase = coinBase;
    }

    private String coinBase = "";

    public String consulta() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(address+apiKay+apiKayComplement+coinBase))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}