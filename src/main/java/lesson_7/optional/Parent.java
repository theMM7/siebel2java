package lesson_7.optional;

public class Parent {
    private String name;
    private Child child;

    public Parent(String name, Child child) {
        this.name = name;
        this.child = child;
    }

    public String getName() {
        return name;
    }

    public Child getChild() {
        return child;
    }
}
