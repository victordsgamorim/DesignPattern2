package State.Exercicio;

public class Principal {

    public static void main(String[] args) {


        Conta conta = new Conta();

        conta.deposita(500);
        System.out.println(conta.getSaldo());

        conta.saca(300);
        System.out.println(conta.getSaldo());

        conta.saca(201);

        System.out.println(conta.getSaldo());


    }
}
