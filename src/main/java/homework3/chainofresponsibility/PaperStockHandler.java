package homework3.chainofresponsibility;

public class PaperStockHandler extends PrintOrderHandler {
    @Override
    public void handle(PrintOrder order) {
        if (!order.hasPaper()) {
            System.out.println("Paper not found");
            return;
        }
        System.out.println("Paper in stock");
        if (next != null) {
            next.handle(order);

        }
    }

}
