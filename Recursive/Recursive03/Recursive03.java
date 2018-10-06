package Recursive03;

public class Recursive03 {

    // Método iterativo
    public static String invert(String troca) {
        String invert = "";
        for (int i = 0; i < troca.length(); i++) {
            invert = troca.charAt(i) + invert;
        }
        return invert;
    }

    // Método recursivo
    public static String invertR(String troca, int n) {
        if (n < 0) return "";
        return troca.charAt(n) + invertR(troca, n - 1);
    }
}
