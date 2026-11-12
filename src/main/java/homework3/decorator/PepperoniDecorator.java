package homework3.decorator;

public class PepperoniDecorator extends PizzaDecorator {

    public PepperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getIngredients() {
        return pizza.getIngredients() + " + pepperoni";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 10;
    }
}
