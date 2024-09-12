package main;

import model.Pessoa;

public class PessoaMain {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 100 , "Carpinteiro");
        pessoa.idadeEmBissextos(pessoa.getIdade());
    }
}
