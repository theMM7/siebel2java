package lesson_3.variables;

public class VariablesExample {

    public final static int GLOBAL_CONSTANT = 42;
    private final static String STATIC_CLASS_CONSTANT = "Статичная константа класса";

    final static VariablesExample REF_EXAMPLE = new VariablesExample();

    String text = "Переменная экземпляра";

    public void someMethodWithLocal() {
        int localVariable = 10;
        System.out.println("Локальаня переменная " + localVariable);
    }

    public void someMethodWithParameters(int firstParameter, int secondParameter) {
        System.out.println("Параметры firstParameter = " + firstParameter + " secondParameter = " + secondParameter);
    }

    public void shadowing() {
        String text = "Переменная, которая затеняет исходный текст";
        System.out.println(text);
        System.out.println(this.text);
    }

    public void shadowingByArgument(String text) {
        System.out.println(text);
        System.out.println(this.text);
    }

    public static void main(String[] args) {
        VariablesExample first = new VariablesExample();

        VariablesExample second = new VariablesExample();
        second.text = "обновленная переменная для второго экземпляра";

        int result = VariablesExample.GLOBAL_CONSTANT;

        first.someMethodWithLocal();
        first.someMethodWithParameters(1, 1);
    }
}
