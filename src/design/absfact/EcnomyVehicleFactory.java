package design.absfact;


public class EcnomyVehicleFactory implements VehicleFactory {

    @Override
    public Luxurycar careteCar() {
        return new Luxurycar();
    }

    @Override
    public LuxuryBike createBike() {
        return new LuxuryBike();
    }
}
