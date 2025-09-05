    import java.util.*;
    public class Main {
        public static void main(String[] args) {
        Random aleatorio= new Random ();
        int SumaD1 = 0;
        int SumaD2 = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.println("Ronda = " + i);
            int d1= aleatorio.nextInt((6-1)+1)+1;
            int d2= aleatorio.nextInt((6-1)+1)+1;

            System.out.println( "ronda" +i+ " Dado 1: " +d1+ "Dado2" +d2);
        }

        System.out.println(" Resultado final: " );
        System.out.println("Dado 1 " +SumaD1);
        System.out.println("Dado 2" +SumaD2);

    }
}
