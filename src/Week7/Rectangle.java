package Week7;

public class Rectangle extends Shape2D{
    private double side1;
    private double side2;

    //no argument constructor
    Rectangle(String name){
        super(name);
        System.out.println("Constructor of Rectangle class is called");
    }

    Rectangle(double side1, double side2){
        this.side1=side1;
        this.side2=side2;

    }

    @Override
    public double calculateArea(){
        return side1*side2;
    }

}
