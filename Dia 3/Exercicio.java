public class Exercicio {
    public static void main(String args[]){
        // Convertendo metro por segundo (m/s) em quilômetro por hora (km/h)
        // EXEMPLO: Velocidade do som
        int metroPorSegundo = 337/1;
        int kmPorHora = metroPorSegundo * 36 / 10;  // A constante de converção é 3.6, porém não tenho conhecimento sobre converção de tipos já que 3.6 é float e metroPorSegundo é int.

        System.out.println(kmPorHora);
    }
}