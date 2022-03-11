package br.com.kemoel.sintaxe;

public class TestaCondicional {
    public static void main(String[] args) {
        System.out.println("##### Testando condicionais #####");
        int idade = 15;
        int qtdDePessoas = 2;
        if (idade >= 18){
            System.out.println("Você é maior de idade!");
            System.out.println("Seja bem-vindo!");
        }else{
            if(qtdDePessoas >= 2){
                System.out.println("Você pode entrar pois está acompanhado!");
            }else {
                System.out.println("Infelizmente você não pode entrar!");
            }
        }
        System.out.println("##### Testando condicionais 2 #####");
        boolean acompanhado = qtdDePessoas >= 2;
        System.out.println("O valor de acompanhado = " + acompanhado);
        if(idade >= 18 && acompanhado){
            System.out.println("Seja bem vindo!");
        }else {
            System.out.println("Infelizmente você não pode entrar!");
        }
    }
}
