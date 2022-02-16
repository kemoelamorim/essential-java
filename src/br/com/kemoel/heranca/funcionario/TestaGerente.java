package br.com.kemoel.heranca.funcionario;


public class TestaGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();

        gerente.setNome("Douglas");
        gerente.setSalario(5000.00);
        gerente.setCpf("222.222.222-22");
        gerente.setSenha(1234);
        boolean autenticou = gerente.autentica(1234);

        System.out.println("Nome do gerente: " + gerente.getNome());
        System.out.println("CPF do gerente: " + gerente.getCpf());
        System.out.println("Salário do gerente: " + gerente.getSalario());
        System.out.println("Bonificação do gerente: " + gerente.getBonificacao());
        System.out.println("Autenticado: " + autenticou);
    }
}
