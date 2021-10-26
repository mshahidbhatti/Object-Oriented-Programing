package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Demo {

    public static void main(String[] args) {
        Students list[]= new Students[4];


        Iterable it=new ArrayList();

        ArrayList<Students> list2=new ArrayList<>();

        list2.add(new Students("Hamza",2.8));
        list2.add(new Students("Mobeen",3.1));
        list2.add(new Students("Zeshan",2.6));
        list2.add(new Students("Mobeen",3.1));
        list2.add(new Students("Hamza",2.8));
        list2.add(new Students("Mobeen",3.1));


        //list2.add(2,new Students("Asad",3));

      //  list2.sort();
        Collections.sort(list2);

        list2.remove(new Students("Hamza",2.8));

        for(Students temp: list2)
            System.out.println(temp);

    }
}
