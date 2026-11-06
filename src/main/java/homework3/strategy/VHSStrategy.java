package homework3.strategy;

public class VHSStrategy implements DeliveryStrategy {

    @Override
    public String getDeliveryInfo(String movie) {
        return "Your VHS(" + movie + " )will be delivered in 9 days.";
    }

    @Override
    public double getModifyPrice() {
        return 0.8;
    }

}
