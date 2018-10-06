package Recursive07;

public class Recursive07 {

    // Método recursivo
    public static double soma(double num) {
        if (num < 2) return 1;
        else return soma(num - 1) + 1.0 / num;
    }
}
