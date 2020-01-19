package Decorator;

public abstract class Imposto {

    private Imposto outroImposto;

    public Imposto(Imposto outroImposto) {
        this.outroImposto = outroImposto;
    }

    public Imposto() {

    }

    public abstract double calcula(Orcamento orcamento);

    public double calculaOutroImposto(Orcamento orcamento) {
        if (outroImposto == null) {
            return 0;
        }
        return outroImposto.calcula(orcamento);
    }

}
