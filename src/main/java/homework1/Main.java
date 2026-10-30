package homework1;

public class Main {
    public static void main(String[] args) {
        Company company1 = new Company("Yandex");
        Worker worker1 = new Worker("Nikita", company1);

        company1.setCompanyName("Google");
        System.out.println("Name: " + worker1.getName());
        System.out.println("Company name: " + company1.getCompanyName());
        System.out.println("Worker company: " + worker1.getCompany().getCompanyName());

        Company company2 = new Company(company1);
        company2.setCompanyName("VK");
        System.out.println("Company name: " + company1.getCompanyName());
        System.out.println("Company name: " + company2.getCompanyName());

        worker1.getCompany().setCompanyName("SBER");
        System.out.println("Worker company: " + worker1.getCompany().getCompanyName());

        Company company3 = new Company(company1);
        Worker worker2 = new Worker("Ivan", company2);
        System.out.println("Company equals: " + company1.equals(company3));
        System.out.println("Company hashcode: " + (company1.hashCode() == company3.hashCode()));
        System.out.println("Worker equals: " + worker1.equals(worker2));
        System.out.println("Worker hashcode: " + (worker1.hashCode() == worker2.hashCode()));
    }
}
