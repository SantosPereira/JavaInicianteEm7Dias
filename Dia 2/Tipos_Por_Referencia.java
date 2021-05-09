public class Tipos_Por_Referencia {
    public static void main(String args[]) {

        /*
         * Os tipos por referência, são classes que especificam
         * os tipos de objeto Strings, Arrays Primitivos e Classes.
         */

        
        String Nome = "Pedro";




        // Arrays Primitivos

        int[] numeros = {1,2,3,4,5}; //Array de inteiros
        
        int[] num = new int[5]; //Outra forma de declarar
        num [0] = 1;
        num [1] = 2;
        num [2] = 3;
        num [3] = 4;
        num [4] = 5;

        
        
        float[] NumPontoFlutuante = {8.2f, 4.4f, 5.2f}; //Array de float
        
        float[] NumPF = new float[3];
        NumPF [0] = 1.1f;
        NumPF [1] = 2.2f;
        NumPF [2] = 3.3f;



        // Classes como tipos

        Exemplo ClassesComoTipo = new Exemplo(); //Nesse exemplo a classe está num arquivo
        // na mesma pasta (pacote) por isso não é preciso importar




    }
}
