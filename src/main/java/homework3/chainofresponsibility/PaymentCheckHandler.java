package homework3.chainofresponsibility;

public class PaymentCheckHandler extends PrintOrderHandler {

    @Override
    public void handle(PrintOrder order) {
        if (!order.isPaid()) {
            System.out.println("Order has not been paid");
            return;
        }
        System.out.println("Order has been paid");
        if (next != null) {
            next.handle(order);
        }
    }
}
