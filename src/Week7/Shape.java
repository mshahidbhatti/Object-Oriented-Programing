package Week7;

public class Shape {
    public int x;
    private int y;

    // no argument constructor
    Shape(){
        System.out.println("Constructor of Shape class is called");
    }
    // no argument constructor
    Shape(String name){

        System.out.println("Parameterized Constructor of Shape class is called");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;

    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double calculateArea(){
        return 0;
    }
}
