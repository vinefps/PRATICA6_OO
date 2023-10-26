package atividade_02;

public class NovoFuncionario {
    public static void main(String[] args) {
        // Criando 5 objetos da classe Funcionario
        Funcionario[] funcionarios = new Funcionario[5];

        funcionarios[0] = new Funcionario("João", "joao@email.com", "123456789", "TI", 4500.0, "2022-01-15", "12345678", true);
        funcionarios[1] = new Funcionario("Maria", "maria@email.com", "987654321", "RH", 4000.0, "2022-02-20", "87654321", true);
        funcionarios[2] = new Funcionario("Pedro", "pedro@email.com", "111222333", "Vendas", 3500.0, "2022-03-10", "11111111", true);
        funcionarios[3] = new Funcionario("Ana", "ana@email.com", "444555666", "Marketing", 4200.0, "2022-04-05", "22222222", true);
        funcionarios[4] = new Funcionario("Lucas", "lucas@email.com", "777888999", "Financeiro", 3800.0, "2022-05-12", "33333333", true);

        // Usando um loop for para imprimir os atributos dos funcionários
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Dados do Funcionário:");
            funcionario.mostrarDados();
            System.out.println();
        }

        Empresa minhaEmpresa = new Empresa("Minha Empresa", "1234567890", 5);

        // Adicionando os funcionários à empresa
        for (Funcionario funcionario : funcionarios) {
            minhaEmpresa.adicionarFuncionario(funcionario);
        }

        // Listando os funcionários da empresa
        minhaEmpresa.listarFuncionarios();
    }

}
