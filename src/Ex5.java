import java.util.Scanner;

public class Ex5 {
    static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
       String opcao;
        do {
            System.out.println("Menu");
            System.out.println("1-Ver saldo");
            System.out.println("2-Fazer depósito");
            System.out.println("3-Sair");
            System.out.println("Escolha uma opção");
            opcao = Scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("1-Exibir saldo");
                    break;
                case "2":
                    System.out.println("2-Fazer depósito");
                    break;
                case "3":
                    System.out.println("3-Sair");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (!opcao.equals("3"));

        System.out.println("Programa encerrado");
        }
    }



