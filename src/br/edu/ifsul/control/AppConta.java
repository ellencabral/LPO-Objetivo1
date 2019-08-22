package br.edu.ifsul.control;

import br.edu.ifsul.model.Conta;

import java.util.*;

public class AppConta {
    public static void main(String[] args) {
        Conta c1 = new Conta(1, 14050.0);
        System.out.println(c1);
        c1.setSaldo(14050.0);
        System.out.println(" Saldo da conta: " + c1.getSaldo());

        c1.deposita(100.0);
        System.out.println(" Saldo depois do deposito: " + c1.getSaldo());

        c1.saca(50.0);
        System.out.println(" Saldo depois do saque: " + c1.getSaldo());

        c1.atualiza(3.0);
        System.out.println(" Saldo atualizado: " + c1.getSaldo());

        /*
            Collection List

         */
        List<Conta> contas = new ArrayList<>();
        contas.add(c1);

        Conta c2 = new Conta(2, 2320.0);
        contas.add(c2);

        Conta c3 = new Conta(3, 10230.03);
        contas.add(c3);

        Conta c4 = new Conta(4, 230209.0);
        contas.add(c4);

        Conta c5 = new Conta(5, 9450.90);
        contas.add(c5);

        System.out.println(contas);

        for(int i = 0; i < contas.size(); i++) {
            if(contas.get(i).getId() == 3) {
                System.out.println("Conta com ID = 3 -> " + contas.get(i));
            }
        }

        List<Conta> contasOrdem = contas;

        Collections.reverse(contasOrdem);
        System.out.println("Ordem decrescente: " + contasOrdem);


        /*
            Collection Map
         */

        Map<Integer, Conta> contasMap = new HashMap<>();

        contasMap.put(c1.hashCode(), c1);
        contasMap.put(c2.hashCode(), c2);
        contasMap.put(c3.hashCode(), c3);
        contasMap.put(c4.hashCode(), c4);
        contasMap.put(c5.hashCode(), c5);

        System.out.println("\n\n Map");
        System.out.println(contasMap);


        System.out.println("Conta com ID = 3 -> "+contasMap.get(c3.hashCode()));

    }
}
