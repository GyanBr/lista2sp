//1. Pessoa
//Crie uma classe que armazene nome, idade e profissão.
// Implemente métodos para calcular a idade em anos bissextos e exibir informações.


package model;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private Integer idade;
    private String profissao;


    public Pessoa(String nome, Integer idade, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    // Implemente métodos para calcular a idade em anos bissextos e exibir informações.

    // ir do ano atual aumentando ate chegar na idade atual, +1 quando for bissexto


    public void idadeEmBissextos( int idade){

        //+1 pq aniversario eh so ano q vem, nao no ano q nasce
        int anoAtual = LocalDate.now().getYear() +1 ;
        int anoTotal = anoAtual + idade;

        int aniversarioBisexto = 0;

        while(anoAtual <= anoTotal) {
            //System.out.println("ano total: " + anoTotal + " ano atual: " + anoAtual);

                if (anoAtual % 4 == 0 && anoAtual % 100 != 0 || anoAtual % 400 == 0) {
                    System.out.println("O ano "+ anoAtual+ " eh bissexto.");
                    aniversarioBisexto ++;
                }
            anoAtual++;

        }

        System.out.println(aniversarioBisexto);
    }
}
