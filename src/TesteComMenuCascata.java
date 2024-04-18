import consultaApi.ConsultaApi;
import consultaApi.Convesor;

import java.io.IOException;
import java.util.Scanner;

public class TesteComMenuCascata {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("____________________________________________________");
            System.out.println("Digite a opção desejada:");
            System.out.println("1 - Cotação da moeda base");
            System.out.println("2 - Moeda convertida");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    menuMoedaBase(scanner);
                    break;
                case 2:
                    System.out.println("Opção selecionada: Moeda convertida");
                    // Implemente a lógica para a opção Moeda convertida aqui
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, digite novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void menuMoedaBase(Scanner scanner) throws IOException, InterruptedException {
        String moedaBase;
        do {
            System.out.println("Digite a moeda base (3 caracteres) ou '0' para retornar ao menu anterior:");
            moedaBase = scanner.next();

            if (moedaBase.equalsIgnoreCase("0")) {
                return; // Retorna ao menu anterior
            } else if (moedaBase.length() != 3) {
                System.out.println("A moeda base deve ter exatamente 3 caracteres. Siga o padrão 'XXX'");
            } else {
                System.out.println("Moeda base selecionada: " + moedaBase);
                ConsultaApi cons = new ConsultaApi(moedaBase);
                String resultadoConvert = cons.consulta();
                System.out.println(resultadoConvert);
                // Instanciar a outra classe com a moeda base como parâmetro
                // Exemplo: OutraClasse outraClasse = new OutraClasse(moedaBase);
            }
        } while (true);
    }
}