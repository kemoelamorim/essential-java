package br.com.kemoel.heranca.funcionario;

public class TestaSistemaInterno {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSenha(2221);

        Administrador adm = new Administrador();
        adm.setSenha(2222);

        Cliente cliente = new Cliente();
        cliente.setSenha(1123);

        SistemaInterno si = new SistemaInterno();
        si.autentica(g);
        si.autentica(adm);
        si.autentica(cliente);
    }
}
