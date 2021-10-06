package Week4;

public class Course {
    private String name;
    private String code;
    private int creditHours;
    private String instructor;


    public Course(String name, String code, int creditHours, String instructor) {
        this.name = name;
        this.code = code;
        this.creditHours = creditHours;
        this.instructor = instructor;
    }

    Course(){
        System.out.println("Constructor is called");
    }
    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public String getCode() {
        return code;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public void display(){
        System.out.printf("Course Name: %-12s %n", this.name);
        System.out.printf("Course Code: %-12s %n", this.code);
        System.out.printf("Course Name: %d %n", this.creditHours);
        System.out.printf("Course Name: %-12s ", this.instructor);

    }

    public String getDisplayString(){

        return String.format("Course Name: %-12s %n Course Code: %-12s %n Course Name: %d %n Course Name: %-12s ", name, code, creditHours,instructor);

    }

}
