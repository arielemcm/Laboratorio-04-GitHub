import java.util.Scanner;

public class Primos {
    public static boolean primo(int n) {
        if (n <= 3) return n > 1;
        if (n % 2 == 0 || n % 3 == 0) return false;

        // Saltamos de 6 en 6 (todos los primos > 3 son de la forma 6k ± 1)
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();

        if (primo(numero)) {
            System.out.println(numero + " es primo.");
        } else {
            System.out.println(numero + " no es primo.");
        }

        sc.close();
    }
}
