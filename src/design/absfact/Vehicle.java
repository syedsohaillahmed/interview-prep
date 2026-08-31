package design.absfact;

public class Vehicle {
    static void main() {
        EcnomyVehicleFactory v1= new EcnomyVehicleFactory();
        LuxuryBike bike = v1.createBike();
        bike.start();

    }
}
