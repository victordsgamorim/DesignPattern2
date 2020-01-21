package State.Exercicio;

public class Conta {

    protected double saldo;
    protected ContaState state;

    public Conta() {
        if (saldo >= 0) state = new SaldoPositivoState();

    }

    public double getSaldo() {
        return saldo;
    }

    public void saca(double valor) {
        state.saca(this, valor);
    }

    public void deposita(double valor) {
        state.deposita(this, valor);
    }


}
