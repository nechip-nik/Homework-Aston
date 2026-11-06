package homework3.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        PrintOrderHandler payment = new PaymentCheckHandler();
        PrintOrderHandler design = new DesignCheckHandler();
        PrintOrderHandler paper = new PaperStockHandler();
        PrintOrderHandler post = new PostPressHandler();

        payment.setNext(design);
        design.setNext(paper);
        paper.setNext(post);

        PrintOrder order = new PrintOrder("business cards", true, true, true);
        payment.handle(order);

    }
}
