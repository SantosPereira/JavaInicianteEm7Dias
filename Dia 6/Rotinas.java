import java.lang.Math;

public class Rotinas {

    // Procedimento resolvendo o Teorema de Pitágoras
    // Para ser um Método precisaria retornar um valor ("void" é o tipo de retorno, no caso vazio)
    static void pitagoras(Double a, Double b) {
        //c² = a² + b²
        Double c = Math.pow(a, 2) + Math.pow(b, 2); //c²
        c = Math.pow(c, 0.5); //raíz quadrada
        System.out.println(c);
    }


    // Método
    // A diferença de um procedimento para um método é que um procedimento é estabelecido com tipo "void"
    // e um método é definido com um outro tipo qualquer, além disso retorna valor
    static int fibonacci(int tamanho) {
        int x = 1;
        int y = 1;
        for (int t = tamanho - 2; t > 0; t--) {
        // "tamanho - 2" é uma correção, já que a operação inevitavelmente
        // inícia com duas variáveis de valor int 1
            x = x + y; //valor_atual + valor_anterior = novo_valor_atual
            y = x - y; //valor_atual - antigo_valor_anterior = novo_valor_anterior
        }
        return x;
    }



    public static void main(String args[]) {
        pitagoras(3.0,4.0);
        int fibo = fibonacci(8);
        System.out.println(fibo);
    }   
}


