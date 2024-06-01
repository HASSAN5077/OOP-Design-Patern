package FactoryMethod;

public class PattyBurgerResturant extends Resturant{
    @Override
    Burger createBurger() {
        return new PattyBurger();
    }
}
