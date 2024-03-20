package lesson_7.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    private static final List<People> MAIN_PEOPLE_LIST = List.of(
            new People("Basillio", 30, Sex.MAN),
            new People("Ann", 33, Sex.WOMAN),
            new People("Andrew", 17, Sex.MAN),
            new People("Ariana", 43, Sex.WOMAN),
            new People("Mike", 23, Sex.MAN),
            new People("Mary", 64, Sex.WOMAN),
            new People("John", 73, Sex.MAN),
            new People("Julia", 51, Sex.WOMAN),
            new People("Jack", 37, Sex.MAN),
            new People("Veronica", 10, Sex.WOMAN));

    private static final List<People> ADDITIONAL_PEOPLE_LIST = List.of(
            new People("Pavel", 23, Sex.MAN),
            new People("Marina", 34, Sex.WOMAN),
            new People("Petr", 45, Sex.MAN));

    private static final List<List<People>> NESTED_PEOPLE_LIST = List.of(
            MAIN_PEOPLE_LIST,
            ADDITIONAL_PEOPLE_LIST);

    public static void main(String[] args) {
        //initialize();

        System.out.println("findMans " + findMans());
        System.out.println("findAverageMansAge " + findAverageMansAge());
        System.out.println("findWorkers " + findWorkers());
        System.out.println("checkOldest " + checkOldest());
        System.out.println("sortedByAlphabet " + sortedByAlphabet());
        System.out.println("sortedBySexAndAge " + sortedBySexAndAge());
        System.out.println("maxAge " + maxAge());
        System.out.println("minAge " + minAge());

        System.out.println(">> forEachPrint");
        forEachPrint();
        System.out.println(">> forEachPrint");

        System.out.println("reduceAgeSum " + reduceAgeSum());
        System.out.println("reduceOddAgeSum " + reduceOddAgeSum());
        System.out.println("partitioningPeople " + partitioningPeople());
        System.out.println("concatStream " + concatStream());
        System.out.println("flatMap " + flatMap());


    }

    private static void initialize() {
        Stream<String> stringStream = Stream.of("Лондон", "Париж", "Москва");

        List<String> stringList = List.of("Лондон", "Париж", "Москва");
        Stream<String> stream = stringList.stream();

        System.out.println(stream.collect(Collectors.toList()));
        //System.out.println(stream.collect(Collectors.toList()));
    }

    /**
     * Выбрать мужчин в возрасте от 18 до 25 лет
     */
    private static List<People> findMans() {
        return MAIN_PEOPLE_LIST.stream()
                .filter(p -> p.getSex() == Sex.MAN)
                .filter(p -> p.getAge() >= 18 && p.getAge() < 25)
                .collect(Collectors.toList());
    }

    /**
     * Найти средний возраст среди мужчин
     */
    private static Double findAverageMansAge() {
        return MAIN_PEOPLE_LIST.stream()
                .filter(p -> p.getSex() == Sex.MAN)
                .mapToInt(People::getAge)
                .average()
                .orElseThrow(() -> new RuntimeException("Не удалось подсчитать средний возраст"));
    }

    /**
     * Найти кол-во потенциально работоспособных людей в выборке
     * (т.е. от 18 лет и учитывая что женщины выходят в 58 лет, а мужчина в 63)
     */
    private static long findWorkers() {
        return MAIN_PEOPLE_LIST.stream()
                .filter(p -> p.getAge() >= 18)
                .filter(p -> (p.getSex() == Sex.WOMAN && p.getAge() < 58) || (p.getSex() == Sex.MAN && p.getAge() < 63))
                .count();
    }

    /**
     * Существует ли человек с возрастом больше 100
     */
    private static boolean checkOldest() {
        //return MAIN_PEOPLE_LIST.stream().anyMatch(p -> p.getAge() > 100);
        //return MAIN_PEOPLE_LIST.stream().noneMatch(p -> p.getAge() > 100);
        return MAIN_PEOPLE_LIST.stream().allMatch(p -> p.getAge() > 100);
    }

    /**
     * Отсортировать коллекцию людей по имени в обратном алфавитном порядке
     */
    private static List<People> sortedByAlphabet() {
        return MAIN_PEOPLE_LIST.stream()
                .sorted((o1, o2) -> -o1.getName().compareTo(o2.getName()))
                .collect(Collectors.toList());
    }

    /**
     * Отсортировать коллекцию людей сначала по полу, а потом по возрасту
     */
    private static List<People> sortedBySexAndAge() {
        return MAIN_PEOPLE_LIST.stream()
                .sorted((o1, o2) ->
                        o1.getSex() != o2.getSex()
                                ? o1.getSex().compareTo(o2.getSex())
                                : o1.getAge().compareTo(o2.getAge()))
                .collect(Collectors.toList());
    }

    /**
     * Найдем человека с максимальным возрастом
     */
    private static People maxAge() {
        return MAIN_PEOPLE_LIST.stream()
                .max(Comparator.comparing(People::getAge))
                .orElseGet(() -> new People("Дефолтный максимум", 10000, Sex.MAN));
    }

    /**
     * Найдем человека с минимальным возрастом
     */
    private static People minAge() {
        return MAIN_PEOPLE_LIST.stream()
                .min(Comparator.comparing(People::getAge))
                .orElseGet(() -> new People("Дефолтный минимум", 1, Sex.MAN));
    }

    /**
     * Вывести все имена
     */
    private static void forEachPrint() {
        MAIN_PEOPLE_LIST.stream()
                .map(People::getName)
                .forEach(name -> System.out.println("Current name: " + name));
    }

    /**
     * Вычисление суммы всех возрастов
     */
    private static Optional<Integer> reduceAgeSum() {
        return MAIN_PEOPLE_LIST.stream()
                .map(People::getAge)
                .reduce(Integer::sum);
        //.reduce((p1, p2) -> p1 + p2);
    }

    /**
     * Сумма нечетных возрастов
     */
    private static int reduceOddAgeSum() {
        return MAIN_PEOPLE_LIST.stream()
                .map(People::getAge)
                .filter(o -> o % 2 != 0)
                .reduce(Integer::sum) //.resuce((p1, p2) -> p1 + p2)
                .orElseGet(() -> {
                    System.out.println("Не удалось вычислить сумму нечетных возрастов");
                    return -1;
                });
    }

    /**
     * Разделить людей по четным и нечетным возрастам
     */
    private static Map<Boolean, List<People>> partitioningPeople() {
        return MAIN_PEOPLE_LIST.stream()
                .collect(Collectors.partitioningBy((p) -> p.getAge() % 2 == 0));
    }

    /**
     * Мерж двух стримов в одну коллекцию
     */
    private static List<People> concatStream() {
        return Stream.concat(MAIN_PEOPLE_LIST.stream(), ADDITIONAL_PEOPLE_LIST.stream())
                .collect(Collectors.toList());
    }

    private static List<People> flatMap() {
        return NESTED_PEOPLE_LIST.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }
}
