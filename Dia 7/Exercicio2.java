import java.util.Scanner;

public class Exercicio2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        String nome = input.next();
        int idade = input.nextInt();

        System.out.println("Olá, "+nome+". Sua idade é "+idade+", certo?");
        
    }
}
