package lesson_3.oop;

public class Encapsulation {

    public static void main(String[] args) {
        WrongClass wrongClass = new WrongClass();
        wrongClass.age = 1000000000;
        wrongClass.name = "wrongName";
        wrongClass.isTrue = false;

        GoodClass goodClass = new GoodClass();
    }
}
