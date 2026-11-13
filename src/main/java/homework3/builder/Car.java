package homework3.builder;

import java.util.Objects;

public class Car {
    private final String model;
    private final int year;
    private final double price;
    private final String color;
    private final int power;
    private final int torque;

    private Car(Builder builder) {
        this.model = builder.model;
        this.year = builder.year;
        this.price = builder.price;
        this.color = builder.color;
        this.power = builder.power;
        this.torque = builder.torque;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public int getPower() {
        return power;
    }

    public int getTorque() {
        return torque;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Double.compare(price, car.price) == 0 && power == car.power && torque == car.torque && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year, price, color, power, torque);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", power=" + power +
                ", torque=" + torque +
                '}';
    }

    public static class Builder {
        private final String model;
        private final int year;
        private final double price;
        private String color;
        private int power;
        private int torque;

        public Builder(String model, int year, double price) {
            this.model = model;
            this.year = year;
            this.price = price;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder power(int power) {
            this.power = power;
            return this;
        }

        public Builder torque(int torque) {
            this.torque = torque;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

}
