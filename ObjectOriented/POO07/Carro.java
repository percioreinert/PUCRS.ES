package POO07;

/*
Implemente a classe Carro, considerando que todo carro possui placa,
marca, modelo, cor, kilometragem e capacidade do tanque de combustivel.
Considere ainda que este objeto mantém uma quantidade de combustível
em seu tanque e o seu consumo médio (km/litros). Dena os atributos e
implemente os métodos: construtor, modicadores, de acesso e toString
para esta classe. A seguir, implemente também o método
(a) abastecerLitros que é responsável por adicionar mais litros de combustivel
(parâmetro) ao tanque.
(b) abastecerReais que é responsável também por adicionais mais litros
de combustível ao tanque, mas a partir de um valor informado (como
parâmetro) em Reais (R$). Nesse caso, será necessário saber o preço
do litro de combustível para calcular a quantidade de litros que o
carro receberá.
(c) andar que consume combustivel a partir da quantidade (parâmetro)
de km percorrida pelo carro.
(d) capacidadeDeslocamento que dene quantos km o carro pode andar
a partir do combustivel disponível no tanque.
(e) previsaoCombustivel que informa quantos tanques de combustivel
serão necessários para percorrer uma certa distância (informada como
parâmetro em km).
 */
public class Carro {

    // VARIÁVEIS DE INSTÂNCIA
    private String placa, marca, modelo, cor;
    private int kilometragem;
    private double capacidadeTanque;

    // MÉTODOS DE INSTÂNCIA

    // Método construtor
    public Carro(String p, String m, String mod, String c, int km, double capacidade) {
        placa = p;
        marca = m;
        modelo = mod;
        cor = c;
        kilometragem = km;
        capacidadeTanque = capacidade;
    }

    // Consulta dos valores atuais das variáveis de instância
    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getKilometragem() {
        return kilometragem;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    // Modificação dos valores atuais das variáveis de instância
    public void setPlaca(String novaPlaca) {
        placa = novaPlaca;
    }

    public void setMarca(String novaMarca) {
        marca = novaMarca;
    }

    public void setModelo(String novoModelo) {
        modelo = novoModelo;
    }

    public void setCor(String novaCor) {
        cor = novaCor;
    }

    public void setKilometragem(int novaKilometragem) {
        kilometragem = novaKilometragem;
    }

    public void setCapacidadeTanque(double novaCapacidadeTanque) {
        capacidadeTanque = novaCapacidadeTanque;
    }

    // Consulta de todos os valores atuais das variáveis de instância
    public String toString() {
        return "Placa: " + placa + "\nMarca: " + marca + "\nModelo: " + modelo + "\nCor: " + cor + "\nKilometragem: " + kilometragem + "\nCapacidade do tanque: " + capacidadeTanque;
    }


}