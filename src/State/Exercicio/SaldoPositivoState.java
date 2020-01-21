package State.Exercicio;

public class SaldoPositivoState implements ContaState {


    @Override
    public void saca(Conta conta, double valor) {
        conta.saldo -= valor;
        if (conta.saldo < 0) {
            conta.state = new SaldoNegativoState();
        }
    }

    @Override
    public void deposita(Conta conta, double valor) {
        conta.saldo += valor;
    }

}
