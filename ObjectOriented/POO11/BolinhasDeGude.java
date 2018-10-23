package POO11;

public class BolinhasDeGude {

    // VARIÁVEIS DE INSTÂNCIA
    private double price;
    private int stock;

    // MÉTODOS DE INSTÂNCIA

    /**
     * Método construtor
     *
     * @param price Indica o preço de cada bolinha desse objeto
     * @param stock Indica a quantidade de bolinhas em estoque
     */
    public BolinhasDeGude(double price, int stock) {
        if (price > 0) this.price = price;
        else this.price = 1;
        if (stock > 0) this.stock = stock;
        else this.stock = 1;
    }

    /**
     * Retorna o valor atual da variável de instância 'price'
     */
    public double getPrice() {
        return price;
    }

    /**
     * Retorna o valor atual da variável de instância 'stock'
     */
    public int getStock() {
        return stock;
    }

    /**
     * Modifica o valor atual da variável de instância 'price'
     */
    public void setPrice(double newPrice) {
        if (newPrice > 0) price = newPrice;
    }

    /**
     * Modifica o valor atual da variável de instância 'stock'
     */
    public void setStock(int newStock) {
        if (newStock > 0) stock = newStock;
    }

    /**
     * Retorna todos os valores atuais do objeto, com formatação
     */
    public String toString() {
        return "Preço: " + price + "\nEstoque: " + stock;
    }

    /**
     * Método vendedor: retira a quantidade de bolinhas vendidas do estoque
     *
     * @param sell indica a quantidade de bolinhas vendidas
     */
    public void vendor(int sell) {
        if (stock - sell >= 0) stock -= sell;
        else System.out.println("Estoque insuficiente para atender a essa demanda!");
    }

    /**
     * Método caixas: calcula a quantidade de caixas (com espaço para 150 bolinhas) necessárias para embalar todas que foram vendidas
     *
     * @param sell indica a quantidade de bolinhas vendidas
     */
    public int box(int sell) {
        if (sell == 150) return 1;
            if (sell < 150) return 1;
            else return sell / 150 + 1;
    }

    /**
     * Método custo: calcula o valor de venda, com base na quantidade de bolinhas vendidas
     *
     * @param sell indica a quantidade de bolinhas vendidas
     */
    public double cost(int sell) {
        int percent = sell / 1000;
        if (sell < 1000) return sell * price;
        else return sell * price * (1.0 - percent * 0.05);
    }
}
