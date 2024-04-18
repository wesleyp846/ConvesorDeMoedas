package consultaApi;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ChaveApi {
    public static String lerChaveAPI() {
        StringBuilder chaveAPI = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\avent\\Desktop\\Oracle\\ConvesorDeMoedas\\src\\chave-api.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                chaveAPI.append(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return chaveAPI.toString();
    }
}