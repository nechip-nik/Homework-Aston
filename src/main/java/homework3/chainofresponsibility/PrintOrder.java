package homework3.chainofresponsibility;

public class PrintOrder {
    private final String orderName;
    private boolean isPaid;
    private boolean isLayoutValid;
    private boolean hasPaper;

    public PrintOrder(String orderName, boolean isPaid, boolean isLayoutValid, boolean hasPaper) {
        this.orderName = orderName;
        this.isPaid = isPaid;
        this.isLayoutValid = isLayoutValid;
        this.hasPaper = hasPaper;
    }

    public String getOrderName() {
        return orderName;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public boolean isLayoutValid() {
        return isLayoutValid;
    }

    public boolean hasPaper() {
        return hasPaper;
    }

    public void setHasPaper(boolean hasPaper) {
        this.hasPaper = hasPaper;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public void setLayoutValid(boolean layoutValid) {
        isLayoutValid = layoutValid;
    }
}
