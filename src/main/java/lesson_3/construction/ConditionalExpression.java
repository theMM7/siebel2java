package lesson_3.construction;

public class ConditionalExpression {

    public void ifElse(int first) {

        if (first > 10) {
            System.out.println("Значение больше 10");
        } else if (first < 5) {
            System.out.println("Значение меньше 5");
        } else {
            System.out.println("Дефолтное поведение");
        }
    }

    public void switchExpression(int first) {
        switch (first) {
            case 1:
                System.out.println("Число равно 1");
                break;
            case 2:
                System.out.println("Число равно 2");
                break;
            default:
                System.out.println("Не смогли определить число");
        }
    }

    public void ternary(int first) {
        int second = first > 10 ? 20 : 15;
    }
}
