package atividade_02;

public class Empresa {
    private String nome;
    private String cnpj;
    private int qtdeDeFuncionarios;
    private Funcionario[] funcionarios;

    public Empresa(String nome, String cnpj, int qtdeDeFuncionarios) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.qtdeDeFuncionarios = qtdeDeFuncionarios;
        this.funcionarios = new Funcionario[100]; // Criar um array de até 100 funcionários
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getQtdeDeFuncionarios() {
        return qtdeDeFuncionarios;
    }

    public void setQtdeDeFuncionarios(int qtdeDeFuncionarios) {
        this.qtdeDeFuncionarios = qtdeDeFuncionarios;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        if (qtdeDeFuncionarios < 100) {
            funcionarios[qtdeDeFuncionarios] = funcionario;
            qtdeDeFuncionarios++;
        } else {
            System.out.println("Limite de funcionários atingido");
        }
    }

    public void listarFuncionarios() {
        System.out.println("Funcionários da empresa " + nome + ":");
        for (int i = 0; i < qtdeDeFuncionarios; i++) {
            System.out.println("Nome: " + funcionarios[i].getNome() + " | Departamento: " + funcionarios[i].getDepartamento());
        }
    }
}
