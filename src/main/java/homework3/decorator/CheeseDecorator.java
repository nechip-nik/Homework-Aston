package homework3.decorator;

public class CheeseDecorator extends PizzaDecorator {

    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }
    @Override
    public String getIngredients() {
        return pizza.getIngredients() + "+ chees";
    }
    public int getCost() {
        return pizza.getCost() + 30;
    }

}
