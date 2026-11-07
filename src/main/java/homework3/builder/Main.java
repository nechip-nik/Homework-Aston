package homework3.builder;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car.Builder("Toyota corolla", 2000, 20000)
                .color("yellow")
                .power(150)
                .build();
        System.out.println(car1);

        Car car2 = new Car.Builder("Honda civic", 2000, 22000)
                .color("white")
                .power(160)
                .torque(166)
                .build();
        System.out.println(car2);

    }
}
