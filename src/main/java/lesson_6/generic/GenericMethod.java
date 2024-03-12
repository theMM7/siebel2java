package lesson_6.generic;

public class GenericMethod {

//    public static int findMaximum(int first, int second) {
//        if (first > second) {
//            return first;
//        }
//        return second;
//    }
//
//    public static double findMaximum(double first, double second) {
//        if (first > second) {
//            return first;
//        }
//        return second;
//    }
//
//    public static String findMaximum(String first, String second) {
//        return first;
//    }

    public static <T extends Comparable<T>> T findMaximum(T first, T second) {
        if (first.compareTo(second) > 0) {
            return first;
        }
        return second;
    }

    public static void main(String[] args) {
        System.out.println(findMaximum(100, 1));
        System.out.println(findMaximum(100.003, 1.43876));

        System.out.println(findMaximum("str1", "str2"));
    }
}
