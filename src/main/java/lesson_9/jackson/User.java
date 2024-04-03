package lesson_9.jackson;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Base64;

public class User implements Externalizable {
    private String firstName;
    private String lastName;
    private int age;
    private String secretInfo;

    public User() {
    }

    public User(String firstName, String lastName, int age, String secretInfo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.secretInfo = secretInfo;
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
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(firstName);
        out.writeUTF(lastName);
        out.writeInt(age);
        out.writeUTF(encryptString(secretInfo));
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.firstName = in.readUTF();
        this.lastName = in.readUTF();
        this.age = in.readInt();
        this.secretInfo = decryptString(in.readUTF());
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", secretInfo='" + secretInfo + '\'' +
                '}';
    }

    private String encryptString(String data) {
        return Base64.getEncoder().encodeToString(data.getBytes());
    }


    private String decryptString(String data) {
        return new String(Base64.getDecoder().decode(data));
    }

}
