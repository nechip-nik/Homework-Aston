package homework3.proxy;

public class RealAdminPage implements WebPage {
    @Override
    public void display(String user) {
        System.out.println("You are a Real Admin Page " + user);
    }


}
