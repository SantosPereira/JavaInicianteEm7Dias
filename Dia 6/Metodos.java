import java.lang.Math;

public class Metodos {

    // Método resolvendo o Teorema de Pitágoras
    static void pitagoras(Double a, Double b) {
        //c² = a² + b²
        Double c = Math.pow(a, 2) + Math.pow(b, 2); //c²
        c = Math.pow(c, 0.5); //raíz quadrada
        System.out.println(c);
    }


    public static void main(String args[]) {
        pitagoras(3.0,4.0);
    }   
}


