    import java.util.*;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int sumad1 = 0;
        int sumad2 = 0;
        int sumad3 = 0;

        // Numero de rondas
        for (int i = 1; i <= 20; i++) {
            int d1 = random.nextInt((6-1)+1)+1;
            int d2 = random.nextInt((6-1)+1)+1;
            int d3 = random.nextInt((6-1)+1)+1;

            sumad1 += d1;
            sumad2 += d2;
            sumad3 += d3;

            System.out.println("Ronda " +i+ ": Dado 1 = " +d1+ " ¬ Dado 2 = " +d2+ " ¬ Dado 3 = " +d3);

        }

        // Mostrar resultados finales
        System.out.println("Resultados:");
        System.out.println("Dado 1: " +sumad1);
        System.out.println("Dado 2: " +sumad2);
        System.out.println("Dado 3: " +sumad3);

        // Declarar posiciones
        String primero = " ";
        String segundo = " ";
        String tercero = " ";

        if (sumad1 >= sumad2 && sumad1 >= sumad3) {
            primero = "Dado 1 (" + sumad1 + ")";
            if (sumad2 >= sumad3) {
                segundo = "Dado 2 (" + sumad2 + ")";
                tercero = "Dado 3 (" + sumad3 + ")";
            } else {
                segundo = "Dado 3 (" + sumad3 + ")";
                tercero = "Dado 2 (" + sumad2 + ")";
            }
        } else if (sumad2 >= sumad1 && sumad2 >= sumad3) {
            primero = "Dado 2 (" + sumad2 + ")";
            if (sumad1 >= sumad3) {
                segundo = "Dado 1 (" + sumad1 + ")";
                tercero = "Dado 3 (" + sumad3 + ")";
            } else {
                segundo = "Dado 3 (" + sumad3 + ")";
                tercero = "Dado 1 (" + sumad1 + ")";
            }
        } else {
            primero = "Dado 3 (" + sumad3 + ")";
            if (sumad1 >= sumad2) {
                segundo = "Dado 1 (" + sumad1 + ")";
                tercero = "Dado 2 (" + sumad2 + ")";
            } else {
                segundo = "Dado 2 (" + sumad2 + ")";
                tercero = "Dado 1 (" + sumad1 + ")";
            }
        }

        // Imprimir Posiciones
        System.out.println("Tabla de posiciones: ");
        System.out.println("1 lugar: " + primero);
        System.out.println("2 lugar: " + segundo);
        System.out.println("3 lugar: " + tercero);

        }
    }