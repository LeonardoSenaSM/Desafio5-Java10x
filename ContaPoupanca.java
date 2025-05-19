package NivelIntermediario.Desafios.Desafio5;

public class ContaPoupanca extends ContaBancaria{

    double taxa;

    public ContaPoupanca(String nome, double saldo, TipoConta tipo) {
        super(nome,saldo,tipo);
    }
    @Override
    public double depositar(double valor) {
        taxa = (valor * 10)/100;
        return saldo += valor - taxa;
    }

    @Override
    public void consultarSaldo() {
        System.out.println(nome + " seu saldo na conta " + this.tipo +" e de: " + saldo);
    }

    @Override
    public boolean transferir(double valor) {
        return super.transferir(valor);
    }
    @Override
    public boolean Transferido(double valor, ContaBancaria TipodaConta) {
        if(super.transferir(valor)){
            TipodaConta.depositosemT(valor);
            System.out.println("O valor: " + valor + " foi transferido de conta " + this.tipo + " para " + TipodaConta.tipo);
            return true;
        } else if (saldo < valor) {
        System.out.println("a transferencia não e valida, pois o saldo: "+ saldo+ "e menor que o valor que o valor a ser transferido: "+ valor);
            return false;
        }
            System.out.println("valor não altorizado! Pois voce digitou um valor impossivel");
        return false;
    }

}
