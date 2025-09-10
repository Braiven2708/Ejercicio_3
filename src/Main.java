    import java.util.*;
public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner teclado = new Scanner(System.in);
        int Eleccion;
        do {
            System.out.println("Menu de Opciones");
            System.out.println("1. Dados 2 ");
            System.out.println("2. Dados 3 ");
            System.out.println("3. IMC ");
            System.out.println("4. Pasatiempo");
            System.out.println("5.");
            System.out.println("6. Salir");
            System.out.println("Elige una opcion ");

            Eleccion = teclado.nextInt();
            switch (Eleccion) {
                case 1:
                    System.out.println("Elegiste Dados 2 ");
                    dados2();
                    break;
                case 2:
                    System.out.println("Elegiste Dados 3 ");
                    dados3();
                    break;
                case 3:
                    System.out.println("Elegiste IMC ");
                    IMC();
                    break;
                case 4:
                    System.out.println("Elegiste Pasatiempo ");
                    Pasatiempo();
                    break;
                case 5:
                    System.out.println("Elegiste 5");
                case 6:
                    System.out.println("Saliendo del menu");
                    break;
                default:
                    System.out.println("Opcion invalida. vuelve a intentarlo");
            }
        } while (Eleccion != 6);
        teclado.close();

    }

    public static void dados2() {
        Random aleatorio = new Random();
        int SumaD1 = 0;
        int SumaD2 = 0;
        for (int i = 1; i <= 20; i++) {
            int d1 = aleatorio.nextInt((6 - 1) + 1) + 1;
            int d2 = aleatorio.nextInt((6 - 1) + 1) + 1;
            SumaD1 = SumaD1 + d1;
            SumaD2 = SumaD2 + d2;
            System.out.println("Ronda " + i + ": Dado 1= " + d1 + " | Dado 2=" + d2);
        }

        System.out.println(" Resultado final: ");
        System.out.println("Dado 1= " + SumaD1);
        System.out.println("Dado 2= " + SumaD2);

        if (SumaD1 > SumaD2) {
            System.out.println("Dado 1 es el  Ganador con: " + SumaD1);
        } else if (SumaD2 > SumaD1) {
            System.out.println("Dado 2 es el  Ganador con: " + SumaD2);
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
        Scanner datos = new Scanner(System.in);
        System.out.print("Peso en kg: ");
        double peso = datos.nextDouble();
        System.out.print("Estatura en metros: ");
        double estatura = datos.nextDouble();
        double imc = peso / (estatura * estatura);

        System.out.println("Su IMC es de :" + imc);
        String Situacion;

        if (imc < 18.5) {
            Situacion = "Bajo peso";
        } else if (imc <= 24.9) {
            Situacion = "Peso normal";
        } else if (imc <= 26.9) {
            Situacion = "Sobrepeso grado 1";
        } else if (imc <= 29.9) {
            Situacion = "Sobrepeso grado 2";
        } else if (imc <= 34.9) {
            Situacion = "Obesidad tipo 1";
        } else if (imc <= 39.9) {
            Situacion = "Obesidad tipo 2";
        } else if (imc <= 49.9) {
            Situacion = "Obesidad tipo 3 (morbida)";
        } else {
            Situacion = "Obesidad tipo 4 (extrema)";
        }
        return "Situacion " + Situacion;
    }

    public static void Pasatiempo() {
        Scanner opcion = new Scanner(System.in);
        int Eleccion;
        int categoriaDeporte;
        int tipoDeporte;
        int categoriaArte;
        int categoriaHabilidad;

        do {
            System.out.println("¿Cual es tu pasatiempo favorito?");
            System.out.println("1. Deporte ");
            System.out.println("2. Arte ");
            System.out.println("3. Habilidades ");
            System.out.println("4. Salir");
            System.out.println("Elige una opcion");
            Eleccion = opcion.nextInt();

            switch (Eleccion) {
                case 1:
                    System.out.println("Deporte que buena opcion");
                    System.out.println("¿Qué tipo de deporte te gusta?");
                    System.out.println("1. Individual");
                    System.out.println("2. Colectivo");
                    categoriaDeporte = opcion.nextInt();

                    switch (categoriaDeporte) {
                        case 1:
                            System.out.println("Deportes individuales:");
                            System.out.println("1. Tenis");
                            System.out.println("2. Natación");
                            System.out.println("3. Atletismo");
                            System.out.println("4. Ajedrez");
                            System.out.println("5. Tiro con Arco");
                            System.out.println("6. Ping Pong");
                            tipoDeporte = opcion.nextInt();

                            switch (tipoDeporte) {
                                case 1:
                                    System.out.println("Veo que te gusta el deporte de manera " +
                                                           "individual en especial el tenis!");
                                    break;
                                case 2:
                                    System.out.println("Veo que te gusta el deporte de manera "+
                                                      "individual en especial te gusta la Natación");
                                    break;
                                case 3:
                                    System.out.println("Veo que te gusta el deporte de manera "+
                                                      "individual en especial te gusta el Atletismo");
                                    break;
                                case 4:
                                    System.out.println("Veo que te gusta el deporte de manera "+
                                                       "individual en especial te gusta el Ajedrez");
                                    break;
                                case 5:
                                    System.out.println("Veo que te gusta el deporte de manera "+
                                                    "individual en especial te gusta el Tiro con Arco");
                                    break;
                                case 6:
                                    System.out.println("Veo que te gusta el deporte de manera "+
                                                      "individual en especial te gusta el Ping Pong");
                                    break;
                                default:
                                    System.out.println("Opción inválida.");
                            }
                            break;
                            case 2:
                            System.out.println("Deportes Colectivos:");
                            System.out.println("1. Fútbol");
                            System.out.println("2. Baloncesto");
                            System.out.println("3. Voleibol");
                            System.out.println("3. Hockey");
                            tipoDeporte = opcion.nextInt();

                            switch (tipoDeporte) {
                                case 1:
                                    System.out.println("Veo que te gusta el deporte de manera "+
                                                     "colectiva en especial te gusta el Futbol");
                                    break;
                                case 2:
                                    System.out.println("Veo que te gusta el deporte de manera " +
                                                         " colectiva en especial te gusta el Baloncesto");
                                    break;
                                case 3:
                                    System.out.println("Veo que te gusta el deporte de manera " +
                                                       " colectiva en especial te gusta el Voleibol");
                                    break;
                                case 4:
                                    System.out.println("Veo que te gusta el deporte de manera " +
                                                       " colectiva en especial te gusta el Hockey ");
                                    break;
                                default:
                                    System.out.println("Opción inválida.");
                            }
                            break;
                        default:
                            System.out.println("Opción inválida.");
                    }
                    break;
                case 2:
                    System.out.println("Arte que buena opcion");
                    System.out.println("¿Qué tipo de Arte te gusta?");
                    System.out.println("1. Visual");
                    System.out.println("3. Musica");
                    categoriaArte = opcion.nextInt();
                    switch (categoriaArte) {
                        case 1:
                            System.out.println("Arte Visual:");
                            System.out.println("1. Pintura");
                            System.out.println("2. Dibujo");
                            System.out.println("3. Fotografia");
                            tipoDeporte = opcion.nextInt();

                            switch (tipoDeporte) {
                                case 1:
                                    System.out.println("Veo que te gusta el Arte Visual " +
                                                           "en especial la pintura!");
                                    break;
                                case 2:
                                    System.out.println("Veo que te gusta el Arte Visual "+
                                                    " en especial el dibujo");
                                    break;
                                case 3:
                                    System.out.println("Veo que te gusta el Arte Visual "+
                                                         "en especial la fotografia");
                                    break;
                                default:
                                    System.out.println("Opción inválida.");
                            }
                            break;
                        case 2:
                            System.out.println("Arte Musica:");
                            System.out.println("1. Instrumento");
                            System.out.println("2. Canto");
                            System.out.println("3. Escuchar");
                            tipoDeporte = opcion.nextInt();

                            switch (tipoDeporte) {
                                case 1:
                                    System.out.println("Veo que te gusta el Arte de la musica "+
                                                       " en especial te gustan los instrumentos");
                                    break;
                                case 2:
                                    System.out.println("Veo que te gusta Arte de la musica " +
                                                          " en especial te gusta el canto");
                                    break;
                                case 3:
                                    System.out.println("Veo que te gusta el Arte de la musica " +
                                                         " en especial te gusta escucharla");
                                    break;
                                default:
                                    System.out.println("Opción inválida.");
                            }
                            break;
                        default:
                            System.out.println("Opción inválida.");
                    }
                    break;

                case 3:
                    System.out.println("Habilidades que buena opcion");
                    System.out.println("¿Qué tipo de habilidad tienes?");
                    System.out.println("1. Cocina");
                    System.out.println("2. Idiomas");
                    categoriaHabilidad = opcion.nextInt();

                    switch (categoriaHabilidad) {
                        case 1:
                            System.out.println("Habilidad en cocina:");
                            System.out.println("1. Reposteria");
                            System.out.println("2. Platos Fuertes");
                            System.out.println("3. Aperitivos");
                            System.out.println("4. Emplatado");
                            tipoDeporte = opcion.nextInt();

                            switch (tipoDeporte) {
                                case 1:
                                    System.out.println("Veo que tienes habilidades en la cocina " +
                                                           " en especial en reposteria!");
                                    break;
                                case 2:
                                    System.out.println("Veo que tienes habilidades en la cocina "+
                                                          " en especial los platos fuertes");
                                    break;
                                case 3:
                                    System.out.println("Veo que tienes habilidades en la cocina "+
                                                              " en especial los aperitivos");
                                    break;
                                case 4:
                                    System.out.println("Veo que tienes habilidades en la cocina "+
                                                           " en especial el emplatado");
                                    break;
                                default:
                                    System.out.println("Opción inválida.");
                            }
                            break;
                        case 2:
                            System.out.println("Habilidad en Idiomas:");
                            System.out.println("1. Frances");
                            System.out.println("2. Ingles");
                            System.out.println("3. Aleman");
                            tipoDeporte = opcion.nextInt();

                            switch (tipoDeporte) {
                                case 1:
                                    System.out.println("Veo que tienes habilidades en los idiomas "+
                                                           " en especial el idioma Frances");
                                    break;
                                case 2:
                                    System.out.println("Veo que tienes habilidades en los idiomas " +
                                                          "  en especial el idioma Ingles ");
                                    break;
                                case 3:
                                    System.out.println("Veo que tienes habilidades en los idiomas " +
                                                           "  en especial el idioma Aleman");
                                    break;
                                default:
                                    System.out.println("Opción inválida.");
                            }
                            break;
                        default:
                            System.out.println("Opción inválida.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del menu");
                    break;
                default:
                    System.out.println("Opción inválida. vuelve a intentarlo");
                    }
        } while (Eleccion != 4);
        opcion.close();
    }
}