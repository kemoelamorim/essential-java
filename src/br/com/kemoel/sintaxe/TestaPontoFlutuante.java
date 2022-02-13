package br.com.kemoel.sintaxe;

public class TestaPontoFlutuante {
    public static void main(String[] args){

        double salario;
        salario = 100;
        double desconto;
        desconto = salario * 10/100;
        double novoSalario = salario - desconto;
        System.out.println("########### Teste ponto flutuante ###############");
        System.out.println("O salário é de: " + salario);
        System.out.println("O desconto é de: " + desconto);
        System.out.println("O novo salário é de: " + novoSalario);
        double pi = 3.14;
        System.out.println("############ Teste divisão ######################");
        double divisao = pi / 2;
        System.out.println("A divisão de PI por 2 é: " + divisao);
        int tentaDivisao = 5 / 2;
        System.out.println("Tentando dividir 5 / 2, resultado: "+ tentaDivisao+", deu ruim!");
        double outraTentativa = 5 / 2;
        System.out.println("Tentando dividir 5 / 2, resultado: "+ outraTentativa+", deu ruim!");
        double terceiraTentativa = 5.0/2;
        System.out.println("Tentando dividir 5 / 2, resultado: "+ terceiraTentativa+", deu certo!");
        int brindes = 15;
        int pessoas = 2;
        System.out.println(brindes / pessoas);


    }

}
