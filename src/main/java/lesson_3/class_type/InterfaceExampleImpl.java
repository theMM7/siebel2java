package lesson_3.class_type;

import java.io.Serializable;

public class InterfaceExampleImpl implements InterfaceExample, Cloneable {
    @Override
    public void method() {
        System.out.println("Переопределенный метод");
    }

    @Override
    public void methodTwo() {

    }

    public static void main(String[] args) {
        InterfaceExample example = new InterfaceExampleImpl();

        example.method();
        example.defaultMethod();
    }
}
