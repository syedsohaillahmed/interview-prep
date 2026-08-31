package design.factory;

public class VehicleFactory {
    public static Vehicle createVehicle(String value){
        if (value.equals("bike")){
            return new Bike();
        }else{
            return new Car();
        }
    }
}
