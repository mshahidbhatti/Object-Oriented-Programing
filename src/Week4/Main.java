package Week4;

public class Main {

    public static void main(String[] args) {

        //using array init.
        int intArray[]={1,2,3,4,5};
        char charArray[]={'a','b','c','\n'};


        for(char c:charArray)
            System.out.println(c);


        String[] stringArray={"word1","word2","...."};
        System.out.println(intArray[0]);
        //for(String s: stringArray)
        //    System.out.println(s);

        intArray[0]=12;

        int intArray2[]=new int[5];
        System.out.println(intArray2[3]);

        //declaration of array
        int listOfInt[];


        //initilization of array
        listOfInt=new int[5];

        //declaration and initilizatio of array
        byte listOfBytes[]= new byte[5];

        short[]  shortArray1, shortArray2=new short[5], shortArray3;

        String names[]=new String[5];

        System.out.println(names[1]);

        boolean boolArray[]=new boolean[5];
        System.out.println(boolArray[0]);

        char charArray1[]=new char[5];

        System.out.println(charArray1[2]);


        //  create an array of Courses
        Course courses[]=new Course[6];
        courses[0]=new Course("Multi Variable Calculus","MTH123",3,"Dr Sana");
        courses[1]= new Course("OOP","CSC241",4,"Shahid");
        courses[2]=new Course("Disctrete Structure","CSC102",3,"Mehwish Waqas");
        courses[3]= new Course("Islamiat","HUM11",3,"Musferah");
        courses[4]= new Course("Digital Logic and Design","EEE11",3,"Mohsin");
        courses[5]=new Course();

        System.out.println("Length of array"+courses.length);


        //using enhanced for loop to iterate through the array
     /*   for(Course temp:courses) {
            System.out.println(temp.getDisplayString());
            System.out.println("=============================");
        }
*/

        System.out.println(courses[0].getCode());

        courses[3].setCode("HUM110");

        for(int i=0;i<courses.length ;i++) {
            System.out.println(courses[i].getDisplayString());
        }

        System.out.println(courses[3].getDisplayString());



    }
}
