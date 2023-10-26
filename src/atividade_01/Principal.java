package atividade_01;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        // Solicitar os dados da rede social
        String nomeRedeSocial = JOptionPane.showInputDialog("Digite o nome da Rede Social:");
        String descricaoRedeSocial = JOptionPane.showInputDialog("Digite a descrição da Rede Social:");

        // Criar a rede social
        RedeSocial minhaRedeSocial = new RedeSocial(nomeRedeSocial, descricaoRedeSocial);

        // Solicitar os dados de duas publicações
        String dataPubli1 = JOptionPane.showInputDialog("Digite a data da primeira publicação:");
        String textoPubli1 = JOptionPane.showInputDialog("Digite o texto da primeira publicação:");
        String linkMidia1 = JOptionPane.showInputDialog("Digite o link da primeira publicação:");

        String dataPubli2 = JOptionPane.showInputDialog("Digite a data da segunda publicação:");
        String textoPubli2 = JOptionPane.showInputDialog("Digite o texto da segunda publicação:");
        String linkMidia2 = JOptionPane.showInputDialog("Digite o link da segunda publicação:");

        // Criar objetos de Publicacao


        // Chamar o método para imprimir as publicações
        minhaRedeSocial.imprimePublicacoes();
    }

}
