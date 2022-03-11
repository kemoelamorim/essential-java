package br.com.kemoel.heranca.funcionario;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Gerente();
        funcionario.setNome("Kemoel Miranda");
        funcionario.setCpf("000.000.000-00");
        funcionario.setSalario(2392.12);

        System.out.println("Nome: "+funcionario.getNome());
        System.out.println("CPF: "+funcionario.getCpf());
        System.out.println("Salário: " +funcionario.getSalario());
        System.out.println("Bonificação: "+funcionario.getBonificacao());

    }
}
