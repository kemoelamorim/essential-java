package br.com.kemoel.heranca.funcionario;

public class TestaReferencias {
    public static void main(String[] args) {

        Funcionario g1 = new Gerente();
        g1.setNome("Muka");
        g1.setSalario(5000.00);

        EditorDeVideo ev1 = new EditorDeVideo();
        ev1.setNome("Daniel");
        ev1.setSalario(2500.00);

        Designer ds1 = new Designer();
        ds1.setNome("Igor");
        ds1.setSalario(2000.00);

        ControleDeBonificacao bonifica = new ControleDeBonificacao();

        bonifica.registra(g1);
        System.out.println("Gerente: "+g1.getNome());
        System.out.println("Bonificação: " + g1.getBonificacao());
        System.out.println("Total de Bonificação: "+ bonifica.getTotal());
        System.out.println();

        bonifica.registra(ev1);
        System.out.println("Editor de Video: "+ ev1.getNome());
        System.out.println("Bonificação: " + ev1.getBonificacao());
        System.out.println("Total de Bonificação: "+ bonifica.getTotal());
        System.out.println();

        bonifica.registra(ds1);
        System.out.println("Editor de Video: "+ ds1.getNome());
        System.out.println("Bonificação: " + ds1.getBonificacao());
        System.out.println("Total de Bonificação: "+ bonifica.getTotal());
    }
}
