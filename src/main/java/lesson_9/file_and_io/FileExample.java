package lesson_9.file_and_io;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/testDir/test.txt");

        System.out.println(file.getPath());
        System.out.println(file.getAbsoluteFile());

        System.out.println("Файл существует? " + file.exists());
        System.out.println("Это точно файл? " + file.isFile());
        System.out.println("Может быть это директория? " + file.isDirectory());

        printNames(file);

        System.out.println("Можно ли писать в файл? " + file.canWrite());
        System.out.println("Можно ли читать файл? " + file.canRead());

        file.setWritable(true);
        file.setReadable(false);

        System.out.println("А теперь можно ли писать в файл? " + file.canWrite());
        System.out.println("Можно ли читать файл? " + file.canRead());

//        boolean isRename = file.renameTo(new File("src/main/resources/testDir/test.txt"));
//
//        System.out.println("Перименование прошло " + isRename);
    }

    private static void printNames(File originalFile) {
        File folder = originalFile.getParentFile();

        if (folder.isDirectory()) {
            for (File file : folder.listFiles()) {
                System.out.println(file.getName());
            }
        }
    }
}
