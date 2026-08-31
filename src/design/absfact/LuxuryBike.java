package design.absfact;

public class LuxuryBike implements Move{
    @Override
    public void start() {
        System.out.println("bike starts");
    }

    @Override
    public void stop() {
        System.out.println("bike moves");
    }
}
