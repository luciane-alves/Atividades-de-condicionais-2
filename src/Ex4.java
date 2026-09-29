import java.util.Scanner;

public class Ex4 {
    static void main(String[] args) {
        int senha=0;
        Scanner Scanner = new Scanner(System.in);
        while (senha != 2025) {
            System.out.println("Digite sua senha");
            senha = Scanner.nextInt();

        }
        System.out.println("Acesso liberado!");
        Scanner.close();
    }

    }

