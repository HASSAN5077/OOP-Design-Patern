package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        Resturant beefBurger = new BeffBurgerResturant();
        beefBurger.orderBurger();
        Resturant chickenBurger = new ChickenBurgerResturant();
        chickenBurger.orderBurger();
        Resturant PattyBurger = new PattyBurgerResturant();
        PattyBurger.orderBurger();
        Resturant veggiBurger = new VeggiBurgerResturant();
        veggiBurger.orderBurger();
    }
}
