package homework3.strategy;

public class DigitalCodeStrategy implements DeliveryStrategy {
    @Override
    public String getDeliveryInfo(String movie) {
        return "Your digital code movie: " + movie + " - 123:321:456";
    }
    @Override
    public double getModifyPrice() {
        return 0.4;
    }

}
