package lesson_3.class_type;

public interface InterfaceExample {
    void method();
    void methodTwo();
    default int defaultMethod() {
        System.out.println("Реализация по умолчанию");
        return 1;
    }
}
