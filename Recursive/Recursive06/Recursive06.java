package Recursive06;

public class Recursive06 {

    // Método recursivo
    public static int fibo(int num) {
        if (num <= 2) return 1;
        else return fibo(num - 1) + fibo(num - 2);
    }
}
