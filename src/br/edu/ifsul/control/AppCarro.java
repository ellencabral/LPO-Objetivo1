package br.edu.ifsul.control;

import br.edu.ifsul.model.Carro;

import java.util.*;

public class AppCarro {
    public static void main(String[] args) {
        Carro y1 = new Carro(1, "Fiat", "UNO", 2012);
        System.out.println(y1);
        y1.setMarca("Fiat");
        y1.setModelo("UNO");
        y1.setAnoFabricacao(2015);
        System.out.println(" Marca do Carro: " + y1.getMarca() + "\n Modelo do Carro: " + y1.getModelo() + "\n Ano de Fabricacao: " + y1.getAnoFabricacao());

        /*
            Collection List

         */
        List<Carro> carros = new ArrayList<>();
        carros.add(y1);

        Carro y2 = new Carro(2, "Fiat", "UNO", 2014);
        carros.add(y2);

        Carro y3 = new Carro(3, "Fiat", "UNO", 2018);
        carros.add(y3);

        Carro y4 = new Carro(4, "Fiat", "UNO", 2010);
        carros.add(y4);

        Carro y5 = new Carro(5, "Fiat", "UNO", 2019);
        carros.add(y5);

        System.out.println(carros);

        for(int i = 0; i < carros.size(); i++) {
            if(carros.get(i).getId() == 3) {
                System.out.println("Carro com ID = 3 -> " + carros.get(i));
            }
        }

        List<Carro> carrosOrdem = carros;

        Collections.reverse(carrosOrdem);
        System.out.println("Ordem decrescente: " + carrosOrdem);


        /*
            Collection Map
         */

        Map<Integer, Carro> carrosMap = new HashMap<>();

        carrosMap.put(y1.hashCode(), y1);
        carrosMap.put(y2.hashCode(), y2);
        carrosMap.put(y3.hashCode(), y3);
        carrosMap.put(y4.hashCode(), y4);
        carrosMap.put(y5.hashCode(), y5);

        System.out.println("\n\n Map ");
        System.out.println(carrosMap);


        System.out.println("Conta com ID = 3 -> "+carrosMap.get(y3.hashCode()));

    }
}
