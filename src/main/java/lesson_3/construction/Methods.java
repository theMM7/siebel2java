package lesson_3.construction;

public class Methods extends AbstractMethod {

    @Override
    public void overrideMethod() {
        System.out.println("Метод класса-наследника");
    }

    public void overloadMethod() {

    }

    public void overloadMethod(int number) {

    }

    public void overloadMethod(String date) {

    }

    public void overloadMethod(String date, int number) {

    }

    public static void varargMethod(int... numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        varargMethod(1, 2, 3, 4, 5);
    }
}
