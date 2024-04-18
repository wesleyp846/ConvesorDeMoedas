package consultaApi;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Convesor {
    private String address = "https://v6.exchangerate-api.com/v6/";
    private String apiKay = "a8727190333dd9ba847ac1e6";
    private String apiKayComplement = "/pair/";
    private String coinBase = "";
    private String coinConvert = "";
    private double value = 0;

    public Convesor(String coinBase, String coinConvert, double value) {
        this.coinBase = coinBase;
        this.coinConvert = coinConvert;
        this.value = value;
    }

    public String consulta() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(address+apiKay+apiKayComplement+coinBase+"/"+coinConvert+"/"+value))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}
