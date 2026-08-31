package design.builder;

public class User {
    private String name;
    private int id;
    private int age;
    private String city;

    public User(UserBuilder builder) {
        this.name = builder.name;
        this.id = builder.id;
        this.city = builder.city;
        this.age = builder.age;
    }



    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age='" + age + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
