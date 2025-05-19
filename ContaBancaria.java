package NivelIntermediario.Desafios.Desafio5;

public abstract class ContaBancaria implements conta {

    String nome;
    double saldo;
    TipoConta tipo;

    public ContaBancaria (String nome, double saldo, TipoConta tipo){
        this.nome = nome;
        this.saldo = saldo;
        this.tipo = tipo;
    }
    public boolean transferir(double valor) {
        if (valor <= 0) {
            System.out.println("O valor a ser transferido não pode ser nulo");
            return false;
        }else if (saldo >= valor){
            saldo-= valor;
            return true;
        }
        return false;
    }
    public boolean Transferido(double valor, ContaBancaria TipodaConta){
        if(transferir(valor)){
            TipodaConta.depositar(valor);
            System.out.println("O valor: " + valor + " foi transferido de conta " + this.tipo + " para " + TipodaConta.tipo);
            return true;
        } else if (saldo < valor) {
            System.out.println("a transferencia não e valida, pois o saldo: '" + saldo + "' e menor que o valor que deseja ser transferido: " + valor);
            return false;
        }
        System.out.println("Valor não altorizado! Pois voce digitou um valor nulo " + valor);
        return false;
    }
    @Override
    public double depositar(double valor) {
        return saldo += valor;
    }
    @Override
    public void consultarSaldo() {
        System.out.println(nome + " seu saldo atual de: " + saldo);
    }
    public double depositosemT(double valor){
        return saldo += valor;
    }
}
