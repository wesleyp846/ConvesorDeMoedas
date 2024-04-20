package converter;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha a moeda que deseja converter");
        String moedaBAse = scanner.nextLine();
        System.out.println("Escolha a moeda para converção");
        String moedaConvertida = scanner.nextLine();
        System.out.println("Escolha o valor a converter");
        double valor = scanner.nextDouble();

        String busca = "https://v6.exchangerate-api.com/v6/a8727190333dd9ba847ac1e6/pair/"
                + moedaBAse.toUpperCase() + "/"
                + moedaConvertida.toUpperCase() + "/"
                + valor;

        Requests novabusca = new Requests(busca);
        String buscaNova = novabusca.consulta();

        Gson gson = new Gson();
        Conversao conversao = gson.fromJson(buscaNova, Conversao.class);

        System.out.println("#########################################################");
        System.out.println(conversao.toString());
        System.out.println("#########################################################");
    }
}