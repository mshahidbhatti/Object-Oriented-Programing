package Week7;

public class FourWheelVehicles extends Vehicle{
    int numberOfWheels;
    int numberOfSeats;

    FourWheelVehicles(String registrationNo, String chassisNo, String maker, String color, int numberOfWheels,int numberOfSeats){

        super(registrationNo,chassisNo,maker,color);

        this.numberOfSeats=numberOfSeats;
        this.numberOfWheels=numberOfWheels;



    }

    @Override
    public void setChassisNo(String chassisNo){

    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfWheels() {

        return numberOfWheels;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public String toString(){
        return null;
    }
}
