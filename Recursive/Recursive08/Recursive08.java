package Recursive08;

public class Recursive08 {

    // Método recursivo
    public static double soma(double num) {
        if (num < 2) return 2;
        else return soma(num - 1) + ((num - 1) * 4 + 2) / num;
    }
}
