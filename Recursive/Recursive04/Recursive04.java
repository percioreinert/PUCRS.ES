package Recursive04;

public class Recursive04 {
    public static String invertR(String troca, int n) {
        if (n < 0) return "";
        char t = troca.charAt(n);
        if (t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u') return invertR(troca, n - 1);
        return invertR(troca, n - 1) + troca.charAt(n);
    }
}
