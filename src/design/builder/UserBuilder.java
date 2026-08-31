package design.builder;

public class UserBuilder {
    String name;
    int age;
    String city;
    int id;

    public UserBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public UserBuilder setCity(String city) {
        this.city = city;
        return this;
    }
}
