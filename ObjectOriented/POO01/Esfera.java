package POO01;

public class Esfera {

    // Variável de instância.
    private double raio;

    // Métodos de instância.
    public Esfera(double raioInicial) { // Método construtor
        if (raioInicial > 0) {
            raio = raioInicial;
        } else raio = 1;
    }

    // Consulta do valor atual da variável de instância 'raio'.
    public double getRaio() {
        return raio;
    }

    // Modificação do valor da variável de instância 'raio'.
    public void setRaio(double novoRaio) {
        if (novoRaio > 0) {
            raio = novoRaio;
        }
    }

    // Gera uma String com o estado atual do objeto (valores atuais dos atributos)
    public String toString() {
        return "O raio atual é : " + raio;
    }

    // Volume da esfera
    public double volume() {
        return 4.0 / 3.0 * Math.PI * Math.pow(raio, 3);
    }

    // Área da esfera
    public double area() {
        return 4 * Math.PI * Math.pow(raio, 2);
    }
}
