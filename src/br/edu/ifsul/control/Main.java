package br.edu.ifsul.control;

import br.edu.ifsul.model.Carro;
import br.edu.ifsul.model.Conta;
import br.edu.ifsul.model.Funcionario;
import br.edu.ifsul.model.Produto;

public class Main {

    public static void main(String[] args) {
        Produto x = new Produto("Pera", "Saborosa", 5.0,3);
        System.out.println(x);
        x.setNome("Banana");
        System.out.println(" Nome do Produto: " + x.getNome() + "\n Descricao do Produto: " + x.getDescricao() + "\n Valor do Produto: " + x.getValor() + "\n Estoque do Produto: " + x.getEstoque());

        Carro y = new Carro("Fiat", "UNO", 2012);
        System.out.println(y);
        y.setMarca("Fiat");
        y.setModelo("UNO");
        y.setAnoFabricacao(2015);
        System.out.println(" Marca do Carro: " + y.getMarca() + "\n Modelo do Carro: " + y.getModelo() + "\n Ano de Fabricacao: " + y.getAnoFabricacao());

        Funcionario z = new Funcionario("Joaquim", 1342.85);
        System.out.println(z);
        z.setNome("Joaquim");
        System.out.println(" Nome do Funcionario: " + z.getNome() + "\n Salario do Funcionario: " + z.getSalario());

        Conta c = new Conta(14050.0);
        System.out.println(c);
        c.setSaldo(14050.0);
        System.out.println(" Saldo da conta: " + c.getSaldo());

        c.deposita(100.0);
        System.out.println(" Saldo depois do deposito: " + c.getSaldo());

        c.saca(50.0);
        System.out.println(" Saldo depois do saque: " + c.getSaldo());

        c.atualiza(3.0);
        System.out.println(" Saldo atualizado: " + c.getSaldo());
    }
}
