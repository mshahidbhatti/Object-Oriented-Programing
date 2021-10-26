package Collection;

public class Students implements  Comparable<Students>{
    private String name;
    private double cgpa;

    public Students(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;

    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }

    public boolean equals(Object o){
        Students s=(Students) o;
        return this.getName().equals(s.getName());
    }

    @Override
    public int compareTo(Students o) {
        Students obj=(Students) o;
         return obj.getName().compareTo(this.getName());
    }
}
