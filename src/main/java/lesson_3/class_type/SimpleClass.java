package lesson_3.class_type;

public class SimpleClass {
    private String simpleField;

    public SimpleClass() {
    }

    public SimpleClass(String simpleField) {
        this.simpleField = simpleField;
    }

    public void simpleMethod() {
        System.out.println("Метод для вывода значения переменной: " + simpleField);
    }

    public static void main(String[] args) {
        SimpleClass first = new SimpleClass("First object");
        SimpleClass second = new SimpleClass("Second object");

        first.simpleMethod();
        second.simpleMethod();
    }
}
