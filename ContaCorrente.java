package NivelIntermediario.Desafios.Desafio5;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(String nome, double saldo,TipoConta tipo) {
        super(nome, saldo, tipo);
    }

    @Override
    public double depositar(double valor) {
        return saldo += valor;
    }
    @Override
    public void consultarSaldo() {
        System.out.println(nome + " seu saldo na conta " + this.tipo +" e de: " + saldo);
    }
    public double depositosemT(double valor){
        return saldo += valor;
    }

    @Override
    public boolean Transferido(double valor, ContaBancaria TipodaConta) {
        return super.Transferido(valor, TipodaConta);
    }
}
