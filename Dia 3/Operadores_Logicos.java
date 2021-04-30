public class Operadores_Logicos {
    public static void main(String args[]) {
        int Valor1 = 1;
        int Valor2 = 2;

        System.out.println(Valor1 > Valor2 && Valor1 < 0);  //E (and) => &&
        System.out.println(Valor1 > Valor2 || Valor1 < 0);  //Ou (or) => ||
        System.out.println(!(Valor1 < 0));  //Não (not) => !, !()
    }
}
