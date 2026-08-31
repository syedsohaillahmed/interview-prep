package design.builder;

public class TestBuilder {
    static void main() {
        UserBuilder user = new UserBuilder();
        user.setId(1);
        user.setName("hello");

        System.out.println(user.city);
    }

}
