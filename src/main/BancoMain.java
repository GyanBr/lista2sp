package main;

import model.Cliente;
import model.Conta;
import model.Banco;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class BancoMain {
    public static void main(String[] args) {

        Banco banco = new Banco("banco");

        //banco.abrirConta("123");

        banco.cadastrarCliente("a", "123");


        banco.cadastrarCliente("a", "123-456-789-10");
        banco.cadastrarCliente("c", "1231234");

        banco.realizarSaque("123" ,10);
        banco.abrirConta("123");

        List<Cliente> cliente = banco.getClientes();
        banco.getClientes().forEach(c -> System.out.println(c.toString()));
        banco.realizarDeposito("123", 12);
        banco.realizarSaque("123", 10);
    }
}

