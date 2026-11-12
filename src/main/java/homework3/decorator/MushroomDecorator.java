package homework3.decorator;

public class MushroomDecorator extends PizzaDecorator {

    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getIngredients() {
        return pizza.getIngredients() + " + mushroom";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 20;
    }
}
