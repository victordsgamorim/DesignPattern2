package Decorator;

public class ICMS extends Imposto {

    public ICMS(Imposto imposto) {
        super(imposto);
    }

    public ICMS() {

    }

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getPreco() * 0.1 + calculaOutroImposto(orcamento);
    }
}
