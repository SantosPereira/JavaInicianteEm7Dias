public class Operadores_Aritmeticos {
    public static void main(String args[]) {
        int num = 130;
        int val = 534;

        int adicao = num + val;
        int subtracao = num - val;
        int multiplicacao = num * val;
        float divisao = num / val;
        int resto_da_divisao = num % val;

        // Operadores de Incremento e Decremento
        int mais_um = 0;
        mais_um += 1;
        mais_um++;
        System.out.println(mais_um);

        int menos_um = 10;
        menos_um -= 1;
        menos_um--;
        System.out.println(menos_um);

        int vezes_igual = 10;
        vezes_igual *= 2;
        System.out.println(vezes_igual);

        int dividido_igual = 10;
        dividido_igual /= 2;
        System.out.println(dividido_igual);

    }
}
