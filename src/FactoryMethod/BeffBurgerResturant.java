package FactoryMethod;

public class BeffBurgerResturant extends Resturant{
    @Override
    Burger createBurger() {
        return new BeefBurger();
    }
}
