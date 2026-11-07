package homework3.decorator;

public class Margherita implements Pizza {

    @Override
    public String getIngredients() {
        return "Margherita (cheese, tomatoes, dough)";
    }
    @Override
    public int getCost() {
        return 200;
    }
}
