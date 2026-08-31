package design.singleton;

public class Test {
    static void main() {
        Calculator c1 = Calculator.createCalculator();
        Calculator c2 = Calculator.createCalculator();

        c1.b=10;
        c2.a=20;

        System.out.println(c1);
        c2.multiply();
    }
}
