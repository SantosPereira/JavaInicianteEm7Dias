public class OperadoresLogicos {
    public static void main(String args[]) {
        int valor1 = 1;
        int valor2 = 2;

        System.out.println(valor1 > valor2 && valor1 < 0);  //E (and) => &&
        System.out.println(valor1 > valor2 || valor1 < 0);  //Ou (or) => ||
        System.out.println(!(valor1 < 0));  //Não (not) => !, !()
    }
}
