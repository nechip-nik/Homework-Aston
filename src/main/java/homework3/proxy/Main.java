package homework3.proxy;

public class Main {
    public static void main(String[] args) {
        WebPage adminPanel = new AdminPageProxy("admin");

        System.out.println("Admin has joined");
        adminPanel.display("admin");

        System.out.println("\nUser has joined");
        adminPanel.display("user");
    }
}
