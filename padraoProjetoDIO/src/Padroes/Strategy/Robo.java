package Padroes.Strategy;

public class Robo  {
    private Comportamento estrategia;

    public void setComportamento(Comportamento estrategia){
        this.estrategia = estrategia;
    }

    public void mover(){
        estrategia.mover();
    }
}
