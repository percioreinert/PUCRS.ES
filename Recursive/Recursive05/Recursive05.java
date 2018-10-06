package Recursive05;

public class Recursive05 {

    // Método recursivo
    public static int counter(String texto, int position) {
        if (position < 0) return 0;
        if (texto.charAt(position) == 'a' || texto.charAt(position) == 'A') {
            return 1 + counter(texto, position - 1);
        }
        return counter(texto, position - 1);
    }

    // Método auxiliar
    public static int stringLength(String texto) {
        return counter(texto, texto.length() - 1);
    }
}
