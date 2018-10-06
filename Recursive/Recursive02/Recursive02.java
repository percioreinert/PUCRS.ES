package Recursive02;

public class Recursive02 {

    // Método recursivo
    public static int soma(int num) {
        if (num < 2) return 1;
        else return soma(num - 1) + num;
    }
}
