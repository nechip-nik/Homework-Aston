package homework3.strategy;

import java.util.Objects;

public final class MovieOrder {
    private final String name;
    private final double price;
    private final DeliveryStrategy deliveryStrategy;
    public MovieOrder(String name, double price, DeliveryStrategy deliveryStrategy) {
        this.name = name;
        this.price = price;
        this.deliveryStrategy = Objects.requireNonNull(deliveryStrategy, "deliveryStrategy is null");
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public DeliveryStrategy getDeliveryStrategy() {
        return deliveryStrategy;
    }
    public void order(){
        double finalPrice = getPrice() * deliveryStrategy.getModifyPrice();
        System.out.println("Ordering for " + getName() + ": " + finalPrice);
        System.out.println(deliveryStrategy.getDeliveryInfo(getName()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieOrder that = (MovieOrder) o;
        return Double.compare(price, that.price) == 0 && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
