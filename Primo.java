import java.util.Scanner;
// Clase para determinar si un número es primo o no
public class Primo {
    public static boolean primo(int n) {
        if (n <= 3) return n > 1; // 0, 1, 2 y 3
        if (n % 2 == 0 || n % 3 == 0) return false; // 4, 6, 8, 9, 10, 12, ...

        // Saltamos de 6 en 6 (todos los primos > 3 son de la forma 6k ± 1)
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
// Método principal para probar la función
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) { // Creamos un objeto Scanner para leer la entrada del usuario
            System.out.print("Introduce un número: "); // Pedimos al usuario que introduzca un número
            int numero = sc.nextInt();
            // Verificamos si el número es primo y mostramos el resultado
            if (primo(numero)) {
                System.out.println(numero + " es un numero primo.");
            } else {
                System.out.println(numero + " no es un numero primo.");
            }
        }
    }
}
