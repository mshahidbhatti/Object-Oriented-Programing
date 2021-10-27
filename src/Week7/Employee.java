package Week7;

import week6.Address;
import week6.Date;
import week6.Person;

public class Employee extends Person {
    String ssn;
    double salary;


    public Employee(String fName, String lName, String phone, Date dateOfBirth, Address address, String ssn, double salary) {
        super(fName, lName, phone, dateOfBirth, address);
        this.ssn=ssn;
        this.salary=salary;
    }


    public String getSsn() {
        return ssn;
    }

    public double getSalary() {
        return salary;

    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ssn='" + ssn + '\'' +
                ", salary=" + salary + super.toString();
    }
}
