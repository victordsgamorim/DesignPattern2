package State.Exercicio;

public class SaldoNegativoState implements ContaState {

    @Override
    public void saca(Conta conta, double valor) {
        throw new IllegalArgumentException("Saldo Negativo");
    }

    @Override
    public void deposita(Conta conta, double valor) {
        conta.saldo += valor;

        if (conta.saldo > 0) {
            conta.state = new SaldoPositivoState();
        }
    }

}
