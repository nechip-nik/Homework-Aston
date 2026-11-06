package homework3.strategy;

public class DVDStrategy implements DeliveryStrategy {
    @Override
    public String getDeliveryInfo(String movie) {
        return "Your DVD(" + movie + ")will be delivered in 4 days.";
    }
    @Override
    public double getModifyPrice() {
        return 1.6;
    }

}
