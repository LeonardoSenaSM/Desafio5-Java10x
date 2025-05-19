package NivelIntermediario.Desafios.Desafio5;

public class Main {
    public static void main(String[] args) {

        ContaPoupanca p = new ContaPoupanca("Pedro",1000, TipoConta.POUPANCA);
        p.depositar(100);
        p.consultarSaldo();

        ContaCorrente c = new ContaCorrente("Pedro",1000,TipoConta.CORRENTE);
        c.depositar(200);
        c.consultarSaldo();

        p.Transferido(0,c);
        p.consultarSaldo();
        c.consultarSaldo();
    }
}
