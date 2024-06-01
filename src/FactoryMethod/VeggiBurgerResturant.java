package FactoryMethod;

public class VeggiBurgerResturant extends Resturant{
    @Override
    Burger createBurger() {
        return new VegiBurger();
    }
}
