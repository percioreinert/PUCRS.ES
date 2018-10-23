package POO11;

import java.util.Scanner;
public class AppBolinhas {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        BolinhasDeGude ball1 = new BolinhasDeGude(0.40,5000);
        // Entrada de dados
        System.out.println("Informe a opção desejada:\nCriar um novo objeto - 1\nConsultar o preço - 2\nConsultar o estoque - 3" +
                "\nModificar o preço - 4\nModificar o estoque - 5\nConsultar todas informações - 6\nVendas de bolinhas - 7" +
                "\nQuantidade de caixas necessárias - 8\nCusto da venda - 9");
        int choice = in.nextInt();

        switch (choice) {
            case 1: System.out.println("Informe o preço da bolinha: ");
                    double price = in.nextDouble();
                    System.out.println("Informe a quantidade dessa bolinha em estoque: ");
                    int stock = in.nextInt();
                    BolinhasDeGude ball2 = new BolinhasDeGude(price,stock);
                break;
            case 2: System.out.println(ball1.getPrice());
                break;
            case 3: System.out.println(ball1.getStock());
                break;
            case 4: System.out.println("Informe o novo preço: ");
                    double price1 = in.nextDouble();
                    ball1.setPrice(price1);
                break;
            case 5: System.out.println("Informe o valor a ser retirado do estoque: ");
                    int stock1 = in.nextInt();
                    ball1.setStock(stock1);
                break;
            case 6: ball1.toString();
                break;
            case 7: System.out.println("Informe a quantidade de bolinhas vendidas: ");
                    int vendor = in.nextInt();
                    ball1.vendor(vendor);
                break;
            case 8: System.out.println("Informe a quantidade de bolinhas vendidas: ");
                    int vendor1 = in.nextInt();
                    System.out.println(ball1.box(vendor1));
                break;
            case 9: System.out.println("Informe a quantidade de bolinhas vendidas: ");
                    int vendor2 = in.nextInt();
                    System.out.println(ball1.cost(vendor2));
                break;
        }
    }
}
