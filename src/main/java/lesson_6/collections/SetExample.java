package lesson_6.collections;

import java.util.Iterator;
import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        hashSetExample();
        treeSetExample();
    }

    private static void hashSetExample() {
        System.out.println("------------------------ HashSet ------------------------");
        System.out.println();

        HashSet<String> numbers;

//        numbers = new HashSet<>();
//        numbers = new HashSet<>(100);
//        numbers = new HashSet<>(100, 0.75F);
        numbers = new HashSet<>(List.of("1", "2", "3"));

        System.out.println("Пустой? " + numbers.isEmpty());
        System.out.println("Кол-во элементов " + numbers.size());

        System.out.println("Получение первого элемента " + findFirst(numbers));
        System.out.println("Получение последнего элемента " + findLst(numbers));

        numbers.add("4");
        System.out.println("add(4) -> " + numbers);

        numbers.addAll(List.of("1", "2", "3", "4", "5"));
        System.out.println("addAll(List) -> " + numbers);

        numbers.retainAll(List.of("2", "3"));
        System.out.println("retainAll -> " + numbers);

        System.out.println("Содержится ли в списке элемент '3' " + numbers.contains("3"));
        System.out.println("Содержится ли в списке элемент '10' " + numbers.contains("10"));

        numbers.remove("3");
        System.out.println("remove(3) -> " + numbers);

        numbers.removeAll(List.of("1", "2", "3"));
        System.out.println("removeAll(List) -> " + numbers);

        numbers.clear();

        System.out.println("Пустой? " + numbers.isEmpty());

        numbers.add(null);
        numbers.add(null);
        numbers.add(null);
        System.out.println("Добавление null значений " + numbers);

        numbers.add("7");
        numbers.add("7");
        numbers.add("7");
        System.out.println("Добавление дубликатов " + numbers);

        System.out.println("------------------------ HashSet ------------------------");
        System.out.println();
    }

    private static String findFirst(HashSet<String> numbers) {
//        String firstEle;
//        for (String val : numbers) {
//            firstEle = val;
//            break;
//        }
//        return firstEle;

        Iterator<String> stringIterator = numbers.iterator();

        if (stringIterator.hasNext()) {
            return stringIterator.next();
        }
        return null;
    }

    private static String findLst(HashSet<String> numbers) {
        String lastElement = null;

        for (String element : numbers) {
            lastElement = element;
        }

        return lastElement;
    }

    private static void treeSetExample() {
        System.out.println("------------------------ TreeSet ------------------------");
        System.out.println();

        TreeSet<String> names;

        SortedSet<String> sortedNames = new TreeSet<>(String::compareToIgnoreCase);
        sortedNames.add("Mike");
        sortedNames.add("John");
        sortedNames.add("Alex");

//        names = new TreeSet<>();
//        names = new TreeSet<>(String::compareTo);
//        names = new TreeSet<>(List.of("Jane", "Rick"));
        names = new TreeSet<>(sortedNames);

        System.out.println("Пустой? " + names.isEmpty());
        System.out.println("Кол-во элементов " + names.size());

        System.out.println("Получение первого элемента " + names.first());
        System.out.println("Получение последнего элемента " + names.last());

        names.add("Jake");
        System.out.println("add(Jake) -> " + names);

        names.addAll(List.of("Bill", "Mike", "Elon"));
        System.out.println("addAll(List) -> " + names);

        names.retainAll(List.of("Elon", "Mike", "Rick", "Alex", "John"));
        System.out.println("retainAll -> " + names);

        System.out.println("Содержится ли в списке элемент 'Alex' " + names.contains("Alex"));
        System.out.println("Содержится ли в списке элемент 'Ваня' " + names.contains("Ваня"));

        names.remove("John");
        System.out.println("remove(John) -> " + names);

        names.removeAll(List.of("Mike", "Alex"));
        System.out.println("removeAll(List) -> " + names);

//        names.add(null);
//        names.add(null);
//        names.add(null);
        System.out.println("Добавление null значений " + names);

        names.add("Mike");
        names.add("Mike");
        names.add("Mike");
        System.out.println("Добавление дубликатов " + names);

        System.out.println("------------------------ TreeSet ------------------------");
        System.out.println();
    }
}
