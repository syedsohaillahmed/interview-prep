package design.absfact;


public class LuxuryVehicleFactory implements VehicleFactory{
    @Override
    public Luxurycar careteCar() {
        return new Luxurycar();
    }

    @Override
    public LuxuryBike createBike() {
        return new LuxuryBike();
    }
}
