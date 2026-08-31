package streams.advanced;

public class EmployeePractice {

    private int id;
    private String firstName;
    private String lastName;
    private String pincode;
    private String address;
    private int age;

    public EmployeePractice(int id, String firstName, String lastName,
                            String pincode, String address, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pincode = pincode;
        this.address = address;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPincode() {
        return pincode;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "EmployeePractice{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pincode='" + pincode + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}