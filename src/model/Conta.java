//2. Banco
//Implemente uma classe que represente uma instituição financeira,
// com métodos para cadastrar clientes, abrir contas e realizar operações financeiras.

package model;

public class Conta{
    private int numeroConta;
    private double saldo;
    private Cliente cliente;

    public Conta(int numeroConta, double saldo, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void sacar(double valor) {
        saldo -= valor;
        System.out.println("Saque realizado. Saldo atual: " + saldo);

    }
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Deposito realizado. Saldo atual: " + saldo);
    }
}
