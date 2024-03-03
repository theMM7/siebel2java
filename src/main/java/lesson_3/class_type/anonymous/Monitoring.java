package lesson_3.class_type.anonymous;

public class Monitoring implements SystemInterface {
    @Override
    public void start() {
        System.out.println("Система мониторинга стартовала");
    }
}
