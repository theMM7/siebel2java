package lesson_3.oop;

public /*final*/ class FinalClass {
    private final int number;
    private final String text;

    public FinalClass(int number, String text) {
        this.number = number;
        this.text = text;
    }

    public final void someMethod() {
        System.out.println("Метод, который нельзя переопределить");
    }
}
