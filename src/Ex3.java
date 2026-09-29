import java.util.Scanner;

public class Ex3 {
    static void main(String[] args) {
        int numero= -1;
       Scanner leia= new Scanner(System.in);

        while (numero!=-0){
            System.out.println("Digite um número:");
            numero=leia.nextInt();
        }
        System.out.println("Programa encerrado");
        leia.close();
    }
}