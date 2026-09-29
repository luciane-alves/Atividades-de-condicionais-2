import java.util.Scanner;

public class Ex6 {
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String resposta;
        do{
            System.out.println("Deseja fazer um novo pedido?");
            resposta=scanner.nextLine();


        }while (resposta.equalsIgnoreCase("S"));
        System.out.println("Programa encerrado");
        scanner.close();
    }
}
