package State;

public class Orcamento2 {

    private double preco;

    protected DescontroExtra descontoExtra;

    public Orcamento2() {
        //ORCAMENTO JA COMECA EM ESTADO DE ESPERA PARA APROVACAO
        descontoExtra = new EmAprovacao();
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicaDescontoExtra() {
        //Deacordo com o estado dele, devolve um resultado diferente.
        descontoExtra.aplicaDescontoExtra(this);
    }

    public void aprova() {
        descontoExtra.aprovado(this);
    }

    public void reprova() {
        descontoExtra.reprovado(this);
    }

    public void finaliza() {
        descontoExtra.finalizado(this);
    }
}
