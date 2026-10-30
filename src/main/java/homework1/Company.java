package homework1;

import java.util.Objects;

public class Company {
    private String companyName;


    public Company(String companyName) {
        this.companyName = companyName;
    }

    public Company(Company o) {
        this.companyName = o.companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(companyName, company.companyName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(companyName);
    }
}
