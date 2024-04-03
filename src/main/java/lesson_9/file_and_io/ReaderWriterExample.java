package lesson_9.file_and_io;

import java.io.*;

public class ReaderWriterExample {

    public static void main(String[] args) {
        //bufferedReader();
        bufferedWriter();
    }

    public static void bufferedReader() {
        String inputFileName = "file.txt";

        long lines = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            while (reader.readLine() != null) lines++;
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Count of lines: " + lines);
    }

    public static void bufferedWriter() {
        String content = "Строка для записи в файл";
        File file = new File("filename.txt");

        try {
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
