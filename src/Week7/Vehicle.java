package Week7;

public class Vehicle extends Object{
    String registrationNo;
    String chassisNo;
    String maker;
    String color;




    public Vehicle(String registrationNo, String chassisNo, String maker, String color) {
        this.registrationNo = registrationNo;
        this.chassisNo = chassisNo;
        this.maker = maker;
        this.color = color;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public String getChassisNo() {
        return chassisNo;
    }

    public String getMaker() {
        return maker;
    }

    public String getColor() {
        return color;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public void setChassisNo(String chassisNo) {
        this.chassisNo = chassisNo;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
