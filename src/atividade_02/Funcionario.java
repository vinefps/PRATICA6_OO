package atividade_02;

public class Funcionario extends Pessoa {
    private String departamento;
    private double salario;
    private String dataEntradaBanco;
    private String rg;
    private boolean ativo;

    public Funcionario(String nome, String email, String telefone, String departamento, double salario, String dataEntradaBanco, String rg, boolean ativo) {
        super(nome, email, telefone);
        this.departamento = departamento;
        this.salario = salario;
        this.dataEntradaBanco = dataEntradaBanco;
        this.rg = rg;
        this.ativo = ativo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataEntradaBanco() {
        return dataEntradaBanco;
    }

    public void setDataEntradaBanco(String dataEntradaBanco) {
        this.dataEntradaBanco = dataEntradaBanco;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    // Método para bonificar o funcionário
    public void bonificar(double valorBonificacao) {
        salario += valorBonificacao;
    }

    // Método para demitir o funcionário
    public void demitir() {
        ativo = false;
    }

    // Método para mostrar os dados do funcionário
    public void mostrarDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Departamento: " + departamento);
        System.out.println("Salário: " + salario);
        System.out.println("Data de Entrada no Banco: " + dataEntradaBanco);
        System.out.println("RG: " + rg);
        System.out.println("Ativo: " + (ativo ? "Sim" : "Não"));
    }
}
