package week6;

public class PersonDemo {

    public static void main(String[] args) {
        Person list[]=new Person[5];
        list[0]=new Person("Muhammad","Shahid","+10121212",new Date(1,2,2000),new Address("Street 1","Lahore","Pakistan",54000));
        list[1]=new Person("Qasim","Rashid","+10121212",new Date(2,10,2010),new Address("H. No 123","Karachi","Pakistan",64000));
        list[2]=new Person("Moiz","Imran","+10121212",new Date(2,11,2011),new Address("Street 3, H. No 40","Multan","Pakistan",67000));
        list[3]=new Person("Asim","Bilal","+10121212",new Date(3,5,1999),new Address("Street 4","Lahore","Pakistan",54000));
        list[4]=new Person("Muhammad","Haris","+10121212",new Date(4,4,1990),new Address("Gulshan Colony","Karachi","Pakistan",64000));

        //display list of persons
        displayPersons(list);


        //display persons from a specific city
        displayPersonFromACity(list,"Lahore");


        //to update some attribute of composed object
        list[0].getAddress().setCity("Islamabad");


    }

    public static void displayPersons(Person []list){
        for(Person p: list) {
            System.out.println();
            System.out.println(p);
        }

    }

    public static void displayPersonFromACity(Person []list,String city){
        for (Person p: list)
        {
            if(p.getAddress().getCity().equalsIgnoreCase(city))
                System.out.println(p);
        }
    }

}
