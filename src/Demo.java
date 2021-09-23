public class Demo {
    public static void main(String args[]){

        Employee e1= new Employee("Moiz", "Azad", 100000);

        Employee e2 = new Employee("Muhammad ", "Abdul Rehman", 20000);

        Employee e3 = new Employee("Ayesha", "Khan", 25000);


        e1.displayEmployee();

        System.out.println();



        e2.setSalary((e2.getSalary()*.10)+ e1.getSalary());

        e2.displayEmployee();

        System.out.println();

        e3.displayEmployee();






/*
        Date date1 = new Date(25,9,2021);
        date1.setDay(23);
        date1.setMonth(9);
        date1.setYear(2021);



        Date date2=new Date(23,9,2021);

        date2.setDay(55);
        date2.setMonth(-10);
        date2.setYear(2021);

        Date date3 = new Date(22,9,2021);

        System.out.println(date1.getDay());
        System.out.println(date2.getDay());


     //   date1.displayDate();
     //   System.out.println();
     //   date2.displayDate();

        date3.displayDate();*/


    }
}
