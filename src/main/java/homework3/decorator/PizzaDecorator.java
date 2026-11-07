package homework3.decorator;

public class PizzaDecorator implements Pizza {
    protected final Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }


    @Override
    public int getCost() {
        return pizza.getCost();
    }
    @Override
    public String getIngredients() {
        return pizza.getIngredients();
    }
}
