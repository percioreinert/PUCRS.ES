package Methods08;

public class Class8 {

    // Método inversão
    public static int [] invert(int num) {
        int inversao[] = new int [4];
        int j = 3;
        int resto = num;
        for (int i = 0; i < 4; i++) {
            int inv = resto / (int) Math.pow(10, j);
            resto = resto % (int) Math.pow(10, j);
            inversao[j] = inv;
            j--;
        }
        return inversao;
    }
}
