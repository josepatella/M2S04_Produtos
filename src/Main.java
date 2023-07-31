import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List produtos = new ArrayList<>();

        Scanner s = new Scanner(System.in);

        System.out.println("Digite a quantidade de produtos: ");
        int num = Integer.parseInt(s.nextLine());

        for (int i = 0; i < num; num--) {
            System.out.println("Dados do produto " + (i + 1));
            System.out.println("Comum, usado ou importado(c/u/i)?");
            String escolha = s.nextLine();
            if (escolha == "c") {
                Produto produto1 = new Produto("Notebook", 1100.0);
                produtos.add(produto1);
            } else if (escolha == "u") {
                ProdutoUsado produto2 = new ProdutoUsado("Iphone", 400.0, new Date(15 - 03 - 2017));
                produtos.add(produto2);
            } else if (escolha == "i") {
                ProdutoImportado produto3 = new ProdutoImportado("Tablet", 260.0, 20.0);
                produtos.add(produto3);
            }
        }
        System.out.println("Produtos:");
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println(produtos);
        }
    }
}