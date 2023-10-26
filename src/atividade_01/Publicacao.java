package atividade_01;

public class Publicacao {
    private String dataPublicacao;
    private String textoPublicacao;
    private String linkMidia;
    public static double contadorPublicacao;

    // Construtor
    public Publicacao(String dataPublicacao, String textoPublicacao, String linkMidia) {
        this.dataPublicacao = dataPublicacao;
        this.textoPublicacao = textoPublicacao;
        this.linkMidia = linkMidia;
        contadorPublicacao++; // Incrementa o contador ao criar um objeto
    }

    // Métodos getters
    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public String getTextoPublicacao() {
        return textoPublicacao;
    }

    public String getLinkMidia() {
        return linkMidia;
    }

    public static double getContadorPublicacao() {
        return contadorPublicacao;
    }

    // Métodos setters
    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public void setTextoPublicacao(String textoPublicacao) {
        this.textoPublicacao = textoPublicacao;
    }

    public void setLinkMidia(String linkMidia) {
        this.linkMidia = linkMidia;
    }
}
