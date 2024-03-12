package lesson_6.collections;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Stack;

/**
 * FIFO - First in First out
 * LIFO - Last in First out
 */
public class FifoAndLifo {
    public static void main(String[] args) {
        stackExample();
        queueExample();
    }

    private static void stackExample() {
        System.out.println("------------------------ Stack ------------------------");
        System.out.println();

        Stack<String> numbers = new Stack<>();
        numbers.add("1");
        numbers.add("2");
        numbers.add("3");

        System.out.println("Пустой? " + numbers.isEmpty());
        System.out.println("Кол-во элементов " + numbers.size());

        System.out.println("Результат " + numbers);

        System.out.println("Получение первого элемента " + numbers.firstElement());
        System.out.println("Получение последнего элемента " + numbers.lastElement());

        numbers.push("4");
        System.out.println("push(4) -> " + numbers);

        System.out.println("Получение элемента с его удалением из Stack " + numbers.pop());
        System.out.println("Получение элемента без его удаления из Stack " + numbers.peek());
        System.out.println("Результат " + numbers);

        numbers.addAll(List.of("1", "2", "3", "4"));
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
        numbers.push(null);
        numbers.push(null);
        System.out.println("Добавление null значений " + numbers);

        numbers.add("7");
        numbers.add("7");
        numbers.push("7");
        numbers.push("7");
        System.out.println("Добавление дубликатов " + numbers);

        System.out.println("------------------------ Stack ------------------------");
        System.out.println();
    }

    private static void queueExample() {
        System.out.println("------------------------ Queue ------------------------");
        System.out.println();

        ArrayDeque<String> numbers;

//        numbers = new ArrayDeque<>();
//        numbers = new ArrayDeque<>(10);
        numbers = new ArrayDeque<>(List.of("1", "2", "3"));

        System.out.println("Пустой? " + numbers.isEmpty());
        System.out.println("Кол-во элементов " + numbers.size());

        System.out.println("Результат " + numbers);

        System.out.println("Получение первого элемента " + numbers.getFirst());
        System.out.println("Получение последнего элемента " + numbers.getLast());

        numbers.add("4");
        System.out.println("add(4) -> " + numbers);

//        numbers.poll();
//        numbers.peek();
//        numbers.pop();
//        numbers.pollFirst();
//        numbers.pollLast();

        numbers.addAll(List.of("1", "2", "3", "4"));
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

//        numbers.add(null);
//        numbers.add(null);
//        numbers.push(null);
//        numbers.push(null);
        System.out.println("Добавление null значений " + numbers);

        numbers.add("7");
        numbers.add("7");
        numbers.push("7");
        numbers.push("7");
        System.out.println("Добавление дубликатов " + numbers);

        System.out.println("------------------------ Queue ------------------------");
        System.out.println();
    }
}
