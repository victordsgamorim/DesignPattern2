package State;

import javax.annotation.processing.AbstractProcessor;

public class EmAprovacao implements DescontroExtra {


    @Override
    public double aplicaDescontoExtra(Orcamento2 orcamento) {
        return orcamento.getPreco() * 0.02;
    }

    @Override
    public void aprovado(Orcamento2 orcamento2) {
        orcamento2.descontoExtra = new Aprovado();
    }

    @Override
    public void reprovado(Orcamento2 orcamento2) {
        orcamento2.descontoExtra = new Reprovado();
    }

    @Override
    public void finalizado(Orcamento2 orcamento2) {
        throw new RuntimeException("Orcamento ainda esta em estado de aprovacao");
    }
}
