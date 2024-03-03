package lesson_3.oop;

public class Inheritance {

    public static void main(String[] args) {
        Parent parent = new Parent(7);
        System.out.println(parent.getNumber());

        Child child = new Child(15);
        System.out.println(child.getNumber());

        child.doSmth();
        child.doSmthTwo();
    }
}
