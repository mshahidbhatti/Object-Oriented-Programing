package Test;

public class S implements P{

    public void funny(){
        System.out.print("OOP is funny");
    }
    public static void main(String args[]){
        S s1 = new S();
        s1.funny();
    }

    @Override
    public void fun(int x) {

    }
}
