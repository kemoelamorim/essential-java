package br.com.kemoel.sintaxe;

public class TestaLacosEncadeados2 {
    public static void main(String[] args) {
        System.out.println("Testa laços encadeados");
        for (int linha = 0; linha < 10; linha++){
            for (int coluna = 0;coluna < linha; coluna++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
