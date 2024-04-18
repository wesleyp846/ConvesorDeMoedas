import java.util.Scanner;

public class TesteComMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Digite a opção desejada:");
            System.out.println("0 - Sair");
            System.out.println("1 - Moeda base");
            System.out.println("2 - Moeda convertida");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    System.out.println("Opção selecionada: Moeda base");
                    // Implemente a lógica para a opção Moeda base aqui
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
}