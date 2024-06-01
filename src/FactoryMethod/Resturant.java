package FactoryMethod;

public abstract class Resturant {
    public void orderBurger(){
        System.out.println("Ordering Burger ....");
        Burger burger = createBurger();
        burger.prepare();
    }
    abstract Burger createBurger();
}
