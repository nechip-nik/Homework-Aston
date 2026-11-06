package homework3.chainofresponsibility;

public abstract class PrintOrderHandler {
    protected PrintOrderHandler next;

    public void setNext(PrintOrderHandler next) {
        this.next = next;
    }
    public abstract void handle(PrintOrder order);

}
