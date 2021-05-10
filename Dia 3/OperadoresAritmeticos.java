public class OperadoresAritmeticos {
    public static void main(String args[]) {
        int num = 130;
        int val = 534;

        int adicao = num + val;
        int subtracao = num - val;
        int multiplicacao = num * val;
        float divisao = num / val;
        int restoDaDivisao = num % val;

        // Operadores de Incremento e Decremento
        int maisUm = 0;
        maisUm += 1;
        maisUm++;
        System.out.println(maisUm);

        int menosUm = 10;
        menosUm -= 1;
        menosUm--;
        System.out.println(menosUm);

        int vezesIgual = 10;
        vezesIgual *= 2;
        System.out.println(vezesIgual);

        int divididoIgual = 10;
        divididoIgual /= 2;
        System.out.println(divididoIgual);

    }
}
