package homework1;

import java.util.Objects;

public final class Worker {
    private final String name;
    private final Company company;

    public Worker(String name, Company company) {
        this.name = name;
        this.company = new Company(company);
    }

    public String getName() {
        return name;
    }

    public Company getCompany() {
        return new Company(company);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return Objects.equals(name, worker.name) && Objects.equals(company, worker.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company);
    }
}
