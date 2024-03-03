package lesson_3.oop;

public class Child extends Parent {
    private int childNumber;
    public Child(int number) {
        super(number);
        this.childNumber = number;
    }

    @Override
    public int getNumber() {
        System.out.println("Постановка на мониторинг");
        return super.getNumber();
    }

    public void doSmthTwo() {
        System.out.println("Делаю все по своему");
    }
}
