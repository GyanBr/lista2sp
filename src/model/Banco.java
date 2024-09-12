package model;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Cliente> clientes;
    private List<Conta> contas;

    // Construtor para inicializar as listas
    public Banco(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
        this.contas = new ArrayList<>();
    }

    // Método para encontrar um cliente pelo CPF
    private Cliente encontrarCliente(String cpfCliente) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpfCliente().equals(cpfCliente)) {
                return cliente;
            }
        }
        return null;  // Retorna null se o cliente não for encontrado
    }

    public void cadastrarCliente(String nome, String cpf) {
        Cliente cliente = new Cliente(nome, cpf);
        clientes.add(cliente);
        System.out.println("Cliente cadastrado: " + cliente.getNomeCliente());
    }

    public void abrirConta(String cpfCliente) {
        Cliente cliente = encontrarCliente(cpfCliente);
        if (cliente != null) {
            int numeroConta = gerarNumeroConta();  // Gera um número de conta único
            Conta conta = new Conta(numeroConta, 0.0, cliente);
            contas.add(conta);
            System.out.println("Conta aberta para: " + cliente.getNomeCliente());
        } else {
            System.out.println("Cliente não encontrado com o CPF: " + cpfCliente);
        }
    }

    private Conta encontrarConta(String cpf) {
        for (Conta conta : contas) {
            if (conta.getCliente().getCpfCliente().equals(cpf)) {
                return conta;
            }
        }
        return null;
    }

    public void realizarDeposito(String cpf, double valor) {
        Conta conta = encontrarConta(cpf);
        if (conta != null) {
            conta.depositar(valor);
        } else {
            System.out.println("Conta não encontrada para o CPF: " + cpf);
        }
    }

    public void realizarSaque(String cpf, double valor) {
        Conta conta = encontrarConta(cpf);
        if (conta != null) {
            conta.sacar(valor);
        } else {
            System.out.println("Conta não encontrada para o CPF: " + cpf);
        }
    }

    // Método auxiliar para gerar um número de conta único
    private int gerarNumeroConta() {
        return contas.size() + 1;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
