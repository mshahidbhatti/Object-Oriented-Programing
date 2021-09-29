package week3;

public class Mathematics {



    //method overloading
    public static int add(int number1, int number2){

        return number1+number2;
    }

    public static double add(double number1, double number2){
        return number1+number2;
    }


    public static int multiplication(int x, int y){
            return x*y;
    }

    public static double multiplication(double x, double y){
        return x*y;
    }



    //two overloaded function  "min"
    public static int min(int x, int y){
        if (x<y)
            return x;
        else
            return y;
    }

    public static double min(double number1, double number2){
        if(number1<number2)
            return  number1;
        else
            return number2;
    }

    public static int min(int x, int y, int z){
        if(x<y && x< z)
            return  x;
        else
        {
            if(y<z)
                return y;
            else
                return z;
        }


    }

    public static int min(int w, int x, int y, int z){
        if(w<x && w<y && w< z)
            return w;
        else
        {
            if(x<y && x< z)
                return  x;
            else
            {
                if(y<z)
                    return y;
                else
                    return z;
            }

        }
    }


    /*public int complexNumber(int real, int ordinary){

        // function call returns to calling point by the following situtaions
        add(1,2);
        //return;
        //return add(1,2);

        //return 4<5?4:5;

        return 0;
    }*/

}
