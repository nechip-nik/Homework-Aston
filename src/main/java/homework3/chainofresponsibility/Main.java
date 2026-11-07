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

        PrintOrder order1 = new PrintOrder("business cards", true, true, true);
        payment.handle(order1);

        PrintOrder order2 = new PrintOrder("banners", false, true, true);
        payment.handle(order2);

        PrintOrder order3 = new PrintOrder("flyers", true, false, true);
        payment.handle(order3);

        PrintOrder order4 = new PrintOrder("posters", true, true, false);
        payment.handle(order4);
    }
}