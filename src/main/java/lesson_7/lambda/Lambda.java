package lesson_7.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda {

    static int first = 10;

    public static void main(String[] args) {
        //executePrint();
        //executeLocalVariable();
        //lambdaWithGeneric();
        standardFuncInterface();
    }

    private static void executePrint() {
        Printable printable;

        //printable = () -> System.out.println("print");
        printable = (text, size) -> System.out.println(text + " size = " + size);

        //printable.print();
        printable.print("Print by argument with size", 10);
    }

    private static void executeLocalVariable() {
        int second = 100;

        Calculate calculate = () -> {
            first = 40;
            //second = 50;
            System.out.println("Default values first=" + first + " second=" + second);
            return first + second;
        };

        calculate.execute();
        System.out.println(first);
    }

    private static void lambdaWithGeneric() {
        Operation<String, Integer> stringOperation = (first, second) -> Integer.valueOf(first) + Integer.valueOf(second);
        Operation<Integer, String> integerOperation = (first, second) -> String.valueOf(first + second);

        System.out.println(stringOperation.execute("100", "120"));
        System.out.println(integerOperation.execute(432, 956));
    }

    private static void standardFuncInterface() {
        Predicate<Integer> integerPredicate = number -> number > 0;
        System.out.println(integerPredicate.test(100));
        System.out.println(integerPredicate.test(-100));

        Consumer<String> stringConsumer = System.out::println;
        stringConsumer.accept("Test for print");

        Supplier<String> stringSupplier = () -> "constant for supplier";
        System.out.println(stringSupplier.get());

        Function<String, Integer> function = Integer::valueOf;
        System.out.println(function.apply("10"));
    }
}
