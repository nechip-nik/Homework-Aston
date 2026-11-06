package homework3.chainofresponsibility;

public class DesignCheckHandler extends PrintOrderHandler{

    @Override
    public void handle(PrintOrder order) {
        if(!order.isLayoutValid()) {
            System.out.println("Invalid order");
            return;
        }
        System.out.println("Design check handler");
        if(next != null) {
            next.handle(order);
        }
    }
}
