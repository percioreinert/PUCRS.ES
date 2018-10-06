package Methods11;

public class Class11 {

    // Método crédito
    public static void credito(double saldo) {
        if (saldo <= 500) System.out.println("Infelizmente você não tem direito a crédito no momento.");
        else if(saldo <= 1500) System.out.println("Você tem direito a 10% de crédito!");
        else if(saldo <= 2500) System.out.println("Você tem direito a 15% de crédito!");
        else if(saldo <= 4000) System.out.println("Você tem direito a 20% de crédito!");
        else System.out.println("Você tem direito a 25% de crédito!");
    }
}
