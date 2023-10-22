import Facade.*;
import Strategy.*;
import Singleton.*;


public class App {
    public static void main(String[] args) {
        // Padrão Singleton
        Singleton singleton1 = Singleton.obterInstancia();
        Singleton singleton2 = Singleton.obterInstancia();

        System.out.println("singleton1 é a mesma instância que singleton2? " + (singleton1 == singleton2));

        // Padrão Strategy
        StrategyPagamento StrategyCartaoCredito = new PagamentoCartaoCredito("1234-5678-9101-1121");
        FacadePagamento facadePagamento = new FacadePagamento(StrategyCartaoCredito);

        // Padrão Facade
        facadePagamento.processarPagamento(100);
    }
}
