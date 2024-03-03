package lesson_3.construction;

public class Cycles {

    public void doWhileCycle() {
        int first = 1;

        do {
            System.out.println("Значение счетчика = " + first);
            first++;
        } while (first < 10);
    }

    public void doWhileInfinityCycle() {
        int first = 1;

        do {
            System.out.println("Значение счетчика = " + first);
        } while (first < 10);
    }

    public void whileCycle() {
        int first = 6;

        while (first > 0) {
            System.out.println("Значение счетчика = " + first);
            first--;
        }
    }

    public void whileInfinityCycle() {
        int first = 6;

        while (first > 0) {
            System.out.println("Значение счетчика = " + first);
        }
    }

    public void forCycle() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Значение счетчика = " + i);
        }
    }

    public void forInfinityCycle() {
        for (;;) {
            System.out.println("Бесконечный цикл");
        }
    }

    public void forWithBreak() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("Значение счетчика = " + i);
        }
    }

    public void forWithContinue() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("Значение счетчика = " + i);
        }
    }

    public static void main(String[] args) {
        Cycles cycles = new Cycles();

        cycles.forWithBreak();
        cycles.forWithContinue();
    }
}
