package week11;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) throws Exception{
        System.out.println("Welcome to our ultimate software");

  /*      int x=0;
        int y=0;

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Numerator:");
            x=sc.nextInt();
            System.out.print("Enter Denominator");
            y=sc.nextInt();

            System.out.println("Result :" + (x / y));
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input"+e.getMessage());
        }*/

       /* int array[]={1,2,3};
        try {
            array[0]=new Scanner(System.in).nextInt();
            System.out.println(array[4]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds exception");
        }
        catch(RuntimeException e)
        {

        }
        catch (Exception e){

        }
        catch (Throwable e){

        }*/

        File f = new File("data.txt");
        try {
            FileWriter fw = new FileWriter(f, true);
            FileReader fr = new FileReader(f);
        }
        catch(FileNotFoundException e){

        }
        catch(IOException e){

        }
        finally{

        }

        //To generate an exception use throw
        //throw new ArithmeticException();


        //summary
        //  try
        //  catch
        // finally
        // throws
        // throw

        try{}
        catch (customException e){

        }
        System.out.println("Thank you for using our ERP. Good Bye! ");
    }

}
