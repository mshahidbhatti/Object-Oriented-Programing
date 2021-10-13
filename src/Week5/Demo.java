package Week5;

import javax.xml.transform.Source;

public class Demo {

    public static void main(String[] args) {

        Rectangle tempList[]=new Rectangle[10];
        for(int i=0;i< tempList.length;i++)
            tempList[i]=new Rectangle(2,1);


        Rectangle list[] = new Rectangle[10];

        for(int i=0;i<list.length;i++)
        list[i]=new Rectangle(10,5);

        Rectangle list3[]= new Rectangle[10];
        //displayList(list);


        copyArray(list,list3);

        //displayList(list3);

        //update element of list3
        list3[2].setWidth(20);

        System.out.println();
        //display list "list"
        displayList(list);

        System.out.println();
        displayList(list3);


      //  System.out.println(list);
      //  System.out.println(list3);

        Rectangle list4[]= getArray(list);

        list4[5].setLength(200);

        System.out.println("////////////////////////////////");

        displayList(list3);


        copyArray(tempList,list);

        System.out.println(list3[0].getLength());

        //variable length argument list

        printVariableLengthArgument(list[0]);
        printVariableLengthArgument(list[0],list3[2]);
        printVariableLengthArgument(list[0],list3[2], list4[5], list[2]);

    }



    public  static void displayList(Rectangle [] list2){

        for (Rectangle rec:list2)
            if(rec!=null)
            System.out.println("Rectangle: Length="+rec.getLength()+", Width"+rec.getWidth());

    }

    public static void copyArray(Rectangle sourceArray[], Rectangle destinationArray[]){
              //  destinationArray=sourceArray;
                for(int i=0;i<sourceArray.length;i++)
                    destinationArray[i]=sourceArray[i];
    }


    public static Rectangle[] getArray(Rectangle source[]){

        Rectangle temp[]=new Rectangle[source.length];
        for(int i=0;i< temp.length;i++)
            temp[i]=new Rectangle(source[i].getLength(),source[i].getWidth());


        return  temp;

    }

    public static void printVariableLengthArgument(Rectangle ... temp){

        for(Rectangle temp1:temp )
            System.out.println(temp1.getLength());

    }

}
