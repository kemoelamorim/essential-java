package br.com.kemoel.heranca.funcionario;

public class ControleDeBonificacao {

    private double total;

    public double getTotal() {
        return total;
    }

    public double registra(Funcionario funcionario){
        double bonificacao = funcionario.getBonificacao();
        return this.total = this.total + bonificacao;
    }
}
