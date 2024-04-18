import consultaApi.ConsultaApi;

import java.io.IOException;

public class testeDeConsultaApi {
    public static void main(String[] args) throws IOException, InterruptedException {
        ConsultaApi consultaDollar = new ConsultaApi("USD");
        String resultado = consultaDollar.consulta();
        System.out.println(resultado);

    }
}
