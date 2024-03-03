package lesson_3.operators;

public class Bits {

    public static void main(String[] args) {
        int first = 123;

        //1111011
        System.out.println(Integer.toBinaryString(first));

        //11111111111111111111111110000100
        System.out.println(Integer.toBinaryString(~first));

        int second = 321;

        //101000001
        System.out.println(Integer.toBinaryString(second));

        //1000001
        System.out.println(Integer.toBinaryString(first & second));

        //101111011
        System.out.println(Integer.toBinaryString(first | second));

        //100111010
        System.out.println(Integer.toBinaryString(first ^ second));

        int count = 5;

        //11
        System.out.println(Integer.toBinaryString(first >> count));

        //111101100000
        System.out.println(Integer.toBinaryString(first << count));
    }
}
