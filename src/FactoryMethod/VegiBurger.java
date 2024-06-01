package FactoryMethod;

public class VegiBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Preparing VegiBurger");
    }
}
