package br.com.kemoel.objetos.bytebak.encapsulamento;

public class TestaEncapsulamento {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 010);
        System.out.println(conta.getNumero());

        Cliente cliente = new Cliente();
        cliente.setNome("Kemoel Miranda");

        conta.setTitular(cliente);

        System.out.println(conta.getTitular().getNome());
        conta.getTitular().setProfissao("Programador");
        System.out.println(conta.getTitular().getProfissao());

        Cliente titularDaConta = conta.getTitular();
        System.out.println(titularDaConta);
        System.out.println(cliente);
        System.out.println(conta.getTitular());
    }
}
