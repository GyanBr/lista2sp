//2. Banco
//Implemente uma classe que represente uma instituição financeira,
// com métodos para cadastrar clientes, abrir contas e realizar operações financeiras.

package model;

public class Cliente {
    private String nomeCliente;
    private String cpfCliente;

    public Cliente(String nomeCliente, String cpfCliente) {
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    @Override
    public String toString() {
        return "Nome do cliente: " + nomeCliente + ", CPF: " + cpfCliente + "." ;
    }
}
