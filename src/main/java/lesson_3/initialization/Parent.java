package lesson_3.initialization;

public class Parent {
    private static final String CONSTANT = "Консатнта родителя";
    private String parentField = "Переменная родителя";

    static {
        System.out.println("Статичный блок родителя");
    }

    public Parent() {
        System.out.println("Конструктор родителя");
    }

    public void someMethod() {
        System.out.println("Метод родителя");
    }

    public void defaultMethod() {
        System.out.println("Дефолтный метод родителя");
    }
}
