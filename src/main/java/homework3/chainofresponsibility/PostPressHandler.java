package homework3.chainofresponsibility;

public class PostPressHandler extends PrintOrderHandler {
    @Override
    public void handle(PrintOrder order) {
        System.out.println("The order has successfully passed all stages");
    }
}