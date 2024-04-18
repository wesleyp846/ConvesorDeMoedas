import consultaApi.Convesor;

import java.io.IOException;

public class testeDeConsultaApi {

    public static void main(String[] args) throws IOException, InterruptedException {
        Convesor converte = new Convesor("USD", "BRL", 5.0);
        String resultadoConvert = converte.consulta();
        System.out.println(resultadoConvert);
    }
}
