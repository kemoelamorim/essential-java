package br.com.kemoel.sintaxe;

public class TestaLacosEncadeados {
    public static void main(String[] args) {
        System.out.println("Testa Laços Encadeados");
        for (int multiplicador = 1; multiplicador <= 10 ; multiplicador++){
            for (int contador = 1; contador <= 10; contador++){
                System.out.print( multiplicador * contador);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
