package br.edu.ifsul.model;

public class Conta {
    private double saldo;

    public Conta(){
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void saca(double valor) {
        if (this.saldo > 0 && this.saldo >= valor) {
            this.saldo -= valor;
        }
    }

    public void atualiza(double taxa) {
        this.saldo += (this.saldo * (taxa/100) );
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                '}';
    }
}
