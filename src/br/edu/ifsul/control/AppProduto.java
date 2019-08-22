package br.edu.ifsul.control;

import br.edu.ifsul.model.Produto;

import java.util.*;

public class AppProduto {
    public static void main(String[] args) {
        Produto x1 = new Produto(1, "Pera", "Saborosa", 5.0,3);
        System.out.println(x1);
        x1.setNome("Banana");
        System.out.println(" Nome do Produto: " + x1.getNome() + "\n Descricao do Produto: " + x1.getDescricao() + "\n Valor do Produto: " + x1.getValor() + "\n Estoque do Produto: " + x1.getEstoque());


        /*
            Collection List

         */
        List<Produto> produtos = new ArrayList<>();

        produtos.add(x1);

        Produto x2 = new Produto(2, "Pera", "Gostosa", 3.5, 3);
        produtos.add(x2);

        Produto x3 = new Produto(3, "Maça", "Vermelha", 2.3, 10);
        produtos.add(x3);

        Produto x4 = new Produto(4, "Laranja", "Redonda", 1.3, 3);
        produtos.add(x4);

        Produto x5 = new Produto(5, "Mexerica", "Feia", 3.2, 4);
        produtos.add(x5);

        System.out.println(produtos);

        for(int i = 0; i < produtos.size(); i++) {
            if(produtos.get(i).getId() == 3) {
                System.out.println("Produto com ID = 3 -> " + produtos.get(i));
            }
        }

        List<Produto> produtosOrdem = produtos;

        Collections.reverse(produtosOrdem);
        System.out.println(produtosOrdem);


         /*
            Collection Map
         */

        Map<Integer, Produto> produtosMap = new HashMap<>();

        produtosMap.put(x1.hashCode(), x1);
        produtosMap.put(x2.hashCode(), x2);
        produtosMap.put(x3.hashCode(), x3);
        produtosMap.put(x4.hashCode(), x4);
        produtosMap.put(x5.hashCode(), x5);

        System.out.println("\n\nMap");
        System.out.println(produtosMap);


        System.out.println("Produto com ID = 3 -> "+produtosMap.get(x3.hashCode()));
    }
}
