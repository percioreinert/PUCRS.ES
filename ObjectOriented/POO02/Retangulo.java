package POO02;

public class Retangulo {

    // VARIÁVEIS DE INSTÂNCIA
    private double base;
    private double altura;

    // MÉTODOS DE INSTÂNCIA

    // Construtor
    public Retangulo(double baseInicial, double alturaInicial) {
        if (baseInicial > 0) {
            base = baseInicial;
        } else base = 1;
        if (alturaInicial > 0) {
            altura = alturaInicial;
        } else altura = 1;
    }

    // Consulta dos valores das variáveis de instância
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    // Modificação dos valores das variáveis de instância
    public void setBase(double novaBase) {
        if (novaBase > 0) {
            base = novaBase;
        }
    }

    public void setAltura(double novaAltura) {
        if (novaAltura > 0) {
            altura = novaAltura;
        }
    }

    // Consulta de todas variáveis de instância
    public String toString() {
        return "Estado atual do retângulo:\nBase: " + base + "\nAltura: " + altura;
    }

    // Área do retânculo
    public double area() {
        return base * altura;
    }

    // Perímetro do retângulo
    public double perimetro() {
        return (base + altura) * 2;
    }

    // Diagonal do retângulo
    public double diagonal() {
        return Math.sqrt((Math.pow(base, 2) + Math.pow(altura, 2)));
    }
}