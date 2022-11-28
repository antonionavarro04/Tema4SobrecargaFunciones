package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio1 {
    // ? Método suma int
    static int suma (int num1, int num2) {
        return num1 + num2;
    }

    // ? Método suma double
    static double suma (double num1, double num2) {
        return num1 + num2;
    }

    // ? Método main
    public static void main(String[] args) {
        // ^ Definimos la variable intNum1 y intNum2
        int intNum1;
        int intNum2;

        // ^ Definimos la variable doubleNum1 y doubleNum2
        double doubleNum1;
        double doubleNum2;

        // ^ Definimos la variable read como Scanner y cambiamos su formato a US
        Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos los números al Usuario
        System.out.print("Introduce el primer número: ");
        intNum1 = read.nextInt(); // * Para num1
        System.out.print("Introduce el segundo número: ");
        intNum2 = read.nextInt(); // * Para num2

        // ? Igualamos las variables double a las int
        doubleNum1 = intNum1;
        doubleNum2 = intNum2;

        System.out.println("\n-----------------------------\n");

        // ! Mostramos el resultado
        System.out.println("La suma de los números es: " + suma(intNum1, intNum2));
        System.out.println("La suma de los números es: " + suma(doubleNum1, doubleNum2));

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
