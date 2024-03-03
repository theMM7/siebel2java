package lesson_3.initialization;

public class Child extends Parent {
    private static final String CONSTANT = "Консатнта наследника";
    private String childField = "Переменная наследника";

    static {
        System.out.println("Статичный блок наследника");
    }

    public Child() {
        System.out.println("Конструктор наследника");
    }

    @Override
    public void someMethod() {
        System.out.println("Метод наследника");
    }

    @Override
    public void defaultMethod() {
        super.defaultMethod();
    }
}
