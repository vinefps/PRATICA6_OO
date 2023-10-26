package atividade_03;

public class Artigo {
    private String titulo;
    private String resumo;
    private String autores;

    // Construtor
    public Artigo(String titulo, String resumo, String autores) {
        this.titulo = titulo;
        this.resumo = resumo;
        this.autores = autores;
    }

    // Métodos getters
    public String getTitulo() {
        return titulo;
    }

    public String getResumo() {
        return resumo;
    }

    public String getAutores() {
        return autores;
    }

    // Métodos setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }
}
