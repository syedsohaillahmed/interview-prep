package design.absfact;

public class Luxurycar implements Move{
    @Override
    public void start() {
        System.out.println("cra starts");
    }

    @Override
    public void stop() {
        System.out.println("car stops");
    }
}
