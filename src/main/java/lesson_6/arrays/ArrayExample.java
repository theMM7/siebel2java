package lesson_6.arrays;

public class ArrayExample {
    public static void main(String[] args) {
        String[] intArray = new String[10];

        System.out.println(intArray.length);

        intArray[0] = "1";

        System.out.println(intArray.toString());

        int counter = 0;
        for (String current : intArray) {
            if (intArray.length > counter) {

            }
            counter++;
        }

        intArray[0] = null;

//        intArray[20] = 10;
//
//        System.out.println(intArray);
    }
}
