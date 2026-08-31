package design.factory;

public class Drive {
    static void main() {
        Vehicle bike = VehicleFactory.createVehicle("bike");
        bike.start();
        Vehicle car = VehicleFactory.createVehicle("car");
        car.start();
    }
}
