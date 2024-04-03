package lesson_9.file_and_io;

import java.io.*;

public class Input {

    public static void main(String[] args) {
        //inputStream();
        //fileInput();
        //fileInput2();
        //buffered();
        //dataInput();
        objectInput();
    }

    public static void inputStream() {
        byte[] array1 = new byte[]{1, 3, 5, 7};

        ByteArrayInputStream bis1 = new ByteArrayInputStream(array1);

        System.out.println("array of bytes: ");
        int b;
        while ((b = bis1.read()) != -1) {
            System.out.println(b);
        }

        String text = "Hello world!";
        byte[] array2 = text.getBytes();

        ByteArrayInputStream bis2 = new ByteArrayInputStream(array2, 0, 5);

        System.out.println("string: ");
        while ((b = bis2.read()) != -1)
            System.out.println((char) b);
    }

    public static void fileInput() {
        String path = "C:\\Users\\maxON\\IdeaProjects\\ru.mts.siebel\\src\\main\\resources\\testFileInput.txt";

        try (FileInputStream fis = new FileInputStream(path)) {
            System.out.println("Размер файла: " + fis.available() + " байт(а)");

            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void fileInput2() {
        String path = "C:\\Users\\maxON\\IdeaProjects\\ru.mts.siebel\\src\\main\\resources\\testFileInput.txt";
        try (FileInputStream fis = new FileInputStream(path)) {
            byte[] buffer = new byte[fis.available()];
            // чтение файла в буфер
            fis.read(buffer, 0, fis.available());

            System.out.println("Содержимое файла:");
            for (byte b : buffer) {
                System.out.print((char) b);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void buffered() {
        String text = "Hello world!";

        byte[] testByte = text.getBytes();

        ByteArrayInputStream bais = new ByteArrayInputStream(testByte);

        try (BufferedInputStream bis = new BufferedInputStream(bais)) {
            int c;
            while ((c = bis.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void dataInput() {
        String path = "src/main/resources/data.txt";
        try (DataInputStream dis = new DataInputStream(new FileInputStream(path))) {
            String name = dis.readUTF();
            int age = dis.readInt();
            double height = dis.readDouble();
            boolean married = dis.readBoolean();
            System.out.printf("Человека зовут: %s ; " +
                            "его возраст: %d , " +
                            "его рост: %f метров, " +
                            "женат/замужем: %b",
                    name, age, height, married);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void objectInput() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\maxON\\IdeaProjects\\ru.mts.siebel\\src\\main\\resources\\persons.txt"));

            Person person = (Person) ois.readObject();
            System.out.printf("Имя: %s \t Возраст: %d \n", person.getName(), person.getAge());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
