package POO08;

public class Conta {

    // VARIÁVEIS DE INSTÂNCIA
    private String accountNumber;
    private double accountBalance;

    // MÉTODOS DE INSTÂNCIA

    // Construtor
    public Conta(String accountNumber1) {
        if (accountTest(accountNumber1)) {
            accountNumber = accountNumber1;
        } else accountNumber = "001";
        accountBalance = 0;
    }

    // Teste do número da conta
    private boolean accountTest(String accountNumber2) {
        if (accountNumber2.length() == 3) {
            if(!accountNumber2.equals("000")) {
                for (int i = 0; i < 3; i++) {
                    if (!Character.isDigit(accountNumber2.charAt(i))) {
                        System.out.println("O número da conta deve ser formado apenas por dígitos.");
                        return false;
                    }
                }
            } else System.out.println("O número da conta deve ser diferente de \'000\'.");
        }
        return true;
    }

    // Consulta dos valores atuais das variáveis de instância
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    // Consulta de todos os valores atuais das variáveis de instância
    public String toString() {
        return "Número da conta: " + accountNumber + "\nSaldo atual da conta: " + accountBalance;
    }

    // Dígito verificador
    public char digit(String accountNumber) {
        String aux = "";
        for (int i = 2; i >= 0; i--) {
            aux += accountNumber.charAt(i);
        }
        int account = Integer.parseInt(accountNumber);
        int inversion = Integer.parseInt(aux);
        int soma = account + inversion;
        String soma1 = Integer.toString(soma);
        int [] digits = new int[3];
        soma = 0;
        for (int i = 0; i < 3; i++) {
            digits[i] = Character.getNumericValue(soma1.charAt(i));
            digits[i] = digits[i] * (i + 1);
            soma += digits[i];
        }
        soma1 = Integer.toString(soma);
        int length = soma1.length();
        char digit = soma1.charAt(length - 1);
        return digit;
    }
}
