package lesson_9.file_and_io;

import java.io.*;

public class Output {
    public static void main(String[] args) {
        //byteArray();
        //byteArray2();
        //fileOutput();
        buffered();
        //dataOutput();
        //print();
    }

    public static void byteArray() {
        String text = "Hello World!";
        byte[] buffer = text.getBytes();

        try (ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            bos.write(buffer);

            System.out.println("1. " + bos);

            System.out.print("2. ");
            byte[] array = bos.toByteArray();
            for (byte b : array) {
                System.out.print((char) b);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void byteArray2() {
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
            byteArrayOutputStream.write("Пример использования метода writeTo".getBytes());

            try (OutputStream fileOutputStream = new FileOutputStream("output.txt")) {
                byteArrayOutputStream.writeTo(fileOutputStream);

                System.out.println("Данные успешно записаны в файл 'output.txt'");
            } catch (IOException e) {
                System.out.println("Ошибка при записи в файл: " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Ошибка при записи в ByteArrayOutputStream: " + e.getMessage());
        }
    }

    public static void fileOutput() {
        String text = "Hello Wolrd!";
        byte[] buffer = text.getBytes();

        try (ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            bos.write(buffer);

            try (FileOutputStream fos = new FileOutputStream("hello.txt")) {
                bos.writeTo(fos);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void buffered() {
        String text = "Hello world!";
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("file.txt"))) {
            byte[] buffer = text.getBytes();
            bos.write(buffer, 0, buffer.length);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }

    public static void dataOutput() {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("src/main/resources/data.txt"))) {

            dos.writeUTF("Кирилл");
            dos.writeInt(30);
            dos.writeDouble(20.58);
            dos.writeBoolean(false);

            System.out.println("Запись в файл выполнена");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void print() {
        String text = "Hello, World!";
        try (PrintStream printStream = new PrintStream(new FileOutputStream("data.txt"))) {
            printStream.println(text);
            System.out.println("Запись в файл выполнена");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
