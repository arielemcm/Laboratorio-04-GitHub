public static boolean esPrimoOptimizado(int n) {
    if (n <= 3) return n > 1;
    if (n % 2 == 0 || n % 3 == 0) return false;

    // Saltamos de 6 en 6 (todos los primos > 3 son de la forma 6k ± 1)
    for (int i = 5; i * i <= n; i += 6) {
        if (n % i == 0 || n % (i + 2) == 0) return false;
    }
    return true;
}
