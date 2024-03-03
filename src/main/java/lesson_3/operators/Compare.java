package lesson_3.operators;

public class Compare {
    public static void main(String[] args) {
        compareNumber(10, 5);
        compareNumber(5, 10);
        compareNumber(5, 5);
    }

    public static void compareNumber(int first, int second) {
        System.out.println(first + " > " + second + " = " + (first > second));
        System.out.println(first + " < " + second + " = " + (first < second));

        System.out.println(first + " == " + second + " = " + (first == second));
        System.out.println(first + " != " + second + " = " + (first != second));

        System.out.println(first + " >= " + second + " = " + (first >= second));
        System.out.println(first + " <= " + second + " = " + (first <= second));

        System.out.println("--------------------------------------");
    }
}
