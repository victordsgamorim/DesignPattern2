package Decorator;

public class Main {

    public static void main(String[] args) {


        Orcamento orcamento = new Orcamento(500.0);
        Imposto imposto = new ISS(new ICMS());

        double valor = imposto.calcula(orcamento);

        System.out.println(valor);


    }
}
