package homework3.proxy;

public class AdminPageProxy implements WebPage {
    private final RealAdminPage realAdminPage = new RealAdminPage();
    private final String requiredRole; // например, "admin"

    public AdminPageProxy(String requiredRole) {
        this.requiredRole = requiredRole;
    }

    @Override
    public void display(String user) {
        if (user.equals(requiredRole)) {
            realAdminPage.display(user);
        } else {
            System.out.println("Access denied for " + user);
        }
    }
}

