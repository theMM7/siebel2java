package lesson_9.jackson;

import java.io.Serializable;

public class SimpleUser implements Serializable {
    private String firstName;
    private String lastName;
    private int age;
    private transient String secretInfo;

    public SimpleUser(String firstName, String lastName, int age, String secretInfo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.secretInfo = secretInfo;
    }

    @Override
    public String toString() {
        return "SimpleUser{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", secretInfo='" + secretInfo + '\'' +
                '}';
    }
}
