package br.edu.ifsul.control;

import br.edu.ifsul.model.Funcionario;

import java.util.*;

public class AppFuncionario {
    public static void main(String[] args) {
        Funcionario z1 = new Funcionario(1, "Joaquim", 1342.85);
        System.out.println(z1);
        z1.setNome("Joaquim");
        System.out.println(" Nome do Funcionario: " + z1.getNome() + "\n Salario do Funcionario: " + z1.getSalario());

        /*
            Collection List

         */
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(z1);

        Funcionario z2 = new Funcionario(2, "Maria", 1003.09);
        funcionarios.add(z2);

        Funcionario z3 = new Funcionario(3, "Luana", 1203.40);
        funcionarios.add(z3);

        Funcionario z4 = new Funcionario(4, "Felipe", 1320.40);
        funcionarios.add(z4);

        Funcionario z5 = new Funcionario(5, "Pablo", 2040.90);
        funcionarios.add(z5);

        System.out.println(funcionarios);

        for(int i = 0; i < funcionarios.size(); i++) {
            if(funcionarios.get(i).getId() == 3) {
                System.out.println("Funcionario com ID = 3 -> " + funcionarios.get(i));
            }
        }

        List<Funcionario> funcionariosOrdem = funcionarios;

        Collections.reverse(funcionariosOrdem);
        System.out.println("Ordem decrescente: " + funcionariosOrdem);


        /*
            Collection Map
         */

        Map<Integer, Funcionario> funcionariosMap = new HashMap<>();

        funcionariosMap.put(z1.hashCode(), z1);
        funcionariosMap.put(z2.hashCode(), z2);
        funcionariosMap.put(z3.hashCode(), z3);
        funcionariosMap.put(z4.hashCode(), z4);
        funcionariosMap.put(z5.hashCode(), z5);

        System.out.println("\n\nMap ");
        System.out.println(funcionariosMap);


        System.out.println("Funcionario com ID = 3 -> "+funcionariosMap.get(z3.hashCode()));

    }
}
