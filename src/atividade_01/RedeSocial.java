package atividade_01;

import java.util.ArrayList;

public class RedeSocial {
    private String nome;
    private String descricao;
    private ArrayList<Publicacao> publicacoes;

    // Construtor
    public RedeSocial(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.publicacoes = new ArrayList<>();
    }

    // Método para inserir uma publicação no ArrayList
    public void inserePublicacao(Publicacao publi) {
        publicacoes.add(publi);
    }

    // Método para imprimir as publicações
    public void imprimePublicacoes() {
        System.out.println("Total de publicações: " + Publicacao.getContadorPublicacao());
        System.out.println("Conteúdo das publicações:");
        for (Publicacao publi : publicacoes) {
            System.out.println("Data de Publicação: " + publi.getDataPublicacao());
            System.out.println("Texto da Publicação: " + publi.getTextoPublicacao());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Exemplo de uso
        RedeSocial minhaRedeSocial = new RedeSocial("Minha Rede Social", "Uma rede social fictícia");
        Publicacao publi1 = new Publicacao("2023-10-26", "Primeira publicação", "link1");
        Publicacao publi2 = new Publicacao("2023-10-27", "Segunda publicação", "link2");

        minhaRedeSocial.inserePublicacao(publi1);
        minhaRedeSocial.inserePublicacao(publi2);

        minhaRedeSocial.imprimePublicacoes();
    }
}
