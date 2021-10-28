package Week7;

public class Circle extends Shape2D{
    private double radius;


    @Override
    public double calculateArea(){
        return radius*radius*Math.PI;
    }
}
