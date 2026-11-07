package homework3.decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Margherita();
        System.out.println("Cost: " + pizza.getCost());
        System.out.println(pizza.getIngredients());

        Pizza pizzaChees = new CheeseDecorator(new Margherita());
        System.out.println("Cost: " + pizzaChees.getCost());
        System.out.println(pizzaChees.getIngredients());

        Pizza pizzaWithAll = new MushroomDecorator(new PepperoniDecorator(new CheeseDecorator(new Margherita())));
        System.out.println("Cost: " + pizzaWithAll.getCost());
        System.out.println(pizzaWithAll.getIngredients());
    }
}
