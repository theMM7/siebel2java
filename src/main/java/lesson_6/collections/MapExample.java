package lesson_6.collections;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListMap;

public class MapExample {
    public static void main(String[] args) {
        hashMapExample();
        treeMapExample();
    }

    private static void hashMapExample() {
        System.out.println("------------------------ HashMap ------------------------");
        System.out.println();

        HashMap<String, Integer> numbers;

//        numbers = new HashMap<>();
//        numbers = new HashMap<>(10);
//        numbers = new HashMap<>(10, 0.75F);
        numbers = new HashMap<>(Map.of("1", 1, "2", 2));

        System.out.println("Пустой? " + numbers.isEmpty());
        System.out.println("Кол-во элементов " + numbers.size());

        System.out.println("Результат " + numbers);

        System.out.println("Получение первого элемента " + getFirstElement(numbers));
        System.out.println("Получение последнего элемента " + getLastElement(numbers));
        System.out.println("Получение элемента get -> " + numbers.get("3"));
        System.out.println("Получение элемента getOrDefault(104) -> " + numbers.getOrDefault("104", 104));

        numbers.put("4", 4);
        System.out.println("put(4) -> " + numbers);

        numbers.putAll(Map.of("5", 5, "6", 6, "7", 7, "8", 8));
        System.out.println("putAll(Map) -> " + numbers);

        System.out.println("Содержится ли в списке ключ '3' " + numbers.containsKey("3"));
        System.out.println("Содержится ли в списке ключ '10' " + numbers.containsKey("10"));
        System.out.println("Содержится ли в списке значение '3' " + numbers.containsValue(3));
        System.out.println("Содержится ли в списке значение '10' " + numbers.containsValue(10));

        numbers.remove("3");
        System.out.println("remove(3) -> " + numbers);

        numbers.replace("7", 7, 107);
        System.out.println("replace -> " + numbers);

        numbers.clear();

        System.out.println("Пустой? " + numbers.isEmpty());

        numbers.put(null, 777);
        numbers.put(null, 777);
        numbers.put(null, 777);
        System.out.println("Добавление null значений " + numbers);

        numbers.put("777", 888);
        numbers.put("777", 888);
        numbers.put("777", 777);
        numbers.put("777", 111);
        System.out.println("Добавление дубликатов " + numbers);

        System.out.println("------------------------ HashMap ------------------------");
        System.out.println();
    }

    private static String getLastElement(HashMap<String, Integer> numbers) {
        List<String> keys = new ArrayList<>(numbers.keySet());
        return keys.get(keys.size() - 1) + "=" + numbers.get(keys.get(keys.size() - 1));
    }

    private static String getFirstElement(HashMap<String, Integer> numbers) {
//        Map.Entry<String, Integer> next = numbers.entrySet().iterator().next();
//        return next.getKey() + "=" + next.getValue();

        List<String> keys = new ArrayList<>(numbers.keySet());
        return keys.get(0) + "=" + numbers.get(keys.get(0));
    }

    private static void treeMapExample() {
        System.out.println("------------------------ TreeMap ------------------------");
        System.out.println();

        TreeMap<String, Integer> numbers;

//        numbers = new TreeMap<>();
//        numbers = new TreeMap<>(Map.of("1", 1, "2", 2));
//        numbers = new TreeMap<>(new ConcurrentSkipListMap<>());
        numbers = new TreeMap<>(String::compareTo);

        numbers.put("1", 1);
        numbers.put("2", 2);
        numbers.put("3", 3);

        System.out.println("Пустой? " + numbers.isEmpty());
        System.out.println("Кол-во элементов " + numbers.size());

        System.out.println("Результат " + numbers);

        numbers.put("4", 4);
        System.out.println("put(4) -> " + numbers);

        numbers.putAll(Map.of("5", 5, "6", 6, "7", 7, "8", 8));
        System.out.println("putAll(Map) -> " + numbers);

        System.out.println("Получение первого элемента " + numbers.firstEntry());
        System.out.println("Получение последнего элемента " + numbers.lastEntry());
        System.out.println("Получение элемента get -> " + numbers.get("3"));
        System.out.println("Получение элемента getOrDefault(104) -> " + numbers.getOrDefault("104", 104));

        System.out.println("Содержится ли в списке ключ '3' " + numbers.containsKey("3"));
        System.out.println("Содержится ли в списке ключ '10' " + numbers.containsKey("10"));
        System.out.println("Содержится ли в списке значение '3' " + numbers.containsValue(3));
        System.out.println("Содержится ли в списке значение '10' " + numbers.containsValue(10));

        numbers.remove("3");
        System.out.println("remove(3) -> " + numbers);

        numbers.replace("7", 7, 107);
        System.out.println("replace -> " + numbers);

        System.out.println("Данные до значение 5 " + numbers.headMap("5", true));
        System.out.println("Данные после значение 5 " + numbers.tailMap("5"));

        numbers.clear();

        System.out.println("Пустой? " + numbers.isEmpty());

//        numbers.put(null, 777);
//        numbers.put(null, 777);
//        numbers.put(null, 777);
        System.out.println("Добавление null значений " + numbers);

        numbers.put("777", 888);
        numbers.put("777", 888);
        numbers.put("777", 777);
        numbers.put("777", 777);
        System.out.println("Добавление дубликатов " + numbers);

        System.out.println("------------------------ TreeMap ------------------------");
        System.out.println();
    }
}
