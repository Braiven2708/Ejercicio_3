import java.util.*;
public class Main {
    public static void main(String[] args) {
        //teclado
        Scanner teclado = new Scanner(System.in);
        int n1, n2, suma;
        System.out.println(" Digita el primer numero");
        n1 = teclado.nextInt();
        System.out.println(" Digita el segundo numero");
        n2 = teclado.nextInt();
        suma = n1 + n2;
        System.out.println("La suma es:" + suma);

        //aleatorio


        Random aleatorio = new Random();
        int a, b, z;
        System.out.println("Numero generado");
        a = aleatorio.nextInt(51);
        System.out.println(a);
        System.out.println("segundo numero");
        b = aleatorio.nextInt((30 - 5) + 1) + 5;
        System.out.println(b);
        z = a + b;

        System.out.println("La suma es:" + z);
    }

}
