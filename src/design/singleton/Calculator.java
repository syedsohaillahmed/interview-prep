package design.singleton;

public class Calculator {

    int a;
    int b;

    private static Calculator obj;

    private Calculator() {
    }

    public void add() {
        System.out.println(a + b);
        ;

    }

    public void multiply() {
        System.out.println(a * b);
    }

    public  static Calculator createCalculator() {
        synchronized (Calculator.class) {


            if (obj == null) {
                obj = new Calculator();
            }
            return obj;
        }
    }
}
