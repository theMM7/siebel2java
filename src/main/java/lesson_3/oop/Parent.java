package lesson_3.oop;

public class Parent {
    private int number;
    public Parent(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void doSmth() {
        System.out.println("Что-то делает");
    }
}
