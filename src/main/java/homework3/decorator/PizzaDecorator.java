package homework3.decorator;

public class PizzaDecorator implements Pizza {
    protected final Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public Pizza getPizza() {
        return pizza;
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
