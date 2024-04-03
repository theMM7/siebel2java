package lesson_9.jackson;

import java.io.*;

public class ExternalizeExample {
    private static final String PATH = "C:\\Users\\maxON\\IdeaProjects\\ru.mts.siebel\\src\\main\\resources\\jackson\\externalizeData.txt";

    public static void main(String[] args) {
        writeToFile();
        readFromFile();
    }

    private static void writeToFile() {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(PATH))) {
            User userInfo = new User("Ivan", "Ivanov", 55, "78945");
            objectOutputStream.writeObject(userInfo);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void readFromFile() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(PATH))) {
            User user = (User) objectInputStream.readObject();
            System.out.println("Был считан объект из файла " + user);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
