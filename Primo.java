import java.util.Scanner;

public class Primo {

    // Método para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false; // 0, 1 y negativos no son primos
        }
        if (numero == 2) {
            return true; // 2 es el único número par primo
        }
        if (numero % 2 == 0) {
            return false; // descarta pares mayores que 2
        }
        // Solo verificamos hasta la raíz cuadrada del número
        int limite = (int) Math.sqrt(numero);
        for (int i = 3; i <= limite; i += 2) {
            if (numero % i == 0) {
                return false; // tiene un divisor
            }
        }
        return true; // no se encontraron divisores
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        if (!sc.hasNextInt()) {
            System.out.println("Entrada inválida. Debe ingresar un número entero.");
            sc.close();
            return;
        }

        int num = sc.nextInt();
        sc.close();

        if (esPrimo(num)) {
            System.out.println(num + " es un número primo.");
        } else {
            System.out.println(num + " NO es un número primo.");
        }
    }
}
