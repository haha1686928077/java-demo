import java.awt.*;

public class Student {
    private String name;
    private String age;
    private String address;
    private String id;

    public Student() {}

    public void Student(String name, String age, String address, String id){
        this.name = name;
        this.age = age;
        this.address = address;
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getAge() {
        return age;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
}

