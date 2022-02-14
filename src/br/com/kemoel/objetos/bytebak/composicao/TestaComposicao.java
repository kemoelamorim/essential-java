package br.com.kemoel.objetos.bytebak.composicao;

public class TestaComposicao {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nome = "Kemoel Miranda";
        cliente.cpf = "98420349403";
        cliente.profissao = "Programador";

        Conta conta = new Conta();
        conta.deposita(150);
        conta.titular = cliente;
        System.out.println(conta.titular.nome);
        System.out.println(conta.titular);
        System.out.println(cliente);
    }
}
