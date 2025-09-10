    import java.util.*;
public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner teclado = new Scanner(System.in);
        int Eleccion;

    }

    public static void dados2() {
        Random aleatorio = new Random();
        int SumaD1 = 0;
        int SumaD2 = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.println("Ronda = " + i);
            int d1 = aleatorio.nextInt((6 - 1) + 1) + 1;
            int d2 = aleatorio.nextInt((6 - 1) + 1) + 1;

            System.out.println("ronda" + i + " Dado 1: " + d1 + "Dado2" + d2);
        }

        System.out.println(" Resultado final: ");
        System.out.println("Dado 1 " + SumaD1);
        System.out.println("Dado 2" + SumaD2);

        if (SumaD1 > SumaD2) {
            System.out.println("La suma es " + SumaD1);
            System.out.println("La suma es " + SumaD2);
        } else if (SumaD2 > SumaD1) {
            System.out.println("Dado 2: " + SumaD2);
            System.out.println("Dado 1: " + SumaD1);
        } else {
            System.out.println("Empate");
        }
    }

    public static void dados3() {
        Random random = new Random();
        int sumad1 = 0;
        int sumad2 = 0;
        int sumad3 = 0;

        // Numero de rondas
        for (int i = 1; i <= 20; i++) {
            int d1 = random.nextInt((6 - 1) + 1) + 1;
            int d2 = random.nextInt((6 - 1) + 1) + 1;
            int d3 = random.nextInt((6 - 1) + 1) + 1;

            sumad1 += d1;
            sumad2 += d2;
            sumad3 += d3;

            System.out.println("Ronda " + i + ": Dado 1 = " + d1 + " ¬ Dado 2 = " + d2 + " ¬ Dado 3 = " + d3);

        }
        // Mostrar resultados finales
        System.out.println("Resultados:");
        System.out.println("Dado 1: " + sumad1);
        System.out.println("Dado 2: " + sumad2);
        System.out.println("Dado 3: " + sumad3);

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

    public static String IMC() {
        Scanner sc = new Scanner(System.in);
        double peso, estatura, imc;

        System.out.print("Peso en kg: ");
        peso = sc.nextDouble();

        System.out.print("Estatura en metros: ");
        estatura = sc.nextDouble();

        if (estatura == 0) {
            System.out.println("Error: la estatura no puede ser 0.");
        }

        imc = peso / (estatura * estatura);

        System.out.printf("IMC = %.1f", imc);

        if (imc < 18.5) {
            System.out.println("Situacion: Bajo peso");
        } else if (imc >= 24.9) {
            System.out.println("Situacion: Peso normal");
        } else if (imc <= 26.9) {
            System.out.println("Situacion: Sobrepeso grado 1");
        } else if (imc <= 29.9) {
            System.out.println("Situacion: Sobrepeso grado 2");
        } else if (imc <= 34.9) {
            System.out.println("Situacion: Obesidad tipo 1");
        } else if (imc <= 39.9) {
            System.out.println("Situacion: Obesidad tipo 2");
        } else if (imc <= 49.9) {
            System.out.println("Situacion: Obesidad tipo 3 (morbida)");
        } else {
            System.out.println("Situacion: Obesidad tipo 4 (extrema)");
        }
    }
}
