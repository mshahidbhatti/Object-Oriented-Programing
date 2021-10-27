package Week7;

public class SedanVehicle extends FourWheelVehicles{
    int bootspace;
    SedanVehicle(String registrationNo, String chassisNo, String maker, String color, int numberOfWheels,int numberOfSeats, int bootspace ){

        super(registrationNo,chassisNo,maker,color,numberOfWheels,numberOfSeats);
        this.bootspace=bootspace;

    }

}
