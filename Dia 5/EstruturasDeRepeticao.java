public class EstruturasDeRepeticao {
    public static void main(String args[]) {
        
        int variavelContador = 0;
        char[] frase = {'E','u',' ','s','e','i',' ','u','s','a','r',' ','a','r','r','a','y','s'};
        int[] lista = {1,2,3,4,5,6,7,8,9,10};
        // String frase = "Eu sei usar Strings";

        for (int x = 0; x < 100; x++) {
            System.out.println(x);
        }

        for (int i : lista) {
            System.out.println("Texto");
        }

        variavelContador = 0;
        while (variavelContador < 18) {
            System.out.println(frase[variavelContador]);
            variavelContador++;
        }
        
        do{
            System.out.println("Do-while");
            variavelContador--;
        }while (variavelContador > -20);
        
        


        // Controle de fluxo (break e continue)
        variavelContador = 0;
        while (variavelContador < 500) {
            variavelContador++;
            System.out.println("i");
            if (variavelContador > 10)
                break;
        }

        while (variavelContador > 1) {
            variavelContador--;
            if (variavelContador == 7 || variavelContador == 2)
                continue;
            System.out.println(variavelContador); 
        }

    }
}