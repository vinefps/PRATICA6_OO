package atividade_03;
import java.util.ArrayList;

public class Objetos {
    public static void main(String[] args) {
        // Criar uma lista de 10 objetos da classe Artigo
        ArrayList<Artigo> artigos = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            Artigo artigo = new Artigo("Título do Artigo " + i, "Resumo do Artigo " + i, "Autor do Artigo " + i);
            artigos.add(artigo);
        }

        // Criar uma edição e adicionar os artigos a ela
        Edicao edicao = new Edicao(1, 2023, "01/01/2023", 1000);

        for (Artigo artigo : artigos) {
            edicao.adicionaArtigo(artigo);
        }

        // Criar uma revista científica e adicionar a edição
        RevistaCientifica revista = new RevistaCientifica("Minha Revista", 1234567890, "Mensal");
        revista.adicionaEdicao(edicao);
    }
}
