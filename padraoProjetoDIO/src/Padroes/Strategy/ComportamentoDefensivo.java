package Padroes.Strategy;

public class ComportamentoDefensivo implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Ação defensiva");
    }
    
}
