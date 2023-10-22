package Padroes.Singleton;
public class AppTestSingleton {
    public static void main(String[] args) throws Exception {

        //Testes relacionados ao design pattern singleton

        //Lazy
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        //Eager
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        //LazyHolder
        SingletonLazyHolder lazyH = SingletonLazyHolder.getInstancia();
        System.out.println(lazyH);
        lazyH = SingletonLazyHolder.getInstancia();
        System.out.println(lazyH);

    }
}
