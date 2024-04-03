package lesson_9.jackson;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class UserForJson {
    private String firstName;
    private String lastName;
    private int age;
    private String secretInfo;
//    @JsonFormat(pattern = "dd/MM/yyyy")
//    private LocalDate current;

    public UserForJson() {
    }

//    public LocalDate getCurrent() {
//        return current;
//    }

    public UserForJson(String firstName, String lastName, int age, String secretInfo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.secretInfo = secretInfo;
        //this.current = current;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getSecretInfo() {
        return secretInfo;
    }

    @Override
    public String toString() {
        return "UserForJson{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", secretInfo='" + secretInfo + '\'' +
                '}';
    }
}
