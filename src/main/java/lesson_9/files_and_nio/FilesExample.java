package lesson_9.files_and_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FilesExample {

    public static void main(String[] args) {
        //createDirectory();
        //createFile();
        //walk();
        //write();
        readStr();
    }

    private static void createDirectory() {
        Path path = Paths.get("src", "main", "resources", "testNioDir");

        try {
            Files.createDirectory(path);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void createFile() {
        Path path = Paths.get("src", "main", "resources", "testNioDir", "test.txt");

        try {
            Files.createFile(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void walk() {
        Path path = Paths.get("src", "main", "resources", "testDir");

        try (Stream<Path> pathStream = Files.walk(path)) {
            pathStream
                    .filter(Files::exists)
                    .filter(Files::isWritable)
                    .forEach(file -> System.out.println(file.getFileName()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void write() {
        Path path = Paths.get("src", "main", "resources", "testNioDir", "test.txt");

        try {
            Files.writeString(path, "Строка для записи в файл");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void readStr() {
        Path path = Paths.get("src", "main", "resources", "testNioDir", "test.txt");

        try {
            System.out.println(Files.readString(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void readAll() {
        Path path = Paths.get("src", "main", "resources", "testNioDir", "test.txt");

        try {
            Files.readAllLines(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
