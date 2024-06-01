package FactoryMethod;

public class PattyBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Preparing Patty Burger");
    }
}
