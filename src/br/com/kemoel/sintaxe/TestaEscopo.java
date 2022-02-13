package br.com.kemoel.sintaxe;

public class TestaEscopo {
    public static void main(String[] args) {

        int quantidadePessoas = 3;
        boolean acompanhado;
        if(quantidadePessoas >= 2){
            acompanhado = true;
        }else {
            acompanhado = false;
        }
        System.out.println("Valor de acompanhado é: " + acompanhado);
    }
}
