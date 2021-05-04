public class Exercicio1 {

    public static int dias_de_vida(int anos) {
        int dias = anos * 365;
        for (int t = anos; anos != 0; anos--) { //correção: anos bissextos
            if (anos % 4 == 0) {
                dias += 1;
            }
        }
        return dias;
    }

    public static void main(String args[]) {
        int dias = dias_de_vida(18);
        System.out.println(dias);
    }
}
