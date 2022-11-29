package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio5 {
    // ? Método numerosAleatorios con contador de numeros
    static void numerosAleatorios (int contador) {
        // ! Mediante un bucle for generamos los numeros aleatorios hasta que el contador sea 0
        do{
            System.out.println((Math.random()));
            contador--;
        } while (contador != 0);
    }

    // ? Método numerosAleatorios con contador de numeros y rango maximo
    static void numerosAleatorios (int contador, int max) {
        // ! Mediante un bucle for generamos los numeros aleatorios hasta que el contador sea 0
        do{
            System.out.println(Math.random() * max);
            contador--;
        } while (contador != 0);
    }

    // ? Método numerosAleatorios con contador de numeros, rango maximo y minimo
    static void numerosAleatorios (int contador, int max, int min) {
        // ! Mediante un bucle for generamos los numeros aleatorios hasta que el contador sea 0
        do{
            System.out.println(Math.random() * (max - min) + min);
            contador--;
        } while (contador != 0);
    }

    // ? Método main
    public static void main(String[] args) {
        // ^ Definimos las variables contador, max y min
        int contador;
        int max;
        int min;

        // ^ Definimos la variable read como Scanner y cambiamos su formato a US
        Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos los números al Usuario
        System.out.print("Introduce el número de números aleatorios que quieres: ");
        contador = read.nextInt(); // * Para contador
        System.out.print("Introduce el número máximo: ");
        max = read.nextInt(); // * Para max
        System.out.print("Introduce el número mínimo: ");
        min = read.nextInt(); // * Para min

        // ? Salto de línea triple
        System.out.println("\n<<<<<<----------------->>>>>>\n");

        // ! Mostramos el resultado
        System.out.println("Números aleatorios entre 0 y 1: ");
        numerosAleatorios(contador);

        // ? Salto de línea triple
        System.out.println("\n-----------------------------\n");

        // ! Mostramos el resultado
        System.out.println("Números aleatorios entre 0 y " + max + ":");
        numerosAleatorios(contador, max);

        // ? Salto de línea triple
        System.out.println("\n-----------------------------\n");

        // ! Mostramos el resultado
        System.out.println("Números aleatorios entre " + min + " y " + max + ":");
        numerosAleatorios(contador, max, min);

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
