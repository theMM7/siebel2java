package lesson_9.jackson;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ObjectMapperExample {

    private static final String PATH = "C:\\Users\\maxON\\IdeaProjects\\ru.mts.siebel\\src\\main\\resources\\jackson\\user.json";

    public static void main(String[] args) {
        //writeObject();
        readObject();
    }

    private static void writeObject() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.findAndRegisterModules();

        UserForJson userForJson = new UserForJson("Value for first name", "Value for last name", 100, "12345");

        File file = new File(PATH);

        try {
            objectMapper.writeValue(file, userForJson);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void readObject() {
        ObjectMapper objectMapper = new ObjectMapper();
        //objectMapper.findAndRegisterModules();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        File file = new File(PATH);

        try {
            UserForJson userForJson = objectMapper.readValue(file, UserForJson.class);
            System.out.println("Прочитали объект из json: " + userForJson);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
