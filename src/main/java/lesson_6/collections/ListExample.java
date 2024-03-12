package lesson_6.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        arrayListExample();
        linkedListExample();
    }

    private static void arrayListExample() {
        System.out.println("------------------------ ArrayList ------------------------");
        System.out.println();

        List<String> numbers;

//        numbers = new ArrayList<>();
//        numbers = new ArrayList<>(100);
        numbers = new ArrayList<>(List.of("1", "2", "3"));


        numbers.add("4");
        System.out.println("add(4) -> " + numbers);

        numbers.add(0, "0");
        System.out.println("add(0, 0) by index -> " + numbers);

        System.out.println("Пустой? " + numbers.isEmpty());
        System.out.println("Кол-во элементов " + numbers.size());

        System.out.println("Получение первого элемента " + numbers.get(0));
        System.out.println("Получение последнего элемента " + numbers.get(numbers.size() - 1));
        System.out.println("Получение элемента " + numbers.get(3));


        numbers.addAll(List.of("1", "2", "3", "4"));
        System.out.println("addAll(List) -> " + numbers);

        System.out.println("Содержится ли в списке элемент '3' " + numbers.contains("3"));
        System.out.println("Содержится ли в списке элемент '10' " + numbers.contains("10"));

        System.out.println("Index элемента '3' " + numbers.indexOf("3"));

        numbers.remove("4");
        System.out.println("remove(4) -> " + numbers);

        numbers.removeAll(List.of("1", "2", "3"));
        System.out.println("removeAll(List) -> " + numbers);

        numbers.add(null);
        numbers.add(null);
        numbers.add(null);
        System.out.println("Добавление null значений " + numbers);

        numbers.add("7");
        numbers.add("7");
        numbers.add("7");
        System.out.println("Добавление дубликатов " + numbers);

        System.out.println("------------------------ ArrayList ------------------------");
        System.out.println();
    }


    private static void linkedListExample() {
        System.out.println("------------------------ LinkedList ------------------------");
        System.out.println();

        LinkedList<String> numbers;

        //numbers = new LinkedList<>();
        numbers = new LinkedList<>(List.of("1", "2", "3"));

        numbers.add("4");
        numbers.addLast("4");
        System.out.println("add(4) -> " + numbers);

        System.out.println("Пустой? " + numbers.isEmpty());
        System.out.println("Кол-во элементов " + numbers.size());

        System.out.println("Получение первого элемента " + numbers.getFirst());
        System.out.println("Получение последнего элемента " + numbers.getLast());

        numbers.add(0, "0");
        numbers.addFirst("0");
        System.out.println("add(0) by index -> " + numbers);

        numbers.addAll(List.of("1", "2", "3", "4"));
        System.out.println("addAll(List) -> " + numbers);

        System.out.println("Содержится ли в списке элемент '3' " + numbers.contains("3"));
        System.out.println("Содержится ли в списке элемент '10' " + numbers.contains("10"));

        System.out.println("Index элемента '3' " + numbers.indexOf("3"));

        numbers.remove("4");
        System.out.println("remove(4) -> " + numbers);

        numbers.removeAll(List.of("1", "2", "3"));
        System.out.println("removeAll(List) -> " + numbers);

        System.out.println("Пустой? " + numbers.isEmpty());

        numbers.add(null);
        numbers.add(null);
        numbers.add(null);
        System.out.println("Добавление null значений " + numbers);

        numbers.add("7");
        numbers.add("7");
        numbers.add("7");
        System.out.println("Добавление дубликатов " + numbers);

        System.out.println("------------------------ LinkedList ------------------------");
        System.out.println();
    }
}
