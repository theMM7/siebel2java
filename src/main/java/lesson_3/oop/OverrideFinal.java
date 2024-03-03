package lesson_3.oop;

public class OverrideFinal extends FinalClass {
    public OverrideFinal(int number, String text) {
        super(number, text);
    }

    public static void main(String[] args) {
        OverrideFinal overrideFinal = new OverrideFinal(1, "text");
        overrideFinal.someMethod();
    }
}
