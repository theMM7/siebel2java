package lesson_3.class_type;

import java.util.Objects;

public class SimpleClass {
    private String simpleField;

    public SimpleClass() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleClass that = (SimpleClass) o;
        return Objects.equals(simpleField, that.simpleField);
    }

    @Override
    public int hashCode() {
        return Objects.hash(simpleField);
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
