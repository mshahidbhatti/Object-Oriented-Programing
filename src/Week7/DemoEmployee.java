package Week7;

import week6.Address;
import week6.Date;

public class DemoEmployee {
    public static void main(String[] args) {

        Employee emp=new Employee("First Name","Last Name","1111",new Date(1,1,1),new Address("street","city","pakistan",123),"sssn",400);

        System.out.println(emp);
        

    }
}
