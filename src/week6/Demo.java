package week6;

public class Demo {





    public static void main(String[] args) {
        A obj= new A(1,1);

        A[]  arrayOfA= new A[5];
        arrayOfA[0]=new A(0,0);
        arrayOfA[1]=new A(0,0);
        arrayOfA[2]=new A(0,0);
        arrayOfA[3]=new A(0,0);
        arrayOfA[4]=new A(0,0);


        //A[][] twoDArrayOfA = new A[5][5];

        A[][] twoDArrayOfA = new A[5][];
        twoDArrayOfA[0]=new A[3];
        twoDArrayOfA[1]=new A[4];
        twoDArrayOfA[2]=new A[2];
        twoDArrayOfA[3]=new A[1];
        twoDArrayOfA[4]=new A[6];

        System.out.println(twoDArrayOfA);
        System.out.println();


        Demo obj1=new Demo();

        obj1.initTwoDArray(twoDArrayOfA);

        obj1.displayTwoDimensionalArray(twoDArrayOfA);





        obj.getX();
    }

    public void displayTwoDimensionalArray(A[][] tempArray){
        for(int i=0;i< tempArray.length;i++) {
            displayOneDimenionalArray(tempArray[i]);
            System.out.println();
        }
    }

    public void displayOneDimenionalArray(A[] tempArray){
        for (int j = 0; j < tempArray.length; j++)
            System.out.println(tempArray[j]);
    }

    public void initTwoDArray(A[][] temp){
        for(int i=0;i< temp.length;i++)
            for(int j=0;j<temp[i].length;j++)
                temp[i][j]=new A(2,2);
    }


    /*

    public A[][] getTwoDArray(){


    }

     */

}
