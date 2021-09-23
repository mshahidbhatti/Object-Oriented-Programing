public class Employee {

    private String firstName;
    private String lastName;
    private double salary;


    public Employee(String fName, String lName, double salary){
        firstName = fName;
        lastName = lName;

        if(salary>0)
            this.salary =salary;

    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }
    public void setSalary(double salary){
        if(salary>0)
            this.salary=salary;

    }
    public double getSalary(){
        return salary;
    }


    public void displayEmployee(){
        System.out.printf("%-12s \t %-12s \t %.2f$", firstName, lastName, salary);
    }


}
