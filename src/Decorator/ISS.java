package Decorator;

public class ISS extends Imposto {

    public ISS(Imposto imposto) {
        super(imposto);
    }

    public ISS() {

    }

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getPreco() * 0.055 + calculaOutroImposto(orcamento);
    }
}
