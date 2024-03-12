package lesson_6.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Iterator {
    public static void main(String[] args) {
        List<String> brands = new ArrayList<>();
        brands.add("Puma");
        brands.add("Nike");
        brands.add("Reebok");

        //cycleWithIterator(brands);

        //arrayRemove();
        //removeByMethod(brands);
        //removeByIterator(brands);
        //addNew(brands);
    }

    private static void cycleWithIterator(List<String> brands) {
        for (String brandName : brands) {
            System.out.println("Выполняем логику над именем бренда " + brandName);
        }

        for (java.util.Iterator<String> iterator = brands.iterator(); iterator.hasNext(); ) {
            String brandName = iterator.next();
            System.out.println("Выполняем логику над именем бренда " + brandName);
        }

        java.util.Iterator<String> whileIterator = brands.iterator();
        while (whileIterator.hasNext()) {
            String brandName = whileIterator.next();
            System.out.println("Выполняем логику над именем бренда " + brandName);
        }
    }

    static void arrayRemove() {
        String [] brands = new String[3];
        brands[0] = "Puma";
        brands[1] = "Nike";
        brands[2] = "Reebok";

        System.out.println(Arrays.toString(brands));

        brands[0] = null;

        System.out.println(Arrays.toString(brands));
    }

    static void removeByMethod(List<String> brands) {
        for (String brandName : brands) {
            if ("Puma".equals(brandName)) {
                brands.remove(brandName);
            }
        }
    }

    static void removeByIterator(List<String> brands) {
        java.util.Iterator<String> whileIterator = brands.iterator();
        while (whileIterator.hasNext()) {
            String brandName = whileIterator.next();
            if ("Puma".equals(brandName)) {
                whileIterator.remove();
            }
        }
    }

    static void addNew(List<String> brands) {
        for (String brandName : brands) {
            if ("Puma".equals(brandName)) {
                brands.add("adidas");
            }
        }
    }
}
