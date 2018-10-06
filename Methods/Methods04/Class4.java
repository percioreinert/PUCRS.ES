package Methods04;

public class Class4 {

    // Método conversão para segundos
    public static int segundos(int hora, int minuto, int segundo) {
        int total = hora * 3600 + minuto * 60 + segundo;
        return total;
    }
}
