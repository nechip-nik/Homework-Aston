package homework3.strategy;

public class Main {
    public static void main(String[] args) {
        MovieOrder orderDVD = new MovieOrder("A Nightmare on Elm Street", 850, new DVDStrategy());
        MovieOrder orderDigital = new MovieOrder("Terminator", 1000, new DigitalCodeStrategy());
        MovieOrder orderVHS = new MovieOrder("Shrek", 700, new VHSStrategy());
        orderDigital.order();
        orderDVD.order();
        orderVHS.order();
    }
}
