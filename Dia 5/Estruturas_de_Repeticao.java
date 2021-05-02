public class Estruturas_De_Repeticao {
    public static void main(String[] args[]) {
        
        int variavel_contador = 0;
        char[] frase = {'E','u',' ','s','e','i',' ','u','s','a','r',' ','a','r','r','a','y','s'};
        int[] lista = {1,2,3,4,5,6,7,8,9,10};
        // String frase = "Eu sei usar Strings";

        for (int x = 0; x < 100; x++) {
            System.out.println(x);
        }

        for (int i : lista) {
            System.out.println("Texto");
        }

        variavel_contador = 0;
        while (variavel_contador < 150) {
            System.out.println(frase[variavel_contador]);
            variavel_contador++;
        }
        
        do{
            System.out.println("Do-while");
            variavel_contador--;
        }while (variavel_contador > 20);
    }
}